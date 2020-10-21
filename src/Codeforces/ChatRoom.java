package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder result= new StringBuilder();
        int i=0;
        while (i<s.length()){
            if (s.charAt(i)=='h') {
                if (!result.toString().contains("h")) {
                    result.append("h");
                }
            }else if(s.charAt(i)=='e'){
                    if (!result.toString().contains("e")){
                        result.append("e");
                    }
                }else if(s.charAt(i)=='l'){
                    if (!result.toString().contains("l")){
                        result.append("l");
                    }else if(result.charAt(result.length()-1)=='l'&& !result.toString().contains("ll")){
                        result.append("l");
                    }
                }else if (s.charAt(i)=='o'){
                    if (!result.toString().contains("o")){
                        result.append("o");
                    }
                }
            i++;
            }
        if (result.toString().equals("hello")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
