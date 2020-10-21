package GFGInterviewPrep;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int d=sc.nextInt();
        int Misha=Math.max((3*a)/10,(a-(a/250)*c));
        int Vasya=Math.max((3*b)/10,(b-(b/250)*d));
        if (Misha==Vasya){
            System.out.println("Tie");
        }else {
            String result=Misha>Vasya?"Misha":"Vasya";
            System.out.println( result);
        }
    }
}
