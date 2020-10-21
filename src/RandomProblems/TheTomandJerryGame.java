package RandomProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheTomandJerryGame {
        public static void main(String[] args)throws Exception {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            try {
                int t=Integer.parseInt(br.readLine());
                while (t-->0){
                  long TS=Long.parseLong(br.readLine());
                  while(TS%2!=1){
                      TS=TS/2;
                  }
                  System.out.println((TS-1)/2);
                }
            }catch (Exception ignored){

            }
    }
}
