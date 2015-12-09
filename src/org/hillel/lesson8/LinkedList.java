package org.hillel.lesson8;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by yuriy on 07.12.15.
 */
public class LinkedList implements Collection {

    private Node first;

    @Override
    public int size() {
        int size = 0;
        Node currentElement = first;
        while (currentElement != null) {
            currentElement = currentElement.getNext();
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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
        Node last = getLast();
        Node addedNode = new Node(o, null);
        if (last == null) {
            first = addedNode;
        } else {
            last.setNext(addedNode);
        }
        return true;
    }

    private Node getLast() {
        if (first == null) {
            return null;
        }
        Node currentElement = first;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
        }
        return currentElement;
    }

    @Override
    public boolean remove(Object o) {
        Node nodeToRemove = findFirstNode(o);
        if (nodeToRemove == null) {
            return false;
        }
        Node previousNode = findPreviousNode(nodeToRemove);


        return false;
    }

    private Node findPreviousNode(Node nodeToRemove) {
        if (first.equals(nodeToRemove)) {
            return null;
        }

        Node currenNode = first;
        if (currenNode == null) {
            return null;
        }
        while (currenNode.getNext() != null
                && !currenNode.getNext().equals(nodeToRemove)) {
            currenNode = currenNode.getNext();
        }
        return currenNode;
    }

    private Node findFirstNode(Object o) {
        Node currentNode = first;
        if (currentNode == null) {
            return null;
        }
        while (currentNode != null && !currentNode.getData().equals(o)) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
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
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        first = null;
    }
}
