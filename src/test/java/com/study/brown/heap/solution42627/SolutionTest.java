package com.study.brown.heap.solution42627;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test(){
        int[][] case1 = {{0, 3},{1, 9},{2, 6}};
        int[][] case2 = {{0, 3},{3, 6},{9, 9}};
        int[][] case3 = {{0, 3},{4, 6},{9, 9}};
        int[][] case4 = {{0, 3},{0, 6},{0, 9}};
        int[][] case5 = {{5, 1},{1, 6},{2, 9}};

//        assertEquals(9, this.solution(case1));
//        assertEquals(6, this.solution(case2));
//        assertEquals(6, this.solution(case3));
//        assertEquals(10, this.solution(case4));
        assertEquals(7, this.solution(case5));
    }

    public int solution(int[][] jobs) {
        PriorityQueue<ProcessDisk> processHeap = new PriorityQueue<>();
        PriorityQueue<StartDisk> startHeap = new PriorityQueue<>();

        for (int[] job : jobs) {
            processHeap.offer(new ProcessDisk(job[0], job[1]));
            startHeap.offer(new StartDisk(job[0], job[1]));
        }

        int answer1 = 0;
        int waitTime = 0;
        int size = processHeap.size();
        while(processHeap.size() != 0){
            ProcessDisk processDisk = processHeap.poll();
            System.out.println(processDisk);
            if (processDisk.getStart() > waitTime){
                answer1 = answer1 + waitTime + processDisk.getProcess() - waitTime;
            } else {
                answer1 = answer1 + waitTime + processDisk.getProcess() - processDisk.getStart();
            }
            waitTime = waitTime + processDisk.getProcess();
        }

        int a = answer1 / size;

        int answer2 = 0;
        waitTime = 0;
        size = startHeap.size();
        while(startHeap.size() != 0){
            StartDisk startDisk = startHeap.poll();
            System.out.println(startDisk);
            if (startDisk.getStart() > waitTime){
                answer2 = answer2 + waitTime + startDisk.getProcess() - waitTime;
            } else {
                answer2 = answer2 + waitTime + startDisk.getProcess() - startDisk.getStart();
            }
            waitTime = waitTime + startDisk.getProcess();
        }

        int b = answer2 / size;

        return Math.min(a, b);
    }

    static class ProcessDisk implements Comparable<ProcessDisk>{
        private final int start;

        private final int process;

        public ProcessDisk(int start, int process) {
            this.start = start;
            this.process = process;
        }

        public int getStart() {
            return start;
        }

        public int getProcess() {
            return process;
        }

        @Override
        public int compareTo(@NotNull ProcessDisk other) {
            return Integer.compare(this.getProcess(), other.getProcess());
        }

        @Override
        public String toString() {
            return "Disk{" +
                "start=" + start +
                ", process=" + process +
                '}';
        }
    }

    static class StartDisk implements Comparable<StartDisk>{
        private final int start;

        private final int process;

        public StartDisk(int start, int process) {
            this.start = start;
            this.process = process;
        }

        public int getStart() {
            return start;
        }

        public int getProcess() {
            return process;
        }

        @Override
        public int compareTo(@NotNull StartDisk other) {
            return Integer.compare(this.getStart(), other.getStart());
        }

        @Override
        public String toString() {
            return "Disk{" +
                "start=" + start +
                ", process=" + process +
                '}';
        }
    }
}
