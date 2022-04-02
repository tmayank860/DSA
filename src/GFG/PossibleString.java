package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class PossibleString {
    public static void main(String[] args) {
        System.out.println(spaceString("abc"));
    }
    static ArrayList<String> spaceString(String str)
    {
        // Your code here
        ArrayList<String> ls=new ArrayList<String>();
        String s="";
        subset(0,str,ls,s);
        Collections.reverse(ls);
        return ls;
    }
    static void subset(int idx, String str, ArrayList<String> ls, String ds){
        if(idx==str.length()){
            String res=ds.trim();
            String temp=ds.replaceAll(" ","");
//            System.out.println("DS>>>"+ds+"TEMP>>"+temp);
            if(temp.length()>=str.length() && !ls.contains(ds)){
                ls.add(res);
            }
            return;
        }
        ds+=str.charAt(idx)+" ";
        subset(idx+1,str,ls,ds);
        ds=ds.substring(0,ds.length()-1);
        subset(idx+1,str,ls,ds);
    }
}
