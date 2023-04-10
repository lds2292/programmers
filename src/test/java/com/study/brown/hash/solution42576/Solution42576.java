package com.study.brown.hash.solution42576;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Long> collect = Arrays.stream(participant)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        for (String s : completion) {
            collect.replace(s, collect.get(s) - 1);
        }

        return collect.entrySet().stream().filter(s->s.getValue() == 1)
                .findFirst().get().getKey();

    }
}
