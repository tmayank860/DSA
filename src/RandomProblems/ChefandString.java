package RandomProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefandString {
        public static void main(String[] args) {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            try {
                int t=Integer.parseInt(br.readLine());
                while (t-->0){
                    String s=br.readLine();
                    int count=0;
                    int i=0;
                    while (i<s.length()-1){
                        if (s.charAt(i)=='x'&&s.charAt(i+1)=='y'||s.charAt(i)=='y'&&s.charAt(i+1)=='x'){
                            count++;
                            i+=2;
                        }else{
                            i++;
                        }

                    }
                    System.out.println(count);
                }
            }catch (Exception ignored){

            }
    }
}
