package com.study.brown.solution42578

import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun test(){
        val value = arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear"))
//        val value = arrayOf(arrayOf("crow_mask", "face"), arrayOf("blue_sunglasses", "face"), arrayOf("smoky_makeup", "face"))
        println(Solution().solution(value))
    }
}