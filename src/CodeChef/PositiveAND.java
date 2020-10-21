package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveAND {
    public static int op=0;
    public static ArrayList<Integer> ls;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            ls=new ArrayList<>();
            op=0;
            printAllRecursive(n, arr, n);
            if (ls.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
    public static void printAllRecursive(int n, int[] elements, int delimiter) {

        if(n == 1) {
          if (op==1){
              return;
          }
          printArray(elements,delimiter);

        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }
    }
    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
    private static void printArray(int[] input,int n) {
        int flag=1;
        for (int i=0;i<n-1;i++){
           int x=input[i]&input[i+1];
           if (x<=0){
               flag=-1;
               break;
           }
        }
        if (flag==1) {
            op=1;

            for (int i = 0; i < input.length; i++) {
                ls.add(input[i]);
                System.out.print(input[i]+" ");
            }
        }
    }
}
