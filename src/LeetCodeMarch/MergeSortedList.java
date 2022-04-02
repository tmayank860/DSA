package LeetCodeMarch;

public class MergeSortedList {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public static void main(String[] args) {


    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1=list1,c2=list2;
       ListNode newNode=new ListNode(-1);
       ListNode head =newNode;
       while (c1!=null&&c2!=null){
           if (c1.val<=c2.val){
               if (newNode==null){
                   newNode=c1;
                   c1=c1.next;
               }else {
                   newNode.next=c1;
                   c1=c1.next;
               }
           }else {
               if (newNode==null){
                   newNode=c2;
                   c2=c2.next;
               }else {
                   newNode.next=c2;
                   c2=c2.next;
               }
           }
           newNode=newNode.next;
       }
       if (c1!=null){
           newNode.next=c1;
       }else{
           newNode.next=c2;
       }
       return head.next;
    }
}
