package us.and.everyone.els3.who.wants.to.contribute.shitlib.array.lists;

import java.util.*;
import java.util.stream.Collectors;

public class ShitList<ShItLIsT extends Object> implements List<ShItLIsT> {
    private ShItLIsT[] shitDATA = (ShItLIsT[]) new Object[0];


    @Override public int size() {
        return shitDATA.length;
    }

    @Override public boolean isEmpty() {
        return size() == 0;
    }

    @Override public boolean contains(Object o) {
        for (ShItLIsT shit : shitDATA) {
            if (shit.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override public Iterator<ShItLIsT> iterator() {
        return Arrays.stream(shitDATA).iterator();
    }

    @Override public ShItLIsT[] toArray() {
        return (ShItLIsT[]) new Object[0];
    }

    @Override public boolean add(Object o) {
        shitDATA = Arrays.copyOf(shitDATA, shitDATA.length + 1);
        shitDATA[shitDATA.length - 1] = (ShItLIsT) o;
        return true;
    }

    @Override public boolean remove(Object o) {
        for (int i = 0; i < shitDATA.length; i++) {
            if (shitDATA[i].equals(o)) {
                ShItLIsT[] tempShit = Arrays.copyOf(shitDATA, i - 1);
                ShItLIsT[] tempShit2 = Arrays.copyOfRange(shitDATA, i + 1, shitDATA.length);

                shitDATA = Arrays.copyOf(tempShit, tempShit.length + tempShit2.length);
                System.arraycopy(tempShit2, 0, shitDATA, 0, tempShit2.length);
                return true;
            }
        }

        return false;
    }

    @Override public boolean addAll(Collection c) {
        shitDATA = Arrays.copyOf(shitDATA, shitDATA.length + c.size());
        System.arraycopy(c.toArray(), 0, shitDATA, shitDATA.length - c.size(), c.size());

        return true;
    }

    @Override public boolean addAll(int index, Collection c) {
        return addAll(c);
    }

    @Override public void clear() {
        shitDATA = (ShItLIsT[]) new Object[0];
    }

    @Override public ShItLIsT get(int index) {
        return shitDATA[index];
    }

    @Override public ShItLIsT set(int index, ShItLIsT element) {
        ShItLIsT[] tempShit = Arrays.copyOfRange(shitDATA, index, shitDATA.length);
        ShItLIsT[] tempShit2 = Arrays.copyOfRange(shitDATA, 0, index - 1);

        shitDATA = Arrays.copyOf(tempShit, tempShit.length + 1);
        shitDATA[index] = element;
        System.arraycopy(tempShit2, 0, shitDATA, 0, tempShit2.length);

        return null;
    }

    @Override public void add(int index, ShItLIsT element) {
        set(index, element);
    }

    @Override public ShItLIsT remove(int index) {

        shitDATA = Arrays.copyOfRange(shitDATA, index + 1, shitDATA.length);
        ShItLIsT[] tempShit = Arrays.copyOfRange(shitDATA, 0, index);
        System.arraycopy(tempShit, 0, shitDATA, 0, tempShit.length);

        return null;
    }

    @Override public int indexOf(Object o) {

        for (int i = 0; i < shitDATA.length; i++) {
            if (shitDATA[i].equals(o)) {
                return i;
            }
        }
        return 0;
    }

    @Override public int lastIndexOf(Object o) {
        return indexOf(o);
    }

    @Override public ListIterator<ShItLIsT> listIterator() {
        return Arrays.stream(shitDATA).collect(Collectors.toList()).listIterator();
    }

    @Override public ListIterator<ShItLIsT> listIterator(int index) {
        return listIterator();
    }

    @Override public List<ShItLIsT> subList(int fromIndex, int toIndex) {
        return Arrays.stream(Arrays.copyOfRange(shitDATA, fromIndex, toIndex)).collect(Collectors.toList());
    }

    @Override public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("\uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9");
    }

    @Override public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("\uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9");
    }

    @Override public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("\uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9 \uD83D\uDCA9");
    }

    @Override public ShItLIsT[] toArray(Object[] a) {
        return (ShItLIsT[]) new Object[0];
    }
}
