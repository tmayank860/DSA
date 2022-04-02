package LeetCodeMarch;

public class RemoveDuplicateFromSortedList {
    public class ListNode {
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

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.val == head.next.val) {
            return null;
        }
        if (head.val != head.next.val) {
            return head;
        }
        ListNode newHead = new ListNode(-1);
        ListNode newCurrent = newHead;
        ListNode c = head.next, p = head, n = head.next.next;
        while (n != null) {
            if (c.val == p.val && c.val == n.val || c.val == p.val) {
                continue;
            }
            if (newHead == null) {
                newCurrent = c;
            } else {
                newCurrent.next = c;
            }
            c = c.next;
            p = p.next;
            n = n.next;
            newCurrent = newCurrent.next;
        }
        return newHead;
    }
}
