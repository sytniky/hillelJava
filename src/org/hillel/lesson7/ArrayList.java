package org.hillel.lesson7;

import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;

import java.util.Arrays;

/**
 * Created by yuriy on 03.12.15.
 */
public class ArrayList {

    private Object[] list;
    private int size;

    public ArrayList() {
        this.size = 0;
        this.list = new Object[0];
    }

    public ArrayList(int initialCapacity) {
        this.size = 0;
        if (initialCapacity >= 0) {
            this.list = new Object[initialCapacity];
        } else {
            throw new RuntimeException("Invalid val of initialCapacity");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return find(o) != -1;
    }

    public int find(Object o) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(Object o) {
        Object[] newList = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        newList[size] = o;
        list = newList;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        int index = find(o);
        if (index != -1) {
            return remove(index);
        }
        return false;
    }

    public boolean remove(int index) {
        validateIndex(index);
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
        return true;
    }

    public boolean addAll(ArrayList input) {
        boolean additionResult = false;
        for (int i = 0; i < input.size(); i++) {
            additionResult = this.add(input.get(i));
        }
        return additionResult;
    }

    public Object get(int i) {
        if (i < size && i >= 0) return list[i];
        else throw new IndexOutOfBoundsException();
    }

    public void clear() {
        this.size = 0;
        this.list = new Object[0];
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Dog(1, 2, 2.5, "grey", "Tusik", true));
        list.add(new Cat(2, 2, 0.5, "white", "Tishka", true));

        System.out.println(list);

        System.out.println("size(): " + list.size());

        System.out.println("isEmpty(): " + list.isEmpty());

        System.out.println("contains(Object object): " +
                list.contains(new Cat(2, 2, 0.5, "white", "Tishka", true)));

        System.out.println("add(Object object): " +
                list.add(new Dog(3, 1, 1.5, "black", "Barsik", true)));

        System.out.println("remove(Object object): " +
                list.remove(new Cat(2, 2, 0.5, "white", "Tishka", true)));

        System.out.println(list);

        System.out.println("size(): " + list.size());

        ArrayList list2 = new ArrayList();
        list2.add(new Dog(4, 5, 2.52, "grey", "Bob", true));
        list2.add(new Cat(5, 3, 0.52, "white", "Murka", true));

        System.out.println("addAll(ArrayList list): " +
                list.addAll(list2));

        System.out.println(list);

        list.clear();

        System.out.println(list);

        list.add(new Cat(1, 3, 0.52, "white", "Murka", true));

        System.out.println(list);
    }
}
