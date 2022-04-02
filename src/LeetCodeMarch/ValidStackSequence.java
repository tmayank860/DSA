package LeetCodeMarch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ValidStackSequence {
    public static void main(String[] args) {
        int[]pushed = {2,1,0};
        int popped[] = {1,2,0};
        System.out.println(validateStackSequences(pushed,popped));
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
//        Collections.reverse(Arrays.asList(popped));
//        if ((Arrays.asList(pushed)).equals(Arrays.asList(popped))){
//            return true;
//        }
//        Collections.reverse(Arrays.asList(popped));
        int l=0, r=pushed.length,i=0,j=r-1;
        int[] resultPop=new int[r];
        Stack<Integer> st=new Stack<>();
       while (l<pushed.length){
           st.push(pushed[l]);
//           if (st.peek()==popped[r-l-1]){
//               resultPop[i++]=st.pop();
//           }else
               if (st.peek()==popped[i]){
               resultPop[i++]=st.pop();

           }
           l++;
       }
       while (!st.isEmpty()&&j>=0){
          resultPop[j--]= st.pop();
       }
       return  (Arrays.equals(resultPop,popped));
    }
}
