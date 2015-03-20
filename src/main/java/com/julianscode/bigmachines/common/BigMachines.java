package com.julianscode.bigmachines.common;

import com.julianscode.bigmachines.common.multiblock.block.BlockCrusherPart;
import com.julianscode.bigmachines.common.multiblock.item.ItemBlockCrusher;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = BigMachines.MODID, version = BigMachines.VERSION)

/**
 * Main Mod Class.
 */

public class BigMachines
{
    public static final String MODID = "bigmachines";
    public static final String VERSION = "1.0";
    public static final String RESOURCE_PATH = "/assets/bigmachines/";

    public static final String TEXTURE_NAME_PREFIX = "bigmachines:";

    public static BlockCrusherPart blockCrusherPart;
    /**
     * Initialization Event for BigMachines
     * @param event initialization parameters
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        registerCrusherPartBlocks();
        registerTileEntities();

    }

    /**
     * Registers all of the TileEntities used in BigMachines
     */
    public static void registerTileEntities() {

    }


    /**
     * Registers all crusher parts
     */
    public static void registerCrusherPartBlocks() {
        if(BigMachines.blockCrusherPart == null) {
            BigMachines.blockCrusherPart = new BlockCrusherPart(Material.iron);
            GameRegistry.registerBlock(BigMachines.blockCrusherPart, ItemBlockCrusher.class, "BRReactorPart");

            OreDictionary.registerOre("crusherCasing", BigMachines.blockCrusherPart.getCrusherCasingItemStack());
        }
    }
}
