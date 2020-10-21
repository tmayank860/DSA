package Mathematics;

public class AdditionUnderModulo {
    public static void main(String[] args) {
//        System.out.println(sumUnderModulo(2500000, 2346775));
        System.out.println(fact(5));
    }

    public static long sumUnderModulo(long a, long b) {
        int M = 1000000007;
        // Your code here, return sum of a and b
        return ((a % M + b % M) % M);

    }

    public int absolute(int I) {
        // Your code here
//        return Math.abs(I);
        return I >= 0 ? I : -1 * I;

    }

    public static int digitsInFactorial(int N) {
        //Your code here
        String s = Long.toString(fact(N));
        return s.length();
    }

    public static long fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }


}
