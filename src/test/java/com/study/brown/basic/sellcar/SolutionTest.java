package com.study.brown.basic.sellcar;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void Solution() {
        Map<int[], Integer>caseValue = Map.of(
            new int[]{3,2,4,8,7}, 6,
            new int[]{3,4,1,5,4}, 4
        );

        caseValue.forEach((key, value) -> {
            assertEquals(value, solution(key));
        });

    }

    public int solution(int[] prices) {
        int min = 100_000;
        int max = 0;
        int answer = 0;

        for (int price : prices) {
            if (min > price) {
                min = price;
                max = 0;
            }

            if (max < price) {
                max = price;
                if (answer < max - min)
                    answer = max - min;
            }

//            System.out.println(min + "/" + max + ":" + answer);
        }

        return answer;
    }
}