package us.and.everyone.els3.who.wants.to.contribute.shitlib;

import org.bukkit.plugin.java.JavaPlugin;
import us.and.everyone.els3.who.wants.to.contribute.shitlib.logging.ShittyLogger;
import us.and.everyone.els3.who.wants.to.contribute.shitlib.logic.BetterBoolean;

public class ShitLibPlugin extends JavaPlugin {

    private BetterBoolean hasShitLibAlreadyBeenEnabled = BetterBoolean.NO;

    public static final ShittyLogger THE_GLOBAL_LOGGER = ShittyLogger.getLoggerForThisClazz();

    @Override
    public void onEnable() {

        if(hasShitLibAlreadyBeenEnabled.isYes()) {
            throw new IllegalStateException("Cannot enable ShitLib twice");
        }

        hasShitLibAlreadyBeenEnabled = BetterBoolean.MAYBE;
        //💩 💩 💩 💩 💩 💩
        THE_GLOBAL_LOGGER.log("Shitlib has started its shitting 💩💩💩💩💩💩");
        hasShitLibAlreadyBeenEnabled = BetterBoolean.YES;
    }
}
