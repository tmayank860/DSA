package LeetCodeJuly;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LeetCodeJuly {
    public static void main(String[] args) {

//        System.out.println(arrangeCoins(10));
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int current=-1,temp=x,flag=0;
            while(current!=x){
                current=(temp+k)%n;
                if(current==y){
                    flag=1;
                    break;
                }
                temp=current;
            }
            if(flag==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
    public static int arrangeCoins(int n) {
        int i=1;
        while (n>=i){
            n=n-i;
            i++;
        }
        return i-1;
    }
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                                 int x) {
        // add your code here
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        int i=0,j=0;
        Iterator<Integer> itr1=head1.iterator();
        while(itr1.hasNext()){
            hs.add(itr1.next());
            i++;
        }
        Iterator<Integer> itr2=head2.iterator();
       while (itr2.hasNext()){
           if (hs.contains(x-itr2.next())){
               count++;
           }
       }
       return count;
    }
}
