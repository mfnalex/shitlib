package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

import us.and.everyone.els3.who.wants.to.contribute.shitlib.logging.ShittyLogger;

/**
 * This is a better boolean. It's better because it's an enum, and enums are better than booleans as they are not primitives.
 * It also has a maybe value, which is better than a boolean because it's not a boolean. You can use it if you're not sure
 */

// TODO: Remove below comment as I already added it -- mfnalex
// TODO: Add NOT_YET and NOT_ANYMORE, which both return true for isNo() and isNotYes() and false for isYes() and isNotNo() -- mfnalex
public enum BetterBoolean {
    /**
     * This is a yes value. It's basically {@link Boolean#TRUE}
     */
    YES,
    /**
     * This is a no value. It's basically {@link Boolean#FALSE}
     */
    NO,
    /**
     * This is a maybe value. Now you can see why BetterBooleans are better than Booleans, right?
     */
    MAYBE,

    /**
     * This is a not yet value. It's basically {@link Boolean#FALSE} but shows that it might become a YES later
     */
    NOT_YET,

    /**
     * This is a not anymore value. It's basically {@link Boolean#FALSE} but shows that it was yes once
     */
    NOT_ANYMORE;

    private static final ShittyLogger LOGGER = ShittyLogger.getLoggerForThisClazz();

    static {
        // TODO: Fix typo in log message -- mfnalex
        LOGGER.log("BetterBooleans are better than Booleans because they are not primitives, hence this class was now loaded and itialized.");
    }

    /**
     * Checks if this is YES
     */
    public boolean isYes() {
        return this == YES;
    }

    /**
     * Checks if this exactly no, but not NOT_YET or NOT_ANYMORE
     */
    public boolean isNo() {
        return this == NO;
    }

    public boolean isNotYet() {
        return this != NOT_YET;
    }

    public boolean isNotAnymore() {
        return this != NOT_ANYMORE;
    }

    /**
     * Checks if this is not YES but also not MAYBE
     */
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
