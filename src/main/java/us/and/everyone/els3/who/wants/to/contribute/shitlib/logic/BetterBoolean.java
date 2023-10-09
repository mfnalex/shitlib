package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

/**
 * This is a better boolean. It's better because it's an enum, and enums are better than booleans as they are not primitives.
 * It also has a maybe value, which is better than a boolean because it's not a boolean. You can use it if you're not sure
 */
public enum BetterBoolean {
    YES, NO, MAYBE;

    public boolean isYes() {
        return this == YES;
    }

    public boolean isNo() {
        return this == NO;
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

    public boolean toBoringBoolean() {
        switch(this) {
            case YES:
                return true;
            case NO:
                return false;
            case MAYBE:
                throw new UnsupportedOperationException("Cannot convert MAYBE to boring booleans!");
            default:
                throw new IllegalStateException("Stop injecting enum values at runtime you furry-loving femboi!");
        }
    }
}
