package org.hillel.lesson18.threads;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by yuriy on 10.02.16.
 */
public class WordProcessor {

    public static Map<String, Integer> countWords(String inPath) {

        Map<String, Integer> map = new HashMap<>();

        try (
                Scanner scanner = new Scanner(
                        new BufferedReader(
                                new FileReader(inPath)
                        )
                )
        ) {
            while (scanner.hasNext()) {
                String scannedStr = scanner.next();
                Integer count = map.get(scannedStr);
                int result = count == null ? 1 : count + 1;
                System.out.println(scannedStr + "=" + result + " file: " + inPath);
                map.put(scannedStr, result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void saveWords(Map<String, Integer> map, String outPath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outPath))) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry + " file: " + outPath);
                if (entry.getValue() > 3) {
                    writer.write(entry.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
