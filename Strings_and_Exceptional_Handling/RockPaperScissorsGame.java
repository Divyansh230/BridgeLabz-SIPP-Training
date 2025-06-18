package Strings_and_Exceptional_Handling;

import java.util.*;

public class RockPaperScissorsGame {

    static Scanner sc = new Scanner(System.in);
    static String[] options = {"rock", "paper", "scissors"};

    // Method to get computer's choice randomly
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return options[choice];
    }

    // Method to determine winner
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to calculate win statistics and return as String array
    public static String[][] calculateStats(List<String[]> results, int totalGames) {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (String[] result : results) {
            if (result[2].equals("Player")) playerWins++;
            else if (result[2].equals("Computer")) computerWins++;
            else draws++;
        }

        double playerWinPercentage = (playerWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;

        return new String[][] {
                {"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", playerWinPercentage)},
                {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercentage)},
                {"Draws", String.valueOf(draws), "-"}
        };
    }

    // Method to display results
    public static void displayResults(List<String[]> results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game No.", "Player Choice", "Computer Choice", "Winner");
        int gameNo = 1;
        for (String[] result : results) {
            System.out.printf("%-10d %-15s %-15s %-10s\n", gameNo++, result[0], result[1], result[2]);
        }

        System.out.println("\nSummary:");
        System.out.printf("%-15s %-10s %-10s\n", "Category", "Wins", "Win %");
        for (String[] stat : stats) {
            System.out.printf("%-15s %-10s %-10s\n", stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of games you want to play: ");
        int totalGames = sc.nextInt();

        List<String[]> results = new ArrayList<>();

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            // Validate input
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = sc.next().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            results.add(new String[]{userChoice, computerChoice, winner});
        }

        // Calculate and display stats
        String[][] stats = calculateStats(results, totalGames);
        displayResults(results, stats);
    }
}
