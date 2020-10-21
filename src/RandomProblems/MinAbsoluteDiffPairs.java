package RandomProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinAbsoluteDiffPairs {
    public static void main(String[] args) {
List<Integer> numbers=new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        absMinDiffpair(numbers);
    }

    public static void absMinDiffpair(List<Integer> numbers) {
        int minDiff = Integer.MAX_VALUE;
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (Math.abs((numbers.get(i) - numbers.get(j))) < minDiff) {
                    minDiff = Math.abs((numbers.get(i) - numbers.get(j)));
//                    count++;
                }
    }
}
        Collections.sort(numbers);
        List<Integer> ls=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (ls.contains(numbers.get(i)-minDiff)){
                System.out.print(numbers.get(i)-minDiff);
                System.out.println(" "+ numbers.get(i));

                ls.add(numbers.get(i));
            }else {
                ls.add(numbers.get(i));
            }
        }
    }
}
