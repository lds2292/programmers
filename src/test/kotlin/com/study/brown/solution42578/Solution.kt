package com.study.brown.solution42578

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val a = clothes.groupBy({it[1]},{it[0]})
            .mapValues { it.value.toSet().size + 1 }
        val answer = a.values.reduce{ x, y -> x * y} - 1
        println(answer)
        return 0
    }
}