package CodeStuudioInterviewEx;

import java.util.PriorityQueue;

public class CombineRopes {
    public static void main(String[] args) {
        int[] arr = {14, 10, 18, 14, 5, 8, 15};
        System.out.println(connectRopes(arr));
    }

    public static long connectRopes(int[] arr) {
        //Write your code here
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for (int i = 0; i < arr.length; i++) {
            pq.add((long) arr[i]);
        }
        long sum=0;
        while (pq.size() != 1) {
            long top1 = pq.poll();
            long top2 = pq.poll();
            pq.add(top1 + top2);
            sum+=top1+top2;
        }
        return sum;
    }
}
