package GFGInterviewPrep;

import java.util.Scanner;

public class FileName {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s=sc.next();
            if (!s.contains("xxx")){
                System.out.println("0");
            }else {
                int i=0,count=0;
                while (i<=n-3){
                    if (s.substring(i,i+3).equals("xxx")){
                        count++;
                        i+=1;
                    }else {
                        i++;
                    }
                }
                System.out.println(count);
            }

    }
}
