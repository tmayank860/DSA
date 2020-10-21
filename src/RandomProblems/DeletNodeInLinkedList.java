package RandomProblems;

class ListNode{
    int data;
    ListNode next;
        }

public class DeletNodeInLinkedList {
    public static void main(String[] args) {

    }
    public void deleteNode(ListNode node) {
        node.data=node.next.data;
        node=node.next.next;
    }
}
