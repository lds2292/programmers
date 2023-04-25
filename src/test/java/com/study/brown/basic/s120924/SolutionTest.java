package com.study.brown.basic.s120924;

import org.junit.jupiter.api.Test;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120924
 *
 * 다음에 올 숫자
 */
public class SolutionTest {

    @Test
    void Solution() {
        int[] case1 = {1, 2, 3, 4};
        int[] case2 = {2, 4, 8};
        System.out.println(solution(case1));
        System.out.println(solution(case2));
    }

    private int solution(int[] common) {
        int answer = 0;

        int i1 = common[0];
        int i2 = common[1];
        int i3 = common[2];

        if (i3 == (i2*2)-i1){
            answer = (common[common.length - 1]*2) - common[common.length - 2];
        } else {
            answer = (common[common.length - 1] * common[common.length - 1]) / common[common.length - 2];
        }

        return answer;
    }
}