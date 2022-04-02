package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphImp {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adjList
                = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<Integer>());

        // Adding edges one by one
        int[][] adj=new int[6][6];
//        adjMatrix(adj, 0, 1);
//        adjMatrix(adj, 0, 4);
//        adjMatrix(adj, 1, 2);
//        adjMatrix(adj, 1, 3);
//        adjMatrix(adj, 1, 4);
//        adjMatrix(adj, 2, 3);
//        adjMatrix(adj, 3, 4);
        addVertex(adjList, 0, 1);
        addVertex(adjList, 0, 4);
        addVertex(adjList, 1, 2);
        addVertex(adjList, 1, 3);
        addVertex(adjList, 1, 4);
        addVertex(adjList, 2, 3);
        addVertex(adjList, 3, 4);
        System.out.println(adjList);
        System.out.println(Arrays.toString(adj));
    }

    //Adjacency MATRIX
    static void adjMatrix(int[][] adj,int u,int v){
        adj[u][v]=1;
        adj[v][u]=1;
    }
//AdjacencyList

static void addVertex(ArrayList<ArrayList<Integer>> adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
}
}
