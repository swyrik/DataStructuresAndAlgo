package com.rtc.graphtheory;

import java.beans.Visibility;
import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        addDirectedEdge(graph, 0, 1, 4);
        addDirectedEdge(graph, 0, 2, 5);
        addDirectedEdge(graph, 1, 2, -2);
        addDirectedEdge(graph, 1, 3, 6);
        addDirectedEdge(graph, 2, 3, 1);
        addDirectedEdge(graph, 2, 2, 10);

        int numNodes = 5;
        long nodeCount = bfs(graph, 0, numNodes);
        System.out.println("BFS node count starting at node 0: " + nodeCount);
    }

    private static long bfs(Map<Integer, List<Edge>> graph, int start, int numNodes) {
        long count = 0L;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] visitied = new boolean[numNodes];
        visitied[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            count++;
            List<Edge> nodeEdges = graph.get(node);
            if(nodeEdges != null){
                for (Edge edge: nodeEdges){
                    if(!visitied[edge.to] && !queue.contains(edge.to)){
                        visitied[edge.to] = true;
                        queue.add(edge.to);
                    }
                }
            }

        }

        return count;
    }


    private static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) {

        List<Edge> list = graph.get(from);
        if(null == list){
            list =  new LinkedList<Edge>();
            graph.put(from, list);
        }


        list.add(new Edge(from, to, cost));

    }
}
