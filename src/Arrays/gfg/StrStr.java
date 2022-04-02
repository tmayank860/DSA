package Arrays.gfg;

public class StrStr {
    public static void main(String[] args) {
        System.out.println(strstr("GeeksForGeeks","For"));
    }
     static int strstr(String s, String x)
    {
        // Your code here
        if(!s.contains(x)){
            return -1;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x.charAt(0)){
                int idx=0,inc=i;
                while(idx<x.length()){
                    if(s.charAt(inc)!=x.charAt(idx)){
                        break;
                    }
                    inc++;
                    idx++;
                }
                if(idx==x.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
