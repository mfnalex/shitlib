package us.and.everyone.els3.who.wants.to.contribute.shitlib.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class UtilsOfMathematics {

    public static BetterBoolean isOdd(Integer num) {

        if (num == 1) {
            return BetterBoolean.YES;
        } else if (num == 0) {
            return BetterBoolean.NO;
        } else {
            if (num < 0) {
                return isOdd(num+2);
            } else {
                return isOdd(num - 2);
            }
        }

    }


    public static BetterBoolean isEven(Integer num) {
        if (num == 0) {
            return BetterBoolean.YES;
        } else if (num == 1) {
            return BetterBoolean.NO;
        } else {
            if (num < 0) {
                return isEven(num+2);
            } else {
                return isEven(num - 2);
            }
            }

    }

    public static LinkedList<Integer> sort(int[] array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer i : array) {
            list.add(i);
        }

        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<list.size(); j++) {
                Integer iInt = list.get(i);
                Integer jInt = list.get(j);
                if (jInt > iInt) {
                    list.set(j, iInt);
                    list.set(i, jInt);
                }

            }
        }
        return list;
    }




    public static LinkedList<Long> sort(long[] array) {
        LinkedList<Long> list = new LinkedList<>();
        for (long i : array) {
            list.add(i);
        }

        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j<list.size(); j++) {
                Long iInt = list.get(i);
                Long jInt = list.get(j);
                if (jInt > iInt) {
                    list.set(j, iInt);
                    list.set(i, jInt);
                }

            }
        }
        return list;
    }


}
