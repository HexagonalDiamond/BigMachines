package com.julianscode.bigmachines.common.multiblock.block;

import com.julianscode.bigmachines.common.BigMachines;
import com.julianscode.bigmachines.common.multiblock.tileentity.TileEntityBigMachinePart;
import com.julianscode.bigmachines.common.multiblock.tileentity.TileEntityBigMachinePartBase;
import com.julianscode.hexcore.multiblock.rectangular.PartPosition;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Any part of a BigMachine.
 */
public class BlockBigMachinePart extends BlockContainer {


    // Metadata for all of the different crusher blocks

    public static final int METADATA_CASING = 0;
    public static final int METADATA_GLASS = 1;
    public static final int METADATA_CRUSHER = 2;
    public static final int METADATA_SPEED = 3;

    /**
     * Names for each type of metadata
     */
    private static String[] _subBlocks = new String[] { "casing",
            "controller"
    };

    /**
     * States for each type of block
     */
    private static String[][] _states = new String[][] {
            {"default", "face", "corner", "eastwest", "northsouth", "vertical"}, // Casing
            {"off", "idle", "active"} 		// Controller
    };

    /**
     * Stores icons for blocks
     */
    private IIcon[][] _icons = new IIcon[_states.length][];

    public BlockBigMachinePart(Material material) {
        super(material);
        setStepSound(soundTypeMetal);
        setHardness(2.0f);
        setBlockName("blockCrusherPart");
        setBlockTextureName(BigMachines.TEXTURE_NAME_PREFIX + "blockCrusherPart");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Icon for each side of block
     */
    public IIcon getIcon(IBlockAccess blockAccess, int x, int y, int z, int side) {
        IIcon icon = null;
        int metadata = blockAccess.getBlockMetadata(x,y,z);

        switch(metadata) {
            case METADATA_CASING:
                icon = getCasingIcon(blockAccess, x, y, z, side);
                break;
        }

        return icon != null ? icon : getIcon(side, metadata);
    }

    
    /**
     * Helper to get casing item
     * @return casing item
     */
    public ItemStack getCrusherCasingItemStack() {
        return new ItemStack(this, 1, METADATA_CASING);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        switch(metadata) {
            default:
                return new TileEntityBigMachinePart();
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        String prefix = BigMachines.TEXTURE_NAME_PREFIX + getUnlocalizedName() + ".";

        for(int metadata = 0; metadata < _states.length; ++metadata) {
            String[] blockStates = _states[metadata];
            _icons[metadata] = new IIcon[blockStates.length];

            for(int state = 0; state < blockStates.length; state++) {
                _icons[metadata][state] = par1IconRegister.registerIcon(prefix + _subBlocks[metadata] + "." + blockStates[state]);
            }
        }

        this.blockIcon = par1IconRegister.registerIcon(BigMachines.TEXTURE_NAME_PREFIX + getUnlocalizedName());
    }

    private static final int DEFAULT = 0;
    private static final int FACE = 1;
    private static final int CORNER = 2;
    private static final int EASTWEST = 3;
    private static final int NORTHSOUTH = 4;
    private static final int VERTICAL = 5;

    
    /**
     * Get icon for casing
     */
    private IIcon getCasingIcon(IBlockAccess blockAccess, int x, int y, int z, int side) {
        TileEntity te = blockAccess.getTileEntity(x, y, z);
        if(te instanceof TileEntityBigMachinePart) {
            TileEntityBigMachinePart part = (TileEntityBigMachinePart)te;
            PartPosition position = part.getPartPosition();
//            Multiblock reactor = part.getReactorController();
                return _icons[METADATA_CASING][DEFAULT];
        }
        return _icons[METADATA_CASING][DEFAULT];
    }
}
