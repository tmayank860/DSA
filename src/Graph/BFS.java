package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        GraphImp graphImp=new GraphImp();
        int V = 5;
        ArrayList<ArrayList<Integer>> adjList
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<Integer>());
        graphImp.addVertex(adjList, 0, 1);
        graphImp.addVertex(adjList, 0, 4);
        graphImp.addVertex(adjList, 1, 2);
        graphImp.addVertex(adjList, 1, 3);
        graphImp.addVertex(adjList, 1, 4);
        graphImp.addVertex(adjList, 2, 3);
        graphImp.addVertex(adjList, 3, 4);
        System.out.println(adjList);
        System.out.println("BFS"+bfsOfGraph(V,adjList));
    }
    static ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adjList){
        ArrayList<Integer> bfs=new ArrayList<>();
        int[] visited=new int[V+1];
        Arrays.fill(visited,0);
        Queue<Integer> q =new LinkedList<>();
        q.add(0);
        visited[0]=1;
        while (!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for (Integer ad:adjList.get(node)){
                if (visited[ad]==0){
                    visited[ad]=1;
                    q.add(ad);
                }
            }

        }
        return bfs;
    }
}
