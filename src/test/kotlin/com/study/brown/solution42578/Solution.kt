package com.study.brown.solution42578

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val a = clothes.groupBy({it[1]},{it[0]}).mapValues { it.value.toSet() }
        if (a.keys.size == 1) return a[a.keys.first()]?.size ?: 0
        return a.values.sumOf { it.size } + a.values.map { it.size }.reduce{ a,b -> a * b}
    }
}