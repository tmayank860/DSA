package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobileNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        char[] arr=s.toCharArray();
        List<List<Character>> ls=new ArrayList<>();
        List<Character> cd=new ArrayList<>();
        comb(arr,arr.length,cd,0,ls);
        System.out.println(ls.size());
    }


    public static void comb(char[] candidates, int n, List<Character> cd, int idx,List<List<Character>> ls){
        if(idx==candidates.length){
            if(cd.size()==(n-2)&& !ls.contains(cd)){
                ls.add(new ArrayList<>(cd));
            }
            return;

        }
        cd.add(candidates[idx]);
        comb(candidates,n,cd,idx+1,ls);
        cd.remove(cd.size()-1);
        comb(candidates,n,cd,idx+1,ls);
        return;
    }
}
