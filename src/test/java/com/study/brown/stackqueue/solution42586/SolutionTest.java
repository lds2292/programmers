package com.study.brown.stackqueue.solution42586;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    void test(){
        int[][] case1 = {{93, 30, 55},{1,30,5}};
        int[][] case2 = {{95, 90, 99, 99, 80, 99},{1, 1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(this.solution(case1[0], case1[1])));
    }

    private int[] solution(int[] progresses, int[] speeds) {
        List<Integer> workday = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            workday.add((int) Math.ceil((100.0 - progresses[i])/speeds[i]));
        }

        int first = workday.get(0);
        int count = 0;
        List<Integer> answer = new ArrayList<>();
        System.out.println(workday);
        for (int i = 0; i < workday.size(); i++) {
            if (first >= workday.get(i)) {
                count++;
            } else {
                answer.add(count);
                first = workday.get(i);
                count = 1;
            }

            if (workday.size()-1 == i){
                answer.add(count);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
