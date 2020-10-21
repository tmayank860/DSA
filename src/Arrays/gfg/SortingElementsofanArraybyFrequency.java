package Arrays.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortingElementsofanArraybyFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input1 = br.readLine();
            int n = Integer.parseInt(input1);
            int[] arr = new int[n];
            String a = br.readLine();
            int v = 0;
            StringTokenizer ex = new StringTokenizer(a);
            while (ex.hasMoreTokens()) {
                arr[v] = Integer.parseInt(ex.nextToken());
                v++;
            }
            HashMap<Integer,Integer> hm=new HashMap<>();
            for (int i=0;i<n;i++){
                if (hm.containsKey(arr[i])){
                    hm.put(arr[i],hm.get(arr[i])+1);
                }else {
                    hm.put(arr[i],1);
                }
            }
            ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            for (Map.Entry<Integer,Integer> var:list){
                int frequency=var.getValue();
                while (frequency>=1){
                    System.out.print(var.getKey()+" ");
                    frequency--;
                }
            }
            System.out.println();

        }
    }
}
