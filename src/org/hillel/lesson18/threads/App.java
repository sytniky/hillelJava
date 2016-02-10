package org.hillel.lesson18.threads;

/**
 * Created by yuriy on 10.02.16.
 */
public class App {
    public static void main(String[] args) {

        String path
                = "/Users/yuriy/projects/java/MyHillelJava/src/org/hillel/lesson18/threads/";

        for (int i = 1; i <= 3; i++) {
            new Thread(
                    new PageProcessor(
                            path + "input" + i + ".txt",
                            path + "output" + i + ".txt"
                    )
            ).start();
        }
        System.out.println("Start................................");
    }
}
