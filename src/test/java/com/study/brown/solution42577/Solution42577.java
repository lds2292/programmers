package com.study.brown.solution42577;

import java.util.*;
import java.util.stream.Collectors;

public class Solution42577 {
    public boolean solution(String[] phone_book) {
        Map<Integer, List<String>> collect = Arrays.stream(phone_book).collect(Collectors.groupingBy(String::length));

    }
}
