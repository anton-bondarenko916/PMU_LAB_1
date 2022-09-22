package com.example.pmu_lab_1

class Utils {

    companion object {
        fun min(firstNumber: Int, secondNumber: Int): Int {
            return if (firstNumber < secondNumber) {
                firstNumber
            } else {
                secondNumber
            }
        }

        fun max(firstNumber: Int, secondNumber: Int): Int {
            return if (firstNumber > secondNumber) {
                firstNumber
            } else {
                secondNumber
            }
        }
    }
}