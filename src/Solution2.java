/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        int value = l1.val + l2.val;

        carry = value / 10;
        value = value % 10;
        ListNode answer = new ListNode(value);

        while (l1.next != null || l2.next != null) {

            if (l1.next != null) l1 = l1.next;
            else l1 = new ListNode(0);

            l2 = l2.next != null ? l2.next : new ListNode(0); //versão lambda? do que está acima

            value = l1.val + l2.val + carry;
            carry = value / 10;
            value = value % 10;
            answer.next = new ListNode(value);
            answer = answer.next;





        }

        return answer;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}