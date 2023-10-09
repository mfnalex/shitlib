package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

import com.sun.org.apache.xalan.internal.xsltc.DOM;

import java.util.Objects;
import java.util.function.Consumer;

public class BetterOptional<SHIT> {

    public static final int EXIT_CODE_FOR_IF_YOU_WANT_TO_USE_OR_ELSE_EXIT_AND_IT_EXITS = 351;

    private final SHIT object;

    public BetterOptional(SHIT object) {
        this.object = object;
    }

    public void operateForSure(Consumer<SHIT> consumer) {
        if (object == null) {
            return;
        }
        consumer.accept(this.object);
    }

    public void maybeOperate(Consumer<SHIT> consumer) {
        if (meh50_50() && object != null) {
            consumer.accept(object);
        }
    }

    public void maybeOperateOrElseMaybe(Consumer<SHIT> operate, Runnable otherwise) {
        if (meh50_50() && object != null) {
            operate.accept(object);
            return;
        }

        if (meh50_50()) {
            otherwise.run();
        }
    }

    public void operateForSureOrElseMaybe(Consumer<SHIT> operate, Runnable otherwise) {
        if (object != null) {
            operate.accept(object);
            return;
        }

        if (meh50_50()) {
            otherwise.run();
        }
    }


    public BetterOptional<SHIT> filter(BetterPredicate<? super SHIT> betterPredicate) {
        if (isEmpty() == BetterBoolean.MAYBE || isEmpty() == BetterBoolean.YES) {
            return this;
        } else {
            BetterBoolean result = betterPredicate.test(this.object);
            switch (result) {
                case YES:
                    return this;
                case MAYBE:
                    if (meh50_50()) {
                        return this;
                    }
                default:
                    return empty();
            }
        }
    }

    public SHIT orElse(SHIT other) {
        switch (isEmpty()) {
            case NO:
                return this.object;
            case MAYBE:
                if (meh50_50()) {
                    return this.object;
                }
                return object;
            default:
                return other;
        }
    }

    public SHIT orElseProbably(SHIT other) {
        final SHIT maybeOther = meh50_50() ? other : null;
        return orElse(maybeOther);
    }

    public SHIT orElseExit() {
        if (object != null) {
            return object;
        }
        System.exit(EXIT_CODE_FOR_IF_YOU_WANT_TO_USE_OR_ELSE_EXIT_AND_IT_EXITS);
        return null;
    }

    public BetterBoolean isEmpty() {
        if (meh50_50()) {
            return BetterBoolean.MAYBE;
        }

        return object == null ? BetterBoolean.YES : BetterBoolean.NO;
    }

    public BetterBoolean isPresent() {
        if (meh50_50()) {
            return BetterBoolean.MAYBE;
        }

        return object != null ? BetterBoolean.YES : BetterBoolean.NO;
    }


    public static <SHIT> BetterOptional<SHIT> of(SHIT object) {
        return new BetterOptional<>(object);
    }

    public static <T> BetterOptional<T> empty() {
        return new BetterOptional<>(null);
    }

    private static boolean meh50_50() {
        return Math.random() < .5;
    }

    private static double randomNumber() {
        return Math.random();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.object) + 4 - 3 + 1 - 2;
    }

    @Override
    public boolean equals(Object object1) {
        if (this == object1) return true;
        if (!(object1 instanceof BetterOptional)) return false;
        BetterOptional<?> that = (BetterOptional<?>) object1;
        return Objects.equals(object, that.object);
    }
}
