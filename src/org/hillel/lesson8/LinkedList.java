package org.hillel.lesson8;

import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;

import java.util.*;

/**
 * Created by yuriy on 07.12.15.
 */
public class LinkedList implements List {

    private Node firstNode;
    private Node lastNode;
    private int size = 0;

    public Object getFirst() {
        if (firstNode == null)
            throw new NoSuchElementException();
        return firstNode.item;
    }

    public Object getLast() {
        if (lastNode == null)
            throw new NoSuchElementException();
        return lastNode.item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        linkLast(o);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node n = firstNode; n != null; n = n.next) {
                if (n.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node n = firstNode; n != null; n = n.next) {
                if (o.equals(n.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (Node n = firstNode; n != null; n = n.next) {
            sb.append(n.item + ",\n");
        }

        return "LinkedList{" +
                "list=[" + sb + "]" +
                ", size=" + size +
                '}';
    }

    private class Node {
        Object item;
        Node next;

        Node(Object o, Node n) {
            this.item = o;
            this.next = n;
        }
    }

    private void linkLast(Object o) {
        Node newNode = new Node(o, null);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            if (firstNode.next == null) {
                firstNode.next = newNode;
            } else {
                lastNode.next = newNode;
            }
        }
        lastNode = newNode;
        size++;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(new Dog(1, 2, 2.5, "grey", "Tusik", true));
        list.add(new Cat(2, 2, 0.5, "white", "Tishka", true));
        list.add(new Cat(3, 3, 0.52, "white", "Murka", true));
        list.add(new Cat(4, 3, 0.52, "white", "Murka33", true));

        System.out.println(list);

        System.out.println("size(): " + list.size());

        System.out.println("isEmpty(): " + list.isEmpty());

        System.out.println("indexOf(Object o): " + list.indexOf(new Cat(3, 3, 0.52, "white", "Murka", true)));

        System.out.println("contains(Object o): " + list.contains(new Cat(3, 3, 0.52, "white", "Murka", true)));

        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());
    }
}
