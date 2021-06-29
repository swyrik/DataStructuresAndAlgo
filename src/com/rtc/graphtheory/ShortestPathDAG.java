package com.rtc.graphtheory;
/*
 * @Author Swyrik Thupili
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Single shortest path on directed acyclic graph
public class ShortestPathDAG {


    public static void main(String[] args) {

        Map<Integer, List<Edge>> graph = new HashMap<>();

        GraphUtil.addDirectedEdge(graph, new Edge(0,1, 3));
        GraphUtil.addDirectedEdge(graph, new Edge(0,2, 6));
        GraphUtil.addDirectedEdge(graph, new Edge(1,2, 4));
        GraphUtil.addDirectedEdge(graph, new Edge(1,4, 11));
        GraphUtil.addDirectedEdge(graph, new Edge(1,3, 4));
        GraphUtil.addDirectedEdge(graph, new Edge(2,3, 8));
        GraphUtil.addDirectedEdge(graph, new Edge(2,6, 11));
        GraphUtil.addDirectedEdge(graph, new Edge(3,4, -4));
        GraphUtil.addDirectedEdge(graph, new Edge(3,5, 5));
        GraphUtil.addDirectedEdge(graph, new Edge(3,6, 2));
        GraphUtil.addDirectedEdge(graph, new Edge(4,7, 9));
        GraphUtil.addDirectedEdge(graph, new Edge(5,7, 1));
        GraphUtil.addDirectedEdge(graph, new Edge(6,7, 2));

        int shortestDistance = shortestPathDagFromStoE(graph, 0, 7, 8);
        System.out.println(shortestDistance);

    }


    // A useful application of the topological sort is to find the shortest path
    // between two nodes in a Directed Acyclic Graph (DAG). Given an adjacency list
    // this method finds the shortest path to all nodes starting at 'start'
    //
    // NOTE: 'numNodes' is not necessarily the number of nodes currently present
    // in the adjacency list since you can have singleton nodes with no edges which
    // wouldn't be present in the adjacency list but are still part of the graph!
    //
    private static int shortestPathDagFromStoE(Map<Integer, List<Edge>> graph, int start, int end, int numNodes) {

        int[] topSort = topSort(graph, numNodes);
        Integer[] distances = new Integer[numNodes];
        distances[start] = 0;

        for (int i = 0; i < numNodes; i++) {
            int node = topSort[i];
            List<Edge> edges = graph.get(node);
            if(edges!=null){
                for (Edge edge: edges) {
                    int newDist = edge.cost + distances[node];
                    if(distances[node] == null) distances[edge.to] = newDist;
                    else distances[edge.to] = Math.min(distances[edge.to], newDist);
                }
            }

        }
        
        return distances[end];
    }

    private static int[] topSort(Map<Integer, List<Edge>> graph, int N) {
        int[] ordering = new int[N];
        boolean[] visited = new boolean[N];
        int i = N-1;


        for (int j = 0; j < N ; j++) {
            if(!visited[j]){
                dfs(i, j, visited, ordering, graph);
            }
        }

        return ordering;
    }

    private static int dfs(int i, int j, boolean[] visited, int[] ordering, Map<Integer, List<Edge>> graph) {

        visited[j] = true;

        List<Edge> edges = graph.get(j);
        if(null == edges){
            edges = new LinkedList<>();
        }
        for (Edge edge: edges) {
            if(!visited[edge.to]){
                i = dfs(i, edge.to, visited, ordering, graph);
            }
        }
        ordering[i] = j;
        return i-1;

    }


}
