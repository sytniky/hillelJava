package org.hillel.lesson13;

import java.util.Random;

/**
 * Created by yuriy on 14.01.16.
 */
public class CustomHashMap {

    public static final int MAX_SIZE = 100;
    Entry[] table = new Entry[MAX_SIZE];

    public void put(Object key, Object value) {
        Entry entry = new Entry(key, value);
        int index = key.hashCode() % MAX_SIZE;
        if (table[index] == null) {
            table[index] = entry;
        } else {
            Entry currentEntry = table[index];
            while (currentEntry.next != null) {
                currentEntry = currentEntry.next;
            }
            currentEntry.next = entry;
        }
    }

    public Object get(Object key) {
        int index = key.hashCode() % MAX_SIZE;
        Entry currentEntry = table[index];
        while (!currentEntry.key.equals(key)) {
//            System.out.println(currentEntry.key
//                    + " | hashCode: " + currentEntry.key.hashCode()
//                    + " | index: " + currentEntry.key.hashCode() % MAX_SIZE);
            currentEntry = currentEntry.next;
        }
        return currentEntry.value;
    }

    private class Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Random rand = new Random(47);
        CustomHashMap hashMap = new CustomHashMap();
        Dog[] dogs = new Dog[10000];

        // Если ключи эквивалентны, но заданы разные значения для них,
        // то получаем всегда значение записанное самым первым в однонаправленный связный список
//        for (int i = 0; i < dogs.length; i++) {
//            int num = rand.nextInt(3);
//            int value = rand.nextInt(10);
//            Dog dog = new Dog(num, "Bob" + num);
//
//            System.out.println(dog + " | value: " + value + " | hashCode: " + dog.hashCode());
//
//            hashMap.put(dog, value);
//            System.out.println(dog + " | received value: " + hashMap.get(dog));
//        }

        for (int i = 0; i < dogs.length; i++) {

            int value = rand.nextInt(10);
            Dog dog = new Dog(i, "Bob" + i);
//            System.out.println(dog + " | value: " + value + " | hashCode: " + dog.hashCode());
            hashMap.put(dog, value);
//            System.out.println(dog + " | received value: " + hashMap.get(dog));

            dogs[i] = dog;
        }

        Dog rDog = dogs[8000];

        long start = System.currentTimeMillis();
        int rVal = (int) hashMap.get(rDog);
        System.out.println("Received dog from array: " + rDog);
        System.out.println("Received value of dog from HashMap: " + rVal);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }
}

class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        return !(name != null ? !name.equals(dog.name) : dog.name != null);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
//       return 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
