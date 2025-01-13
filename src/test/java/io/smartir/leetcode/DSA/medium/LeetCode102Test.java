package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode102Test {

    @Test
    public void levelOrder() {
        //given
        LeetCode102 underTest = new LeetCode102();
        Integer[] given = {3, 9, 20, null, null, 15, 17,18,19,20,78,96,85};
        TreeNode head = TreeNode.createBinaryTree(given);
        //when
        List<List<Integer>> result = underTest.levelOrder(head);
        //then
        System.out.println(result);
    }
    @Test
    public void levelOrder2() {
        //given
        LeetCode102 underTest = new LeetCode102();
        Integer[] given = {3};
        TreeNode head = TreeNode.createBinaryTree(given);
        //when
        List<List<Integer>> result = underTest.levelOrder(head);
        //then
        System.out.println(result);
    }

}