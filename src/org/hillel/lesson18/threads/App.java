package org.hillel.lesson18.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yuriy on 10.02.16.
 */
public class App {
    public static void main(String[] args) {

        String path
                = "/Users/yuriy/projects/java/MyHillelJava/src/org/hillel/lesson18/threads/";

//        for (int i = 1; i <= 3; i++) {
//            new Thread(
//                    new PageProcessor(
//                            path + "input" + i + ".txt",
//                            path + "output" + i + ".txt"
//                    )
//            ).start();
//        }

//        ExecutorService exec = Executors.newCachedThreadPool();
//        for (int i = 1; i <= 3; i++) {
//            exec.execute(new PageProcessor(
//                    path + "input" + i + ".txt",
//                    path + "output" + i + ".txt"
//            ));
//        }
//        exec.shutdown();

        ExecutorService exec = Executors.newFixedThreadPool(1);
        for (int i = 1; i <= 3; i++) {
            exec.execute(new PageProcessor(
                    path + "input" + i + ".txt",
                    path + "output" + i + ".txt"
            ));
        }
        exec.shutdown();

//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        for (int i = 1; i <= 3; i++) {
//            exec.execute(new PageProcessor(
//                    path + "input" + i + ".txt",
//                    path + "output" + i + ".txt"
//            ));
//        }
//        exec.shutdown();


        System.out.println("Start................................");
    }
}
