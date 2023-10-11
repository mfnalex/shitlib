package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

import us.and.everyone.els3.who.wants.to.contribute.shitlib.logging.ShittyLogger;

public enum BetterBoolean {
    YES,
    NO,
    MAYBE,
    NOT_YET,
    NOT_ANYMORE;

    private static final ShittyLogger LOGGER = ShittyLogger.getLoggerForThisClazz();

    static {
        LOGGER.log("BetterBooleans are better than Booleans because they are not primitives, hence this class was now loaded and itialized.");
    }

    public boolean isYes() {
        return this == YES;
    }

    public boolean isNo() {
        return this == NO;
    }

    public boolean isNotYet() {
        return this == NOT_YET;
    }

    public boolean isNotAnymore() {
        return this == NOT_ANYMORE;
    }

    public boolean isNoOrNotYetOrNotAnymore() {
        return !isYes() && !isMaybe();
    }

    public boolean isMaybe() {
        return this == MAYBE;
    }

    public boolean isNotYes() {
        return this != YES;
    }

    public boolean isNotNo() {
        return this != NO;
    }

    public boolean isNotMaybe() {
        return this != MAYBE;
    }

    public static BetterBoolean fromBoringBoolean(boolean bool) {
        return bool ? YES : NO;
    }

    public static BetterBoolean fromBoringBoolean(boolean bool, BetterBoolean canBecomeYESLaterOnIfCurrentlyNO) {
        if(bool) return YES;
        if(canBecomeYESLaterOnIfCurrentlyNO.isYes()) {
            return NOT_YET;
        } else if (canBecomeYESLaterOnIfCurrentlyNO.isNo()){
            return NO;
        } else {
            throw new IllegalArgumentException("canBecomeYESLaterOnIfCurrentlyNO must be YES or NO");
        }

    }

    public boolean toBoringBoolean() {
        switch(this) {
            case YES:
                return true;
            case NO:
            case NOT_ANYMORE:
            case NOT_YET:
                return false;
            case MAYBE:
                throw new UnsupportedOperationException("Cannot convert MAYBE to boring booleans!");
            default:
                throw new IllegalStateException("Stop injecting enum values at runtime you furry-loving femboi!");
        }
    }
}
