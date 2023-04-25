package com.study.brown.basic.sumbignumber;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void Solution() {
        Map<String[], String>caseValue = Map.of(
            new String[]{"1234", "5678"}, "6912",
            new String[]{"1111", "8889"}, "10000"
        );

        caseValue.forEach((key, value) -> {
            assertEquals(value, solution(key[0], key[1]));
        });

    }

    public String solution(String value1, String value2) {

        StringBuilder sb = new StringBuilder();

        int max = Math.max(value1.length(), value2.length());

        int add = 0;
        for (int i = 1; i <= max; i++) {
            char a = value1.length() >= i ? value1.charAt(value1.length() - i) : '0';
            char b = value2.length() >= i ? value2.charAt(value2.length() - i) : '0';

            int i1 = Integer.parseInt(String.valueOf(a));
            int i2 = Integer.parseInt(String.valueOf(b));
            int i3 = i1 + i2 + add;
            add = i3 >= 10 ? 1 : 0;
            sb.insert(0, i3 < 10 ? i3 : i3-10);
        }

        if (add > 0)
            sb.insert(0, add);

        return sb.toString();
    }
}