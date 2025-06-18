package Strings_and_Exceptional_Handling;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int numberOfStudents) {
        Random rand = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random ages between -10 and 99 to also demonstrate negative age validation
            ages[i] = rand.nextInt(110) - 10;
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else if (ages[i] < 0) {
                result[i][1] = "false (Invalid Age)";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display the results in a table
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-20s\n", "Age", "Can Vote?");
        System.out.println("-----------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-20s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibilityData = checkVotingEligibility(ages);

        // Display the results
        displayTable(eligibilityData);

        sc.close();
    }
}
