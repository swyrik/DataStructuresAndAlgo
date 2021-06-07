package com.rtc.dynamicprogramming;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GridTravelerMemoized {

    public static void main(String[] args) {
//        System.out.println(ways(0,0, new HashMap<>()));
//        System.out.println(ways(1,1, new HashMap<>()));
//        System.out.println(ways(3,3, new HashMap<>()));
        Instant before = Instant.now();
        System.out.println(ways(200,208, new HashMap<>()));
        Instant after = Instant.now();
        System.out.println(Duration.between(before, after).toMillis());
    }

    private static double ways(int m, int n, Map<GridPos, Double> map){
        GridPos gp = new GridPos(m,n);
        if(map.containsKey(gp)){
            return map.get(gp);
        }

        if(m == 0 || n == 0){
            return 0;
        }

        if(m ==1 || n==1){
            return 1;
        }
        map.put(gp, ways(m-1, n, map) + ways(m, n-1,map));
        return map.get(gp);
    }

}

class GridPos{
    int m,n;

    public GridPos(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GridPos gridPos = (GridPos) o;
        return (m == gridPos.m && n == gridPos.n) || ( m == gridPos.n && n == gridPos.m);
//        return (m == gridPos.m && n == gridPos.n);
    }


    @Override
    public int hashCode() {
        return Objects.hash(m, n);
    }
}
