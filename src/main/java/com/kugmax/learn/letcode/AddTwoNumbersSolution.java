package main.java.com.kugmax.learn.letcode;

//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.

//[7,1,8]

public class AddTwoNumbersSolution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultHead = null;
        ListNode tmp = null;
        int carry = 0;
        int i = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                carry = 1;
                sum %= 10;
            } else {
                carry = 0;
            }

            ListNode next = new ListNode(sum);
            if (i++ == 0) {
                resultHead = next;
                tmp = next;
            } else {
                tmp.next = next;
                tmp = tmp.next;
            }
        }

        if (carry == 1) {
            tmp.next = new ListNode(carry);
        }

        return resultHead;
    }

//    l1=[0,1]
//    l2=[0,1,2] l2=[0,1,2]

//    l1=[]
//    l2=[0,1]l2=[0,1]

//    l1=[9,9]
//l2=[1]l2=[1]

//    1 8   0

    public static void main(String[] s) {
        AddTwoNumbersSolution solution = new AddTwoNumbersSolution();

        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(8);
        l11.next = l12;


        ListNode l21 = new ListNode(0);

        ListNode result = solution.addTwoNumbers(l11, l21);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }

    }
}
