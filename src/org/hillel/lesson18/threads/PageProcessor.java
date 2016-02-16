package org.hillel.lesson18.threads;

import java.util.Map;

/**
 * Created by yuriy on 10.02.16.
 */
public class PageProcessor implements Runnable {

    private String inPath, outPath;

    public PageProcessor(String inPath, String outPath) {
        this.inPath = inPath;
        this.outPath = outPath;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Map<String, Integer> map = WordProcessor.countWords(inPath);
//        Thread.yield();
        WordProcessor.saveWords(map, outPath);
    }
}
