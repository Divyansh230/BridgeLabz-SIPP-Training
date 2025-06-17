package Methods;

import java.util.Scanner;

public class BMI_ID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height(cm), BMI

        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            data[i][0] = weight;
            data[i][1] = height;
        }

        calculateBMI(data);

        String[] statuses = determineBMIStatus(data);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Weight=%.2f kg, Height=%.2f cm, BMI=%.2f, Status=%s%n",
                    i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
