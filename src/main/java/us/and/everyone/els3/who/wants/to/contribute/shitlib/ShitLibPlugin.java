package us.and.everyone.els3.who.wants.to.contribute.shitlib;

import org.bukkit.plugin.java.JavaPlugin;
import us.and.everyone.els3.who.wants.to.contribute.shitlib.logging.ShittyLogger;

import java.util.logging.Logger;

public class ShitLibPlugin extends JavaPlugin {

    public static final Logger THE_GLOBAL_LOGGER = ShittyLogger.getLoggerForThisClazz();

    @Override
    public void onEnable() {
        THE_GLOBAL_LOGGER.info("ShitLib is enabled!");
    }
}
