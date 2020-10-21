package GFGInterviewPrep;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] rooms = new long[n];
        long[] letters = new long[m];
        long total_room=0;
        for (int i = 0; i < n; i++) {
            rooms[i] =sc.nextLong();

        }
        for (int i = 0; i < m; i++) {
            letters[i] = sc.nextLong();
        }
        long sum=0;
        int j=1;
        for (int i=0;i<m;i++){
           while (letters[i]>sum+rooms[j-1]){
               sum+=rooms[j-1];
               j=j+1;
           }

                System.out.println((j)+" "+(letters[i]-sum));


        }

    }

}
