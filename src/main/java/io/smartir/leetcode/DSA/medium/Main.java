package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(Arrays.toString(set.getDatas()));
        System.out.println(set.insert(2));
        System.out.println(Arrays.toString(set.getDatas()));
        System.out.println(set.insert(3));
        System.out.println(set.insert(4));
        System.out.println(set.insert(5));
        System.out.println(set.insert(11));
        System.out.println(set.insert(9));
        System.out.println(set.insert(7));
        System.out.println(set.insert(6));
        System.out.println(set.insert(1));
        System.out.println(set.insert(156));
        System.out.println(set.insert(7563));
        System.out.println(Arrays.toString(set.getDatas()));
        System.out.println(set.remove(4));
        System.out.println(Arrays.toString(set.getDatas()));
        System.out.println(set.getRandom());
    }
}
