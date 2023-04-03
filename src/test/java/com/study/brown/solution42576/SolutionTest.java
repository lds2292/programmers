package com.study.brown.solution42576;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("프로그래머스 - 완주하지 못한 선수")
    void solution(){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution42576 solution42576 = new Solution42576();
        System.out.println(solution42576.solution(part, comp));
    }
}
