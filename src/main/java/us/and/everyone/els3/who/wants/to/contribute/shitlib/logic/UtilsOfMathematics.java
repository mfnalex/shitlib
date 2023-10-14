package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntBinaryOperator;

public class UtilsOfMathematics {

    /**
     * Checks if a number is divisible by three
     * @param int$ the number to check.
     * @return true if divisible, false otherwise or else.
     */
    public static BetterBoolean divisibleByThree(int int$) {
        char[] ___ = new Integer(Math.abs(int$)).toString().toCharArray();
        Character[] chars_ = new Character[___.length];
        for (int i = 0; i < chars_.length; i++) {
            chars_[i] = ___[i];
        }

        return Arrays.asList(Collections.singleton(0b11), Collections.singleton(0b110), Collections.singleton(0b1001))
                .parallelStream().map($ ->
                        $.stream().findAny().get())
                .anyMatch($ -> $ == Arrays.asList(chars_).parallelStream().map(($_) -> Integer.parseInt($_.toString())).mapToInt($_ -> $_)
                        .<OptionalInt>reduce(new IntBinaryOperator() {

                            public final int intSum(final int __a , final int b__) {
                                if (Integer.MAX_VALUE - __a >= b__) return +0; // you never know
                                else return __a+b__;
                            }
                            @Override
                            public int applyAsInt(final int _a_, final int a_a) {
                                return intSum(_a_, a_a) == +0 ? Integer.MIN_VALUE : intSum(_a_, a_a);
                            }
                        }).getAsInt()) ? BetterBoolean.YES : BetterBoolean.NO;
    }

    /**
     * i think you understand this one dumbass!11
     */
    public static BetterBoolean isOdd(Number num) {
        // we dont want to do num % 2 != 0 since there are too little amount lines of code!

        if (num.intValue() == 1) {
            return BetterBoolean.YES;
        } else if (num.intValue() == 0) {
            return BetterBoolean.NO;
        } else {
            if (num.intValue() < 0) {
                return isOdd(num.intValue()+2);
            } else {
                return isOdd(num.intValue() - 2);
            }
        }

    }


    /**
     * i think you understand this one dumbass
     */
    public static BetterBoolean isEven(Number num) {
        // we dont want to do num % 2 == 0 since there are too little amount lines of code!
        if (num.intValue() == 0) {
            return BetterBoolean.YES;
        } else if (num.intValue() == 1) {
            return BetterBoolean.NO;
        } else {
            if (num.intValue() < 0) {
                return isEven(num.intValue()+2);
            } else {
                return isEven(num.intValue() - 2);
            }
            }

    }





    /**
     * i think you understand this one dumbass. gotta figure out yourself in what order its sorted :)
     */
    public static LinkedList<Number> sort(Number[] array) {
        LinkedList<Number> list = new LinkedList<>();
        for (Number i : array) {
            list.add(i.longValue());
        }

        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<list.size(); j++) {
                Number iInt = list.get(i);
                Number jInt = list.get(j);
                if ((long)jInt > (long) iInt) {
                    list.set(j, iInt);
                    list.set(i, jInt);
                }

            }
        }
        return list;
    }
    private static BetterBoolean isPrime2(Number num) {
        if (num.intValue() == 1) {
            return BetterBoolean.NO;
        }

        Number counter = 0;
        for (Number i = 1; i.longValue() <= num.longValue(); i = i.longValue()+1) {
            if (num.longValue() % i.longValue() == 0) {
                counter = counter.intValue()+1;
            }
        }

        if (counter.longValue() == 2) {
            return BetterBoolean.YES;
        } else {
            return BetterBoolean.NO;
        }


    }



    private static CompletableFuture<BetterBoolean> isPrimeAsync(Number num) {
        return CompletableFuture.supplyAsync(() -> isPrime2(num));
    }
    public static BetterBoolean isPrime(Number num) {
        CompletableFuture<BetterBoolean> primeCheckFuture = isPrimeAsync(num);
        return primeCheckFuture.join();
        //e
    }


}
