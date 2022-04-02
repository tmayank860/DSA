package Arrays.gfg;

public class RomanToInt {
    public static void main(String[] args) {
        String s="LVIII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int n=s.length(),res=0,current=0,next=0,pos=0;
        while (pos<n){
            if (pos==n-1){
                res+=getValue(s.charAt(pos));
                return res;
            }
            current=getValue(s.charAt(pos));
            next=getValue(s.charAt(pos+1));
            if (current>=next){
                res=res+current;
                pos++;
            }else {
                res=res+next-current;
                pos+=2;
            }
        }
        return res;
    }
    public static int getValue(char c){
        switch(c)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return -1;
        }
    }
}
