package com.julianscode.bigmachines.common;

import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * BigMachines logging functions.
 */
public class BMLog {
    private static final String LOGCHANNEL = "BigMachines";

    public static void log(Level level, String format, Object... data) {
        FMLLog.log(LOGCHANNEL, level, format, data);
    }

    public static void error(String format, Object... data) {
        log(Level.ERROR, format, data);
    }

    public static void debug(String format, Object... data) {
        log(Level.DEBUG, format, data);
    }

    public static void warning(String format, Object... data) {
        log(Level.WARN, format, data);
    }

    public static void info(String format, Object... data) {
        log(Level.INFO, format, data);
    }

}
