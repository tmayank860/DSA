package RandomProblems;

public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }
    public static boolean isPowerOfTwo(int n) {
if (n==-2147483648){
    return false;
}
    return (n!=0) && ((n&(n-1))==0);
    }
//
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && (n == 1 || (n%2 == 0 && isPowerOfTwo(n/2)));
//    }
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && (int) Math.pow(2, (int) (Math.log10(n) / Math.log10(2))) == n;
//    }
//    public boolean isPowerOfTwo(int n) {
//        return n > 0 && Integer.bitCount(n) == 1;
//    }
//      if (n <= 0) return false;
//        while (n % 2 == 0) n /= 2;
//        return n == 1;
//}
}
