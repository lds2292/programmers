package com.study.brown.heap.solution42626;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class SolutionTest {
    @Test
    void test(){
        int[] arr = {7, 9, 10, 11};
        System.out.println(this.solution(arr, 7));
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : scoville) {
            minHeap.offer(i);
        }

        int count = 0;
        while (minHeap.size() != 0) {
            if (minHeap.peek() >= K) break;

            count++;
            Integer value1 = minHeap.poll();
            Integer value2 = minHeap.poll();
            if (value2 == null) return -1;

            int newValue = value1 + (value2 * 2);
            minHeap.offer(newValue);

            if (minHeap.peek() == null) return -1;
        }

        return count;
    }
}
