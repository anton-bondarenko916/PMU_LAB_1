package com.example.pmu_lab_1;

public class UtilsJava {

    public static Integer min(Integer firstNumber, Integer secondNumber) {
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static Integer max(Integer firstNumber, Integer secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
