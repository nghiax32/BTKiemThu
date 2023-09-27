package org.example;

public class Calculate {
    public static double BMICalculate(double weight, double height) {
        double result = -1;
        // The heaviest person who ever lived, American John Minnoch (1941–83), weighed 635 kg.
        // Guinness World Record for tallest living male at 251 cm.
        if ((weight > 0 && weight <= 700) && (height > 0 && height <= 2.7)) {
            result = weight / (height * height);
        }
        return result;
    }
}
