package com.study.brown.stackqueue.solution12909;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    void test(){
        String case1 = "()()";
        String case2 = "(())()";
        String case3 = ")()(";
        String case4 = "(()(";

        System.out.println(solution(case3));
    }

    private boolean solution(String s) {
        List<Character> stack = new ArrayList<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(')
                    stack.add(c);
                else
                    stack.remove(stack.size() - 1);
            }
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
        return stack.size() == 0;
    }
}
