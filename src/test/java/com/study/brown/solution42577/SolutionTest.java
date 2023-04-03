package com.study.brown.solution42577;

import com.study.brown.solution42576.Solution42576;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("프로그래머스 - 전화번호 목록")
    void solution(){
        String[][] phoneBook = {
                {"119", "97674223", "1195524421"},
                {"123", "456", "789"},
                {"123", "1197", "557713", "11987543"},
        };

        Solution42577 solution42577 = new Solution42577();

        System.out.println(solution42577.solution(phoneBook[2]));
    }
}
