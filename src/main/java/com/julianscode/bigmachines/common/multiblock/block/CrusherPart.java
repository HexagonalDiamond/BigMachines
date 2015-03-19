package com.julianscode.bigmachines.common.multiblock.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Any part of a BigCrusher.
 */
public class CrusherPart extends BlockContainer {

    public static final int METADATA_CASING = 0;
    public static final int METADATA_GLASS = 1;
    public static final int METADATA_CRUSHER = 2;
    public static final int METADATA_SPEED = 3;

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        switch(metadata) {
            default:
                return new TileEntityReactorPart();
        }
    }
}
