package Arrays.gfg;

public class MakeAnagram {
    public static void main(String[] args) {
        String s="dnsjbvhsvdshbvbshdbvsd",s1="vjbdshvsdkbvhsdkvcdsv";
        System.out.println(remAnagrams(s,s1));

    }
    static int remAnagrams(String s,String s1)
    {
        //add code here.
        int[] arr=new int [26];
        int count=0;
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)-'a']+=1;
            }
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']-=1;
            }
            for(int i=0;i<26;i++){
                if(arr[i]!=0){
                    count+=Math.abs(arr[i]);
                }
            }
        return count;
    }
}
