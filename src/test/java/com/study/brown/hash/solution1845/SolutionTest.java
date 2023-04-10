package com.study.brown.hash.solution1845;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("프로그래머스 - 폰켓몬")
    void solution(){
        int[][] nums = {{3,1,2,3},{3,3,3,2,2,4},{3,3,3,2,2,2}};
        Solution1845 solution1845 = new Solution1845();
        for (int[] num : nums) {
            System.out.println(solution1845.solution(num));
        }
    }
}
