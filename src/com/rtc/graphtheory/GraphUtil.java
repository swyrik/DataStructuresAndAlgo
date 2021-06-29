package com.rtc.graphtheory;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphUtil {

    public static void addDirectedEdge(Map<Integer, List<Edge>> graph, int from, int to, int cost) {

        List<Edge> list = graph.get(from);
        if(null == list){
            list =  new LinkedList<Edge>();
            graph.put(from, list);
        }


        list.add(new Edge(from, to, cost));

    }

    public static void addDirectedEdge(Map<Integer, List<Edge>> graph, Edge edge) {

        List<Edge> list = graph.get(edge.from);
        if(null == list){
            list =  new LinkedList<Edge>();
            graph.put(edge.from, list);
        }

        list.add(edge);

    }
}
