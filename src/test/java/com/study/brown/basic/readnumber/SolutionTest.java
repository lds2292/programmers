package com.study.brown.basic.readnumber;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void Solution() {
        Map<Integer, String> caseValue = Map.of(
            147, "onefourseven",
            5, "five",
            1112, "oneoneonetwo",
            1031, "onezerothreeone"
        );
//        caseValue.forEach((key, value) -> {
//            assertEquals(value, solution(key));
//        });

        caseValue.forEach((key, value) -> {
            assertEquals(value, solution2(key));
        });

    }

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String[] map = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int value = Integer.parseInt(String.valueOf(s.charAt(i)));
            answer.append(map[value]);
        }
        return answer.toString();
    }

    public String solution2(int n) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        StringBuilder answer = new StringBuilder();
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            answer.insert(0, arr[n % 10]);
            n /= 10;
        }
        return answer.toString();
    }
}