package RandomProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChefandIcecream {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            int t=Integer.parseInt(br.readLine());
            while (t-->0){
                int countFive=0,countTen=0,countfif=0, flag=0;
               int n=Integer.parseInt(br.readLine());
               int[] arr=new int[n];
               String[] s=br.readLine().split(" ");
               for (int i=0;i<n;i++){
                   arr[i]=Integer.parseInt(s[i]);
               }
               if (arr[0]!=5){
                   System.out.println("NO");
//                   break;
               }else {
                   countFive = 1;
                   for (int i = 1; i < n; i++) {
                       if (arr[i] == 5) {
                           countFive++;
                       } else if (arr[i] == 10 && countFive > 0) {
                           countFive--;
                           countTen++;
                       } else if (arr[i] == 15) {
                           if (countTen > 0) {
                               countTen--;
                               countfif++;
                           } else if (countFive >= 2) {
                               countFive -= 2;
                               countfif++;
                           } else {
                               flag = 1;
                           }
                       } else {
                           flag = 1;
                       }

                   }
                   if (flag == 1) {
                       System.out.println("NO");
                   } else if(flag==0){
                       System.out.println("YES");
                   }
               }
               flag=0;
            }
        }catch (Exception ignored){

        }
    }
}
