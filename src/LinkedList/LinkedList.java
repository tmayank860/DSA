package LinkedList;

public class LinkedList {
    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) throws Exception {
        LinkedList ls = new LinkedList();
        ls.insertAtLast(12);
        ls.insertAtLast(21);
        ls.insertAtLast(43);
        ls.insertAtLast(54);
//        ls.display();
//        System.out.println(ls.head.data + " " + ls.tail.data);
        ls.insertAtBeginning(12);
        ls.insertAtBeginning(15);
        ls.insertAtBeginning(17);
        ls.insertAtBeginning(19);
//        ls.display();
        ls.insertInBetween(1, 21);
//        ls.display();
        ls.insertAfter(ls.head.next.next, 11);
//        ls.display();
//        System.out.println(ls.getMiddle(ls.head));
        ls.display();
        System.out.println(ls.deleteLast().data);
        ls.display();


//        System.out.println(ls.head.data + " " + ls.tail.data);
    }

    //
    public void display() {
        System.out.println("----------------------------------------------");
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println(size);
        System.out.println("----------------------------------------------");

    }

//    Insert at end of the linked list

    public void insertAtLast(int item) {
        Node new_node = new Node();
        new_node.data = item;
        new_node.next = null;
        if (head == null) {
            head = new_node;
            tail = new_node;
            size++;
            return;
        }
        tail.next = new_node;
        tail = new_node;
        size++;
//        Node current=head;
//        while (current.next!=null){
//            current=current.next;
//        }
//        current.next=new_node;
    }

//    Insert at the beginning of the linked list

    public void insertAtBeginning(int item) {
        Node new_node = new Node();
        new_node.data = item;
        new_node.next = null;
        if (head == null) {
            head = new_node;
            tail = new_node;
            size++;
            return;
        }
        new_node.next = head;
        head = new_node;
        size++;

    }

//    Insert in the between of the Linked List

    public void insertInBetween(int pos, int item) throws Exception {
        if (pos <= 0 || pos > size) {
            throw new Exception("Invalid index");
        }
        Node new_node = new Node();
        new_node.data = item;
        new_node.next = null;
        int count = 1;
        Node current = head;
        while (count < pos) {
            current = current.next;
            count++;
        }
        new_node.next = current.next;
        current.next = new_node;
        size++;

    }

//    Insert after a given node

    public void insertAfter(Node c_node, int item) {
        if (c_node == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node new_node = new Node();
        new_node.data = item;
        new_node.next = c_node.next;
        c_node.next = new_node;
        size++;
    }

//    get middle element

    public int getMiddle(Node head) {
        // Your code here.
        int count = 0;
        Node current = head;
        Node fast = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        current = head;
        int mid = 0;

        while (mid < count / 2) {
            current = current.next;
            mid++;
        }
        return current.data;

    }

//    Delete first Node

    public Node deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp;

    }

//   Get node at a given position

    public Node getNodeAt(int pos) throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid node position");
        }
        Node current = head;
        int indx = 1;
        while (indx <= pos) {
            current = current.next;
            indx++;
        }
        return current;
    }
    //    Delete Last Node

    public Node deleteLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("LinkedList is empty");
        }

        if (size == 1) {
            tail = null;
            head = null;
            size--;
        } else {
            Node second_last = getNodeAt(size - 2);
            this.tail = second_last;
            tail.next = null;
            size--;
        }
        return tail;
    }

    public Node deleteNode(int x) {
        // Your code here
        if (head == null) {
            return null;
        }
        if (x == 1) {
            head = head.next;
            return head;
        }
        Node current = head;
        int count = 1;
        while (count < x - 1) {
            current = current.next;
            count++;

        }
        current.next = current.next.next;
        return head;
    }

}
