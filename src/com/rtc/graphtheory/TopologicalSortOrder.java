package com.rtc.graphtheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This topological sort implementation takes an adjacency list of an acyclic graph and returns an
 * array with the indexes of the nodes in a (non unique) topological order which tells you how to
 * process the nodes in the graph. More precisely from wiki: A topological ordering is a linear
 * ordering of its vertices such that for every directed edge uv from vertex u to vertex v, u comes
 * before v in the ordering.
 *
 * <p>Time Complexity: O(V + E)
 *
 * @author Swyrik Thupili
 */

public class TopologicalSortOrder {

    public static void main(String[] args) {

        final int N= 6; // number of nodes in the array
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) graph.put(i, new ArrayList<>());
        graph.get(0).add(new Edge(0, 1, 3));
        graph.get(0).add(new Edge(0, 2, 2));
        graph.get(0).add(new Edge(0, 5, 3));
        graph.get(1).add(new Edge(1, 3, 1));
        graph.get(1).add(new Edge(1, 2, 6));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 10));
        graph.get(3).add(new Edge(3, 4, 5));
        graph.get(5).add(new Edge(5, 4, 7));

        Integer val = Integer.MIN_VALUE;

        int[] ordering = topoloicalSort(graph, N);
        printArray(ordering);
    }

    public static void printArray(int[] n){
        for (int num: n) {
            System.out.print(num+",");
        }
        System.out.println();
    }

    private static int[] topoloicalSort(Map<Integer, List<Edge>> graph, int N) {
        int[] ordering = new int[N];
        boolean[] visited = new boolean[N];
        int i = N-1;


        for (int j = 0; j <N ; j++) {
            if(!visited[j]){
                dfs(i, j, visited, ordering, graph);
            }
        }

        return ordering;
    }

    private static int dfs(int i, int j, boolean[] visited, int[] ordering, Map<Integer, List<Edge>> graph) {
        visited[j] = true;

        List<Edge> edges = graph.get(j);
        for (Edge edge: edges) {
            if(!visited[edge.to]){
                i = dfs(i, edge.to, visited, ordering, graph);
            }
        }
        ordering[i] = j;
        return i-1;

    }

}
