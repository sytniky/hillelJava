package org.hillel.lesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by yuriy on 16.02.16.
 */
public class ThreadCounter implements Runnable {

    private static ReentrantLock lock = new ReentrantLock();
    private int threadCount;
    private int threadNum;
    private ArraySample array;

    public ThreadCounter(int threadCount, int threadNum, ArraySample array) {
        this.threadCount = threadCount;
        this.threadNum = threadNum;
        this.array = array;
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (!array.hasNext()) { return; }

                if (array.getIndex() % threadCount == threadNum) {
                    int value = array.next();
                    System.out.println("Thread: #" + threadNum + " value: " + value);
                }

            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ArraySample arraySample = new ArraySample(100);
        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(new ThreadCounter(3, 0, arraySample));
        exec.execute(new ThreadCounter(3, 1, arraySample));
        exec.execute(new ThreadCounter(3, 2, arraySample));

        exec.shutdown();
    }
}

class ArraySample {

    private int index = 0;
    private int size;
    private int[] array;

    public ArraySample(int size) {

        this.size = size;
        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
    }

    public boolean hasNext() {
        return index < size;
    }

    public int getIndex() {
        return index;
    }

    public int next() {
        return array[index++];
    }
}
