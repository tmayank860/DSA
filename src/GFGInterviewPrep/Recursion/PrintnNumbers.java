package GFGInterviewPrep.Recursion;

public class PrintnNumbers {
    public static void main(String[] args) {
        endToStart(5);
        System.out.println();
        startToEnd(5);
        System.out.println();
        startToEndWithK(15,1);
    }
    static void endToStart(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        endToStart(n-1);
    }
    static void startToEnd(int n){
        if (n==0){
            return;
        }
        startToEnd(n-1);
        System.out.print(n+" ");
    }
    static void startToEndWithK(int n,int k){
        if (n==0){
            return;
        }
        System.out.print(k+" ");
        startToEndWithK(n-1,k+1);

    }
}
