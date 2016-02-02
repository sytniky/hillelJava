package org.hillel.lesson17;

import java.util.*;

/**
 * Created by yuriy on 01.02.16.
 */
public class Test {
    public static void main(String[] args) {

        int desiredSum = 5;
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(3);
        nums.add(3);
        nums.add(7);
        nums.add(12);
        nums.add(16);
        nums.add(1);
        nums.add(2);
        nums.add(4);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        for (Integer checkedNum : nums) {

            LinkedList<Integer> searchedNums =
                    getSearchedNums(checkedNum, desiredSum, nums);

            if (searchedNums != null && searchedNums.size() > 0) {
                System.out.println(checkedNum +
                        " + " + searchedNums + " = " + desiredSum);
            }
        }
    }

    public static LinkedList<Integer> getSearchedNums(int checkedNum,
                                                      int desiredSum,
                                                      LinkedList<Integer> nums) {

        LinkedList<Integer> results = new LinkedList<>();
        int firstNum = nums.getFirst();
        int lastNum = nums.getLast();
        int sumWithFirstNum = checkedNum + firstNum;
        int sumWithLastNum = checkedNum + lastNum;

        if (sumWithLastNum == desiredSum) {
            results.add(lastNum);
        } else if (sumWithFirstNum == desiredSum) {
            results.add(firstNum);
        } else if (sumWithLastNum < desiredSum
                || sumWithFirstNum > desiredSum
                || nums.size() <= 1) {
            return null;
        } else {

            int size = nums.size();

            LinkedList<Integer> firstPart = getSearchedNums(
                    checkedNum,
                    desiredSum,
                    new LinkedList<>(nums.subList(0, size / 2))
            );

            if (firstPart != null) {
                results.addAll(firstPart);
            }

            LinkedList<Integer> secondPart = getSearchedNums(
                    checkedNum,
                    desiredSum,
                    new LinkedList<>(nums.subList(size / 2, size))
            );

            if (secondPart != null) {
                results.addAll(secondPart);
            }
        }
        return results;
    }
}
