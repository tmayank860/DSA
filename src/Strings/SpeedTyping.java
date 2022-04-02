package Strings;

import java.util.Arrays;

public class SpeedTyping {
    public static void main(String[] args) {
        System.out.println(replace("Ilovecoding","IIllovecoding",0));
    }
    public static int replace(String input,String output,int count){
        if (input.equals(output)){
            return 0;
        }
        int[] in=new int[57];
        int[] out=new int[57];
        if (output.matches(".*[0-9].*")){
            return -1;
        }
        for (int i=0;i<input.length();i++){
            int x=(input.charAt(i)-'A');
            in[input.charAt(i)-'A']=in[input.charAt(i)-'A']+1;
        }
        for (int i=0;i<output.length();i++){
            out[output.charAt(i)-'A']=out[output.charAt(i)-'A']+1;
        }
        for (int i=0;i<53;i++){
            if (in[i]==0&&out[i]>0||in[i]>0&&out[i]==0||Character.isDigit(in[i])){
                return -1;
            }
            count+=out[i]-in[i];
        }
        System.out.println("Input"+Arrays.toString(in));
        System.out.println("Out"+Arrays.toString(out));
        return count;
    }
}
