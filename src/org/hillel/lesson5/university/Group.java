package org.hillel.lesson5.university;

import java.util.Arrays;

/**
 * Created by yuriy on 18.11.15.
 */
public class Group {

    private String name;
    private Student[] students;

    public Group(String name, int initialSize) {
        this.name = name;
        this.students = new Student[initialSize];
    }

    public Group() {
        this("n/a", 5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group setStudents(Student[] students) {
        this.students = students;
        return this;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return i;
            }
        }

        int newSize = students.length + 1;
        Student[] newStudents = new Student[newSize];
        newStudents = Arrays.copyOf(students, newSize);
        newStudents[students.length] = student;
        students = newStudents;
        return students.length;
    }

    public int hasStudentWithSurname(String surname) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return -1;
            }
            if (surname.equals(students[i].getSurname())) {
                return i;
            }
        }
        return -1;
    }

    public Student getStudentWithSurname(String surname)
            throws NoSuchStudentException {
        int i = hasStudentWithSurname(surname);
        if (i == -1) {
            throw new NoSuchStudentException("Invalid surname");
        } else {
            return students[i];
        }
    }

    public void removeStudentWithSurname(String surname)
            throws NoSuchStudentException {
        int i = hasStudentWithSurname(surname);
        if (i == -1) {
            throw new NoSuchStudentException("Invalid surname");
        } else {
            for (int j = i; j < students.length - 1; j++) {
                students[j] = students[j + 1];
            }
            setStudents(trim(students));
        }
    }

    public Student[] trim(Student[] students) {
        Group group = new Group();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                group.addStudent(students[i]);
            }
        }
        return group.getStudents();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Group: " + getName() + "\n\t students:\n\t\t");
        for (Student student : this.students)
            if (student != null) {
                sb.append(student.toString() + "\n\t\t");
            }
        return sb.toString();
    }

    public static void main(String[] args) {

        try {

            Group group1 = new Group("A1", 3);
            group1.addStudent(new Student("Ivan", "Ivanov"));
            group1.addStudent(new Student("Petr", "Petrov"));
            group1.addStudent(new Student("Vasa", "Pupkin"));
            System.out.println(group1);

            String hasStudent = "Petrov";
            System.out.println("Checks student with surname '" + hasStudent + "': " +
                    group1.hasStudentWithSurname(hasStudent));

            String getStudent = "Petrov";
            System.out.println("Returns student with surname '" + getStudent + "':\n\t\t" +
                    group1.getStudentWithSurname(getStudent));

            Group group2 = new Group();
            group2.addStudent(new Student("Ivan2", "Ivanov2"));
            group2.addStudent(new Student("Petr2", "Petrov2"));
            group2.addStudent(new Student("Vasa2", "Pupkin2"));
            group2.addStudent(new Student("Ivan22", "Ivanov22"));
            group2.addStudent(new Student("Petr22", "Petrov22"));
            group2.addStudent(new Student("Vasa22", "Pupkin22"));
            System.out.println(group2);


            String delStudent = "Pupkin2";
            group2.removeStudentWithSurname(delStudent);
            System.out.println("Returns students of group: " + group2.getName()
                    + " after remove student '" + delStudent + "': \n\t\t");
            for (Student student : group2.getStudents()) {
                System.out.println("\t\t" + student);
            }

        } catch (NoSuchStudentException e) {
            System.err.println(e.getMessage());
//            e.printStackTrace(System.err);
        }

    }
}
