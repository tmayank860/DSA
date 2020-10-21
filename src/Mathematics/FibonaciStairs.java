package Mathematics;

import java.util.Scanner;

public class FibonaciStairs {
    public static void main(String[] args) {
        int a0=0,a1=1,nwxtterm=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1){
            System.out.println(a0);
        }
       else if (n==2){
            System.out.println(a0);
            System.out.println(a1+" "+a1);

        }else {
            System.out.println(a0);
            System.out.println(a1+" "+a1);
            a0=1;
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <=i; j++) {
                    nwxtterm = a0 + a1;
                    System.out.print(nwxtterm + " ");
                    a0 = a1;
                    a1 = nwxtterm;
                }
                System.out.println();
            }
        }



    }

}
