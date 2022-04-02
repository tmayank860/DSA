package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReucrsionBasics {
    public static void main(String[] args) {
//        int[] arr={3,4,5,6};
//        reverse(arr,0,3);
//        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(5);
        arr.add(1);
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
//        ls.add(0,);
        System.out.println(palindrome("MAAM",0,3));
    }
    //Print n number
    public static void num(int n,int i)  {
        if (n+1==i){
            return;
        }
        System.out.println(i);
        num(n,i+1);
    }

    //Print n reverse number
    public static void numReverse(int n,int i)  {
        if (n+1==i){
            return;
        }
        numReverse(n,i+1);
        System.out.println(i);
    }

    //Sum of first n numbers
    public static int sum(int n,int sum){
        if (n<1){
            return sum;
        }
        return sum(n-1,sum+n);
    }
    public static int sumFun(int n){
        if (n<1){
            return 0;
        }
        return n+ sumFun(n-1);
    }

    //factorial
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //reverse an array

    public static void reverse(ArrayList<Integer> arr, int l, int r){
        if (l>=r){
            return;
        }
        swap(arr,l,r);
        reverse(arr,l+1,r-1);
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ops){
        int i=0;
        while (i!=ops.size()){
            reverse(arr,ops.get(i).get(0),ops.get(i).get(1));
            i++;
        }


        return arr;
    }

    //String is palindrome or not
    public static boolean palindrome(String s,int l,int r){
        if (l>=r){
            return true;
        }
        if (s.charAt(l)!=s.charAt(r)){
            return false;
        }
       return palindrome(s,l+1,r-1);
    }


    static void swap(ArrayList<Integer> arr, int l,int r){
        int temp=arr.get(l);
        arr.set(l,arr.get(r));
        arr.set(r,temp);
    }
}
