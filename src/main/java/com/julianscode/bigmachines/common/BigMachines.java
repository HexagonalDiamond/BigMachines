package com.julianscode.bigmachines.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = BigMachines.MODID, version = BigMachines.VERSION)

/**
 * Main Mod Class.
 */

public class BigMachines
{
    public static final String MODID = "bigmachines";
    public static final String VERSION = "1.0";

    /**
     * Initialization Event for BigMachines
     * @param event initialization parameters
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
