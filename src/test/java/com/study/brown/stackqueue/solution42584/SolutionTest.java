package com.study.brown.stackqueue.solution42584;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionTest {
    @Test
    void test() {
        int[] case1 = {1, 2, 3, 2, 3};
//        System.out.println(Arrays.toString(solution(case1)));
        solution2(case1);
    }

    public int[] solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j= i+1; j < prices.length; j++){
                if (prices[i] <= prices[j]) { count++; } else { count++; break; }
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] prices) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            myStack.push(prices[i]);
        }

        return prices;
    }
}
