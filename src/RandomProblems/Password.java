package RandomProblems;

public class Password {
    public static void main(String[] args) {
System.out.print(newPassword("aceg","bdfhijk"));
    }
    public static String newPassword(String a,String b){
        int i=0,j=0;
        String result="";
        while (i<a.length()&&j<b.length()){
            result=result+a.charAt(i++)+b.charAt(j++);
        }
        if (i<a.length()){
            result=result+a.substring(i,a.length());
        }else {
            result=result+b.substring(j,b.length());
        }
        return result;
    }
}
