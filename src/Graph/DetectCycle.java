package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> bfs=new ArrayList<>();
        int[] visited=new int[numCourses+1];
        Arrays.fill(visited,0);
        Queue<Integer> q =new LinkedList<>();
        q.add(0);
        visited[0]=1;
        while (!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for (Integer ad:prerequisites[node]){
                if (visited[ad]==0){
                    visited[ad]=1;
                    q.add(ad);
                }else if (visited[ad]==1){
                    return false;
                }
            }

        }
        return true;
    }
}
