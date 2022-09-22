package com.example.pmu_lab_1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun compareOneAndTwoWithMaxFunction() {
        assertEquals(2, Utils.max(1, 2))
    }

    @Test
    fun compareThreeAndTwoWithMaxFunction() {
        assertEquals(3, Utils.max(3, 2))
    }

    @Test
    fun compareFiveAndSixWithMaxFunction() {
        assertEquals(6, Utils.max(5, 6))
    }

    @Test
    fun compareTenAndNineWithMaxFunction() {
        assertEquals(10, Utils.max(10, 9))
    }

    @Test
    fun compareOneAndTwoWithMinFunction() {
        assertEquals(1, Utils.min(1, 2))
    }

    @Test
    fun compareThreeAndTwoWithMinFunction() {
        assertEquals(2, Utils.min(3, 2))
    }

    @Test
    fun compareFiveAndSixWithMinFunction() {
        assertEquals(5, Utils.min(5, 6))
    }

    @Test
    fun compareTenAndNineWithMinFunction() {
        assertEquals(9, Utils.min(10, 9))
    }
}