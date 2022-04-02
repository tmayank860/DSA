package CodeStuudioInterviewEx;

public class NextPerm {
    public static void main(String[] args) {
        long n= 32453;
        System.out.println(findSuccessor(n));
    }
    public static long findSuccessor(long n) {
        // Write your code here.
        String s=n+"";
        char[] ch=s.toCharArray();
        if(ch.length<=1){
            return -1;
        }
        int i;
        for(i=ch.length-2;i>=0;i--){
            if(ch[i]<ch[i+1]){
                break;
            }
        }
        if(i<0){
            return -1;
        }
        int nextG=ch.length-1;
        for(int j=ch.length-1;j>i;j--){
            if(ch[j]>ch[i]){
                nextG=j;
                break;
            }
        }
        swap(ch,i,nextG);
        reverse(ch,i+1,ch.length-1);
        return Integer.parseInt( String.valueOf(ch));
    }
    static void swap(char[] ch,int i, int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    static void reverse(char[] ch, int l,int r){
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }

    }
}
