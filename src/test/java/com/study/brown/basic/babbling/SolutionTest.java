package com.study.brown.basic.babbling;

import org.junit.jupiter.api.Test;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
public class SolutionTest {


    @Test
    void Solution() {
        String[] case1 = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(case1));
    }

    private int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        int answer = 0;
        for (String s : babbling) {
            for (String s1 : arr) {
                s = s.replace(s1, " ");
                if (s.trim().equals("")) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
