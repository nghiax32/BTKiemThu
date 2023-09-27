public class Analyst {
    public static String BMIAnalyst(double weight, double height) {
        double BMI = Calculate.BMICalculate(weight, height);
        String result = "";
        if (BMI < 18.5) {
            result = "Dưới trọng lượng (gầy)";
        } else if (BMI < 25) {
            result = "Bình thường (lý tưởng)";
        } else if (BMI < 30) {
            result = "Thừa cân";
        } else if (BMI < 35) {
            result = "Béo phì cấp độ 1";
        } else if (BMI < 40) {
            result = "Béo phì cấp độ 2";
        } else {
            result = "Béo phì cấp độ 3 (béo phì nặng)";
        }
        return result;
    }
}
