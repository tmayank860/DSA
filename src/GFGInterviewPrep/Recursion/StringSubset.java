package GFGInterviewPrep.Recursion;

public class StringSubset {
    public static void main(String[] args) {
stringSubset("ab","",0);
    }
    public static void stringSubset(String s,String result,int indx){
if (indx==s.length()){
    System.out.println(result);
    return;
}
        stringSubset(s,result,indx+1);
        stringSubset(s,result+s.charAt(indx),indx+1);
    }
}
