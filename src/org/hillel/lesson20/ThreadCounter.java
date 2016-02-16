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

//OUTPUT:
//        Thread: #0 value: 0
//        Thread: #1 value: 1
//        Thread: #2 value: 2
//        Thread: #0 value: 3
//        Thread: #1 value: 4
//        Thread: #2 value: 5
//        Thread: #0 value: 6
//        Thread: #1 value: 7
//        Thread: #2 value: 8
//        Thread: #0 value: 9
//        Thread: #1 value: 10
//        Thread: #2 value: 11
//        Thread: #0 value: 12
//        Thread: #1 value: 13
//        Thread: #2 value: 14
//        Thread: #0 value: 15
//        Thread: #1 value: 16
//        Thread: #2 value: 17
//        Thread: #0 value: 18
//        Thread: #1 value: 19
//        Thread: #2 value: 20
//        Thread: #0 value: 21
//        Thread: #1 value: 22
//        Thread: #2 value: 23
//        Thread: #0 value: 24
//        Thread: #1 value: 25
//        Thread: #2 value: 26
//        Thread: #0 value: 27
//        Thread: #1 value: 28
//        Thread: #2 value: 29
//        Thread: #0 value: 30
//        Thread: #1 value: 31
//        Thread: #2 value: 32
//        Thread: #0 value: 33
//        Thread: #1 value: 34
//        Thread: #2 value: 35
//        Thread: #0 value: 36
//        Thread: #1 value: 37
//        Thread: #2 value: 38
//        Thread: #0 value: 39
//        Thread: #1 value: 40
//        Thread: #2 value: 41
//        Thread: #0 value: 42
//        Thread: #1 value: 43
//        Thread: #2 value: 44
//        Thread: #0 value: 45
//        Thread: #1 value: 46
//        Thread: #2 value: 47
//        Thread: #0 value: 48
//        Thread: #1 value: 49
//        Thread: #2 value: 50
//        Thread: #0 value: 51
//        Thread: #1 value: 52
//        Thread: #2 value: 53
//        Thread: #0 value: 54
//        Thread: #1 value: 55
//        Thread: #2 value: 56
//        Thread: #0 value: 57
//        Thread: #1 value: 58
//        Thread: #2 value: 59
//        Thread: #0 value: 60
//        Thread: #1 value: 61
//        Thread: #2 value: 62
//        Thread: #0 value: 63
//        Thread: #1 value: 64
//        Thread: #2 value: 65
//        Thread: #0 value: 66
//        Thread: #1 value: 67
//        Thread: #2 value: 68
//        Thread: #0 value: 69
//        Thread: #1 value: 70
//        Thread: #2 value: 71
//        Thread: #0 value: 72
//        Thread: #1 value: 73
//        Thread: #2 value: 74
//        Thread: #0 value: 75
//        Thread: #1 value: 76
//        Thread: #2 value: 77
//        Thread: #0 value: 78
//        Thread: #1 value: 79
//        Thread: #2 value: 80
//        Thread: #0 value: 81
//        Thread: #1 value: 82
//        Thread: #2 value: 83
//        Thread: #0 value: 84
//        Thread: #1 value: 85
//        Thread: #2 value: 86
//        Thread: #0 value: 87
//        Thread: #1 value: 88
//        Thread: #2 value: 89
//        Thread: #0 value: 90
//        Thread: #1 value: 91
//        Thread: #2 value: 92
//        Thread: #0 value: 93
//        Thread: #1 value: 94
//        Thread: #2 value: 95
//        Thread: #0 value: 96
//        Thread: #1 value: 97
//        Thread: #2 value: 98
//        Thread: #0 value: 99
//
//        Process finished with exit code 0