package org.example;

public class Analyst {
    public static String BMIAnalyst(double weight, double height) {
        double BMI = Calculate.BMICalculate(weight, height);
        String result = "";
        if (BMI == -1) {
            result = "Chỉ số không hợp lệ";
        } else if (BMI < 18.5) {
            result = "Gầy";
        } else if (BMI < 25) {
            result = "Bình thường";
        } else if (BMI < 30) {
            result = "Thừa cân";
        } else if (BMI < 35) {
            result = "Béo phì độ 1";
        } else if (BMI < 40) {
            result = "Béo phì độ 2";
        } else {
            result = "Béo phì độ 3";
        }
        return result;
    }
}
