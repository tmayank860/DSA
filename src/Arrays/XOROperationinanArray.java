package Arrays;

public class XOROperationinanArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
    public static int xorOperation(int n, int start) {
        int x=start;
        for (int i=1;i<n;i++){
            x=x^(start+2*i);
        }
        return x;
    }
}
