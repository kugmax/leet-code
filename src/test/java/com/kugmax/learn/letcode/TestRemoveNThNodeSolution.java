package com.kugmax.learn.letcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kugmax.learn.letcode.RemoveNThNodeSolution.ListNode;
import org.junit.jupiter.api.Test;

public class TestRemoveNThNodeSolution {

    @Test
    public void test() {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        RemoveNThNodeSolution solution = new RemoveNThNodeSolution();

        System.out.println(solution.toString(node_1));

        ListNode actual = solution.removeFromBack(node_1, 2);

        assertEquals("1->2->3->5", solution.toString(actual));
    }

    @Test
    public void test_2_nodes() {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);

        node_1.next = node_2;

        RemoveNThNodeSolution solution = new RemoveNThNodeSolution();

        System.out.println(solution.toString(node_1));

        ListNode actual = solution.removeFromBack(node_1, 2);

        assertEquals("2", solution.toString(actual));
    }

    @Test
    public void test_1_nodes() {
        ListNode node_1 = new ListNode(1);

        RemoveNThNodeSolution solution = new RemoveNThNodeSolution();

        System.out.println(solution.toString(node_1));

        ListNode actual = solution.removeFromBack(node_1, 1);

        assertEquals("", solution.toString(actual));
    }

    @Test
    public void test_last_remove() {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);

        node_1.next = node_2;

        RemoveNThNodeSolution solution = new RemoveNThNodeSolution();

        System.out.println(solution.toString(node_1));

        ListNode actual = solution.removeFromBack(node_1, 1);

        assertEquals("1", solution.toString(actual));
    }
}
