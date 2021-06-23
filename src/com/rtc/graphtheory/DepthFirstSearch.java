package com.rtc.graphtheory;

import java.util.*;

public class DepthFirstSearch {


    public static void main(String[] args) {

        Map<Integer, List<Edge>> graph = new HashMap<>();
        addDirectedEdge(graph, 0, 1, 4);
        addDirectedEdge(graph, 0, 2, 5);
        addDirectedEdge(graph, 1, 2, -2);
        addDirectedEdge(graph, 1, 3, 6);
        addDirectedEdge(graph, 2, 3, 1);
        addDirectedEdge(graph, 2, 2, 10);

        int numNodes = 5;
        long nodeCount = dfs(graph, 0, numNodes);
        System.out.println("DFS node count starting at node 0: " + nodeCount);

    }

    private static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) {

        List<Edge> list = graph.get(from);
        if(null == list){
            list =  new LinkedList<Edge>();
            graph.put(from, list);
        }


        list.add(new Edge(from, to, cost));

    }

    private static long dfs(Map<Integer, List<Edge>> graph, int start, int numNodes) {

        long count = 0l;
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[numNodes];

        stack.push(start);
        visited[start] = true;

        while(!stack.isEmpty()){
            int  node = stack.pop();
            count++;

            List<Edge> edges = graph.get(node);
            if(edges != null){
                for (Edge edge: edges) {
                    if(!visited[edge.to]){
                        stack.push(edge.to);
                        visited[edge.to] = true;
                    }
                }
            }
        }

        return count;
    }


}
