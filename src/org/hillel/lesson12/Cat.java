package org.hillel.lesson12;

/**
 * Created by yuriy on 14.01.16.
 */
public class Cat {
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return !(name != null ? !name.equals(cat.name) : cat.name != null);

    }

}
