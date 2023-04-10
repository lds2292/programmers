package com.study.brown.hash.solution42577;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution42577 {
    public boolean solution(String[] phone_book) {

        Set<String> mySet = new HashSet<>(Arrays.asList(phone_book));

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (mySet.contains(s.substring(0, j))) return false;
            }
        }
        return true;
    }
}
