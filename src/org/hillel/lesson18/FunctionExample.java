package org.hillel.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuriy on 04.02.16.
 */
public class FunctionExample {

    public Number method(List<? extends Number> list) {
        Number n = list.get(0);
        return n;
    }

    public static void main(String[] args) {
        FunctionExample fe = new FunctionExample();
        Number result = fe.method(new ArrayList<>(Arrays.asList(1, 2)));
        System.out.println(result);
    }
}
