package com.kugmax.learn.letcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveNThNodeSolution {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
            val = x;
        }
    }

//    Given linked list: 1->2->3->4->5, and n = 2.
//    After removing the second node from the end, the linked list becomes 1->2->3->5.

    public ListNode removeFromBack(ListNode head, int n) {
        Map<Integer, ListNode> memory = new HashMap<>();

        ListNode loop = head;
        int i = 0;
        while (loop != null) {
            memory.put(++i, loop);
            loop = loop.next;
        }

        int toRemoveIndx = i - n + 1;

        ListNode left  = memory.get(toRemoveIndx - 1);
        ListNode right = memory.get(toRemoveIndx + 1);

        if (left == null) {
            return right;
        }

        if (right == null) {
            left.next = null;

            return head;
        }

        left.next = right;

        return head;
    }

    public ListNode _removeFromBack(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

    public String toString(ListNode list) {
        if (list == null) {
            return "";
        }

        StringBuilder result = new StringBuilder().append(list.val);

        int i = 0;
        ListNode loop = list.next;
        while (loop != null && i <= 6) {
            result.append("->" ).append(loop.val);
            loop = loop.next;
            i++;
        }

        return result.toString();
    }
}
