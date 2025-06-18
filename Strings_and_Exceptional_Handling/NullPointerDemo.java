package Strings_and_Exceptional_Handling;

public class NullPointerDemo {

    public static void main(String[] args) {

        // Method that generates the NullPointerException without handling
        generateNullPointerException();

        // Method that handles the NullPointerException properly
        handleNullPointerException();
    }

    // 1. Method to generate the NullPointerException (without handling)
    public static void generateNullPointerException() {
        System.out.println("\n--- Generating NullPointerException ---");

        String text = null; // Intentionally setting to null
        // This will throw NullPointerException because we're calling a method on null
        int length = text.length(); // Runtime Exception occurs here

        System.out.println("Length of the string: " + length); // This won't be executed
    }

    // 2. Method to handle the NullPointerException using try-catch
    public static void handleNullPointerException() {
        System.out.println("\n--- Handling NullPointerException ---");

        String text = null; // Intentionally setting to null

        try {
            int length = text.length(); // Exception expected here
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
