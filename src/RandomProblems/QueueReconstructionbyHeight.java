package RandomProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionbyHeight {
    public static void main(String[] args) {
        int[][] arr ={{7,0},{4,4},{7,1},{5,0},{5,2}};
        for(int[] i:reconstructQueue(arr)){
            System.out.print(Arrays.toString(i));
        }


    }
    public static int[][] reconstructQueue(int[][] people) {
        Comparator<int[]> c=new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
            }
        };
        Arrays.sort(people,c);
        List<int[]> ls=new ArrayList<>();
        for (int[] person : people) {
            ls.add(person[1], person);
        }
        return  ls.toArray(people);
    }
}
