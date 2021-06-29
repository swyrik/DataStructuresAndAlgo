package com.rtc.graphtheory;

import java.util.*;
import java.util.stream.Collectors;

//un weighted graph shortest path
public class ShortestPathUsingBFS {

    public static void main(String[] args) {

        Map<Integer, List<Edge>> graph = new HashMap<>();

        GraphUtil.addDirectedEdge(graph, 3, 4, 10);
        GraphUtil.addDirectedEdge(graph, 0, 1, 4);
        GraphUtil.addDirectedEdge(graph, 0, 3, -2);
        GraphUtil.addDirectedEdge(graph, 0, 2, 5);
        GraphUtil.addDirectedEdge(graph, 1, 4, 6);
        GraphUtil.addDirectedEdge(graph, 3, 5, 9);
        GraphUtil.addDirectedEdge(graph, 4, 5, 7);
        GraphUtil.addDirectedEdge(graph, 2, 4, 1);


        int numNodes = 6;
        Integer[] nodeCount = bfs(graph, 2, numNodes);
        System.out.println("BFS node count starting at node 0: " + nodeCount);
        List<Integer> integers = reconstructPath(nodeCount, 2, 5);
        integers.forEach(System.out::print);
    }

    public static List<Integer> reconstructPath(Integer[] nums, int start, int end){
        List<Integer> path = new LinkedList<>();
        for (Integer i = end; i != null ; i = nums[i]) {
            path.add(i);
        }
        Collections.reverse(path);
        if(path.get(0) == start){
            return path;
        }

        path.clear();
        return path;
    }

    private static Integer[] bfs(Map<Integer, List<Edge>> graph, int start, int numNodes) {

        long count = 0L;

        Queue<Integer> queue = new LinkedList<>();
        Integer prev[] = new Integer[numNodes];
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
                        prev[edge.to] =  node; //0,0,0,0,
                        queue.add(edge.to);
                    }
                }
            }

        }

        return prev;

    }

}
