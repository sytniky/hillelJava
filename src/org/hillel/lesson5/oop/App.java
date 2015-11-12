package org.hillel.lesson5.oop;

/**
 * Created by yuriy on 12.11.15.
 */
public class App {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Ivan";
//        student.surname = "Ivanov";
        student.setName("Ivan");
        student.printInfo();

//        Student student2 = new Student("Petr", "Petrov");
//        student2.printInfo();
    }
}
