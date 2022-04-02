package LeetCodeMarch;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("ecbacba"));
    }
    public static String removeDuplicateLetters(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        String str="";
        for(int i=0;i<s.length();i++){

            while (!str.isEmpty()&&s.charAt(i)<str.charAt(str.length()-1)&&(!str.contains(s.charAt(i)+"")&&hm.get(str.charAt(str.length()-1))>0)) {
               char x=str.charAt(str.length()-1);
                if (str.length() == 1) {
                    str = "";
                } else {
                    str = str.substring(0,str.length()-1);
                }
            }
            if (!str.contains(s.charAt(i)+"")) {
                str = str + s.charAt(i);
            }

                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);

        }
        return str;
    }
}
