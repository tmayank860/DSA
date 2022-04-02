package LinkedList;

public class LLImplementation {
    class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        LLImplementation ll = new LLImplementation();
        ll.insertNodeAtLast(3);
        ll.insertNodeAtFirst(2);
        ll.insertNodeAtFirst(1);
        ll.insertNodeAtFirst(1);
        ll.insertNodeAtFirst(1);
//        ll.insertNodeAtFirst();
//        ll.insertNodeAtLast();
        ll.display();
//        ll.deleteFirstNode();
//        ll.display();
//        ll.deleteLastNode();
//        ll.display();
//        ll.deleteGivenNode(3);
//        ll.display();
//        ll.insertNodeInBetween(45, 3);
//        ll.display();
//        ll.head= ll.swapPairs(ll.head);
        ll.deleteDuplicates(ll.head);
        ll.display();
    }

    public void display() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }

    public void insertNodeAtFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.next = null;
            return;
        }
        node.next = head;
        head = node;

    }
    public Node deleteDuplicates(Node head) {
        if (head==null ||head.next==null){
            return head;
        }
        Node prev=new Node(-1);
        Node newHead=prev;
        while (head!=null) {
            if (head.next != null && head.data == head.next.data) {
                while (head.next != null && head.data == head.next.data) {
                    head = head.next;
                }
                prev.next = head.next;
            }
            else {
                prev=prev.next;
            }
            head=head.next;
        }
        return newHead.next;
    }
    public Node swapPairs(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head.next;
        Node newHead = swapPairs(head.next.next);
        head.next=newHead;
        temp.next=head;
        return temp;
    }

    public void insertNodeAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.next = null;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.next = null;
    }

    public void insertNodeInBetween(int data, int n) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.next = null;
            return;
        }
        Node current = head;
        int i = 1;
        while (i++ < n && current.next != null) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = node;
        node.next = temp;
    }

    public void deleteFirstNode() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteGivenNode(int n) {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node current = head;
        int i = 1;
        while (++i < n && current.next != null) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void reverseIterative() {
        if (head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while (currentNode!=null){
           Node nextNode=currentNode.next;
    //reverse the pointer of current node
           currentNode.next=prevNode;
           //update the node
           prevNode=currentNode;
           currentNode=nextNode;
        }
        head.next=null;

        head=prevNode;

    }

    public Node reverseRecursive(Node head) {
        if (head==null||head.next==null){
            return head;
        }
        Node  NN=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return NN;
    }

}
