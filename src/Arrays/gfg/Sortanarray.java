package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sortanarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while (t-->0){
            int n=Integer.parseInt(br.readLine());
            String s=br.readLine().trim();
            int c0=0,c1=0,c2=0;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    c0++;
                }else if (s.charAt(i)=='1'){
                    c1++;
                }else if (s.charAt(i)=='2'){
                    c2++;
                }
            }
            StringBuilder result= new StringBuilder();
            while (c0>0){
                result.append("0 ");
                c0--;
            }
            while (c1>0){
                result.append("1 ");
                c1--;
            }
            while (c2>0){
                result.append("2 ");
                c2--;
            }
            System.out.println(result);
        }
    }
}
