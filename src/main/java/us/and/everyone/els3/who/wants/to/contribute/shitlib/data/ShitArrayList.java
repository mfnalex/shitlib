package us.and.everyone.els3.who.wants.to.contribute.shitlib.data;

import java.lang.reflect.Array;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShitArrayList<SHIT> {
    private SHIT[] shit;
    private Class<SHIT> shitType;
    private int currShitSize;
    private int currIdx;
    private Lock shitLock = new ReentrantLock();

    public ShitArrayList(Class<SHIT> shitType, int initialShitSize) {
        shit = (SHIT[]) Array.newInstance(shitType, initialShitSize);
        this.shitType = shitType;
        currShitSize = initialShitSize;
    }

    public void addShit(SHIT shit) {
        shitLock.lock();

        if (currIdx + 1 > currShitSize) {
            resize();
        }

        this.shit[currIdx + 1] = shit;
        currIdx++;

        shitLock.unlock();
    }

    public SHIT removeShitFromBack() {
        shitLock.lock();

        SHIT shit = this.shit[currIdx];
        this.shit[currIdx] = null;
        currIdx--;

        shitLock.unlock();

        return shit;

    }

    public void setShit(int i, SHIT shit) throws ArrayIndexOutOfBoundsException {
        if (i > currIdx) {
            throw new ArrayIndexOutOfBoundsException("stupid fucking idiot");
        }

        shitLock.lock();
        this.shit[i] = shit;
        shitLock.unlock();
    }

    public void unsetShit(int i) throws ArrayIndexOutOfBoundsException {
        if (i > currIdx) {
            throw new ArrayIndexOutOfBoundsException("stupid fucking idiot");
        }

        shitLock.lock();
        shit[i] = null;
        shitLock.unlock();
    }

    public SHIT getShit(int i) throws ArrayIndexOutOfBoundsException {
        if (i > currIdx) {
            throw new ArrayIndexOutOfBoundsException("stupid fucking idiot");
        }

        shitLock.lock();
        SHIT shit = this.shit[i];
        shitLock.unlock();
        return shit;
    }

    private void resize() {
        currShitSize *= 2;
        SHIT[] newShit = (SHIT[]) Array.newInstance(shitType, currShitSize);
        System.arraycopy(shit, 0, newShit, 0, shit.length);
        shit = newShit;
    }
}
