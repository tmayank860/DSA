package GFGInterviewPrep.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
System.out.println(fib(5));
    }
    static int fib(int n){
//        Shorter Way
//        if(n<=1){
//            return n;
//        }
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
