package Arrays;

import java.util.ArrayList;

public class Arrangement {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        A.add(5);
        A.add(3);
        A.add(2);
        A.add(6);
        A.add(1);
        A.add(4);
        B.add(0);
        B.add(1);
        B.add(2);
        B.add(0);
        B.add(3);
        B.add(2);
        System.out.println(arrange(A,B,6));
    }
//    5 3 2 6 1 4
//            0 1 2 0 3 2
   static ArrayList<Integer> arrange(ArrayList<Integer> A, ArrayList<Integer> B, int n)
    {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int h=A.get(i);
            int pos=B.get(i);
            int j=0;
            if(pos==0){
                while(!res.isEmpty()&&j< res.size()&&res.get(j)<h){
                    j++;
                }
                res.add(h);
                if (j<res.size()){
                    int temp = res.get(res.size()-1);

                    //make a loop to run through the array list
                    for(int s = res.size()-1; s >=j; s--)
                    {
                        res.set(s,res.get(s-1));
                    }
                    res.set(j, temp);
                }
            }else{
                while(pos--!=0&&res.get(j)>h){
                    j++;
                }
                res.add(h);
                if (j<res.size()){
                    int temp = res.get(res.size()-1);

                    //make a loop to run through the array list
                    for(int s = res.size()-1; s >=j; s--)
                    {
                        res.set(s,res.get(s-1));
                    }
                    res.set(j, temp);
                }
            }
        }
        return res;
    }
}
