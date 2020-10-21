package RandomProblems;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CircularLLSoldierSelection {
    static class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int d=Integer.parseInt(br.readLine());
System.out.println(selectedSoldier(n,m,d));
    }
    public static int selectedSoldier(int n,int m,int d){
        Node head = new Node(1);
        Node prev = head;
        if (d==0) {
            for (int i = 2; i <= n; i++) {
                prev.next = new Node(i);
                prev = prev.next;
            }
        }else{
            for (int i = n; i >= 2; i--) {
                prev.next = new Node(i);
                prev = prev.next;
            }
        }
        prev.next = head;


        Node ptr1 = head, ptr2 = head;
        while(ptr1.next != ptr1)
        {


            int count = 1;
            while(count != m)
            {
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                count++;
            }

            ptr2.next = ptr1.next;
            ptr1 = ptr2.next;
        }
        return ptr1.data;

    }
}
