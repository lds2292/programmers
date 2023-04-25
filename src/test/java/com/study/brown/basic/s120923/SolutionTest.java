package com.study.brown.basic.s120923;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120923
 *
 * 연속된 수의 합
 */
public class SolutionTest {

    @Test
    void Solution() {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    private int[] solution(int num, int total) {
        int[] answer = new int[num];

        int a = 0;
        for (int i = 1; i <= num; i++) {
            a += i;
        }

        int result = (total - a) / num;

        for (int i = 0; i < num; i++) {
            answer[i] = result + i + 1;
        }

        return answer;
    }
}