package com.study.brown.stackqueue.solution12906;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    void test(){
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(this.solution(arr)));
    }

    private int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (list.size() == 0) list.add(i);
            else if (list.get(list.size()-1) != i) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(number -> number).toArray();
    }
}
