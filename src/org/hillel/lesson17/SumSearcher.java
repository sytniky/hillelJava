package org.hillel.lesson17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by yuriy on 03.02.16.
 */
public class SumSearcher {

    private int target;
    LinkedList<Integer> list = null;
    Map<Integer, Integer> results = null;

    public SumSearcher(LinkedList<Integer> list, int target) {
        this.list = list;
        this.target = target;
        results = new HashMap<>();
    }

    public void setList(LinkedList<Integer> list) {
        this.list = list;
        resetResults();
    }

    public void setTarget(int target) {
        this.target = target;
        resetResults();
    }

    public void resetResults() {
        if (results.size() > 0) {
            results = new HashMap<>();
        }
    }

    public Map<Integer, Integer> searchSum() {

        if (list.size() > 1) {
            int first = list.getFirst();
            int last = list.getLast();

            if (first + last > target) {
                list.removeLast();
            } else if (first + last < target) {
                list.removeFirst();
            } else {
                results.put(first, last);
                list.removeFirst();
            }
            searchSum();
        }
        return results;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        System.out.println(list);

        SumSearcher searcher = new SumSearcher(list, 9);
        System.out.println(searcher.searchSum());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(11);
        list2.add(1);
        list2.add(1);
        list2.add(259);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(8);
        list2.add(1);
        list2.add(45);
        list2.add(1);
        list2.add(1);

        searcher.setList(list2);
        searcher.setTarget(12);
        System.out.println(searcher.searchSum());
    }
}
