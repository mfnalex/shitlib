package us.and.everyone.els3.who.wants.to.contribute.shitlib.logging;

import java.util.MissingResourceException;
import java.util.logging.Logger;

public class ShittyLogger extends Logger {

    protected ShittyLogger(String name) {
        super("[SHITLIB] " + name, null);
    }

    public static ShittyLogger getLoggerForThisClazz() {
        return new ShittyLogger(new LinkageError().getStackTrace()[2].getClassName());
    }

}
