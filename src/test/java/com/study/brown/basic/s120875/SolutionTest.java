package com.study.brown.basic.s120875;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionTest {

    @Test
    void Solution() {
        int[][] case1 = {{1,4},{9,2},{3,8},{11,6}};
        int[][] case2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};         
        int[][] case3 = {{1,4},{9,2},{1,4},{9,2}};
        int[][] case4 = {{3, 5}, {4, 4}, {8, 9}, {6, 11}};
//        System.out.println(solution(case1));
//        System.out.println(solution(case2));
//        System.out.println(solution(case3));
        System.out.println(solution(case4));
    }

    private int solution(int[][] dots) {
        int answer = 0;

        List<String> inclinations = new java.util.ArrayList<>();

        for (int i = 0; i < dots.length; i++) {
            for (int j = i+1; j < dots.length; j++) {
                int[] dot1 = dots[i];
                int[] dot2 = dots[j];
                int x1 = dot1[0];
                int y1 = dot1[1];
                int x2 = dot2[0];
                int y2 = dot2[1];
                int y = (y2-y1);
                int x = (x2-x1);
                if (Math.abs(x) == Math.abs(y)) {
                    inclinations.add(String.valueOf(y/x));
                } else {
                    inclinations.add(y+"/"+x);
                }
                System.out.print(Arrays.toString(dot1));
                System.out.print(Arrays.toString(dot2));
                System.out.println(":"+(y2-y1)+"/"+(x2-x1));
            }
        }

        Map<String, List<String>> collect = inclinations.stream()
            .collect(Collectors.groupingBy(s -> s));

        for (List<String> value : collect.values()) {
            if (value.size() > 1) return 1;
        }

        return answer;
    }
}