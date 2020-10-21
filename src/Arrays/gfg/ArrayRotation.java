package Arrays.gfg;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int D=sc.nextInt();
        int N=sc.nextInt();
        int [] a=new int[N];
        for (int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        StringBuffer s = new StringBuffer();
        for(int i=D; i<N; i++ )
        {
            s.append(a[i]+" ");
        }
        for(int i=0;i<D;i++)
        {
            s.append(a[i]+" ");
        }
        System.out.println(s);
    }
}
