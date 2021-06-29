package com.rtc.graphtheory;
/*
 * @Author Swyrik Thupili
 */

//Dijkstra algorithm only works for the
// positively weighted edge weights

import java.util.*;

public class DijkstraShortestPathSizeAlgorithm {

    public static void main(String[] args) {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        GraphUtil.addDirectedEdge(graph, new Edge(0, 1, 4));
        GraphUtil.addDirectedEdge(graph, new Edge(0, 2, 1));
        GraphUtil.addDirectedEdge(graph, new Edge(1, 3, 1));
        GraphUtil.addDirectedEdge(graph, new Edge(2, 1, 2));
        GraphUtil.addDirectedEdge(graph, new Edge(2, 3, 5));
        GraphUtil.addDirectedEdge(graph, new Edge(3, 4, 3));
        int[] dist = new DijkstraShortestPathSizeAlgorithm().dijkstraShortestPath(graph, 0, 5);
        printArray(dist);
    }

    private int[] dijkstraShortestPath(Map<Integer, List<Edge>> graph, int start, int numNodes) {

        PriorityQueue<NodePair> pq = new PriorityQueue<>((np1, np2) -> {
            return np1.getValue().compareTo(np2.getValue());
        });

        boolean visited[] = new boolean[numNodes];

        int dist[] = new int[numNodes];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[start] = 0;
        pq.offer(new NodePair(start, 0));
        while (!pq.isEmpty()) {

            NodePair nodePair = pq.poll();
            if(dist[nodePair.getId()] < nodePair.getValue()) continue; // if the current node id has a lower value already, we don't need to process it


            visited[nodePair.getId()] = true;
            List<Edge> edges = graph.get(nodePair.getId());
            if (null != edges) {
                for (Edge edge : edges) {
                    if (visited[edge.to]) continue;
                    int newDist = dist[edge.from] + edge.cost;
                    if (newDist < dist[edge.to]) {
                        dist[edge.to] = newDist;
                        pq.offer(new NodePair(edge.to, dist[edge.to]));
                    }
                }
            }


        }
        return dist;

    }

    private static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1) System.out.print(nums[i]);
            else System.out.print(nums[i]+",");
        }
        System.out.println();
    }
}
