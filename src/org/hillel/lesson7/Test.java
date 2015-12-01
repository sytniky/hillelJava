package org.hillel.lesson7;

/**
 * Created by yuriy on 01.12.15.
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // true Интермирование (Здесь используется метод String.intern()
                                      // не тривиальный подход, срабатывает java оптимизатор
                                      // и java сравнивает два стринга которые оказываются равны)
        System.out.println(s1 == s3); // false Здесь сравниваются ссылки на объекты,
                                      // и так как ссылки ссылаются на разные объекты,
                                      // то результат будет false
    }
}
