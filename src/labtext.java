import java.util.Scanner;

public class labtext {
    // Exception class for invalid inputs
    class LgInvalidInputException extends Exception {
        public LgInvalidInputException(String message) {
            super(message);
        }
    }

    // Class to calculate logarithm
    static class Lgrthm {
        private double num;
        private double bs;
        private double lgm;

        // Constructor
        public Lgrthm(double num, double bs) {
            this.num = num;
            this.bs = bs;
            this.lgm = 0.0; // Default value
        }

        // Method to calculate logarithm
        public void calculateLogarithm() throws LgInvalidInputException {
            // Check for non-positive or non-integral inputs
            if (num <= 0 || bs <= 1 || num % 1 != 0 || bs % 1 != 0) {
               // throw new LgInvalidInputException("Invalid input. Ensure that the number is positive and integral, and the base is greater than 1.");
            }

            // Calculate logarithm to base 10 using Math.log10()
            lgm = Math.log10(num) / Math.log10(bs);
        }

        // Method to get the result
        public double getResult() {
            return lgm;
        }
    }

    public class LogarithmCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter the number: ");
            double number = scanner.nextDouble();

            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();

            try {
                // Create an instance of Lgrthm
                Lgrthm logarithmCalculator = new Lgrthm(number, base);

                // Calculate logarithm
                logarithmCalculator.calculateLogarithm();

                // Display the result
                System.out.println("Logarithm of " + number + " to the base " + base + " is: " + logarithmCalculator.getResult());
            } catch (LgInvalidInputException e) {
                // Handle invalid input exception
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Close the scanner
                scanner.close();
       } }
    }
}
