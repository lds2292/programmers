package com.study.brown.basic.pushstring;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void Solution() {
        System.out.println(solution2("hello", "ohell"));
        System.out.println(solution2("apple", "elppa"));
        System.out.println(solution2("abc", "abc"));
    }

    private int solution(String A, String B) {
        int answer = -1;

        StringBuilder sb = new StringBuilder(A);

        if ( A.equals(B) ) return 0;
        for (int i = 1; i <= A.length(); i++) {
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
            if (sb.toString().equals(B)) return i;
        }
        return answer;
    }

    private int solution2(String A, String B) {
        return B.repeat(2).indexOf(A);
    }
}