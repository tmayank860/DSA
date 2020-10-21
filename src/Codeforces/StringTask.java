package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s=br.readLine();
            String result="";
            int i=0;
            while (i<s.length()){
                if (s.charAt(i)!='A'&&s.charAt(i)!='a'&&s.charAt(i)!='O'&&s.charAt(i)!='o'
                        &&s.charAt(i)!='y'&&s.charAt(i)!='Y'&&s.charAt(i)!='E'&&s.charAt(i)!='e'&&
                        s.charAt(i)!='U'&&s.charAt(i)!='u'&&s.charAt(i)!='I'&&s.charAt(i)!='i'){
                    if (s.charAt(i)>64&&s.charAt(i)<91){
                        char c=s.charAt(i);
                        c= (char) (c+32);
                        result=result+"."+c;
                        i++;
                    }else {
                        result=result+"."+s.charAt(i);
                        i++;
                    }
                }else {
                    i++;
                }
            }
            System.out.println(result);
    }
}
