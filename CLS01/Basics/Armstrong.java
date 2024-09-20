public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500 are:");

        for (int number = 1; number <= 500; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculate the sum of the cubes of each digit
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += cube(digit);   // Add the cube of the digit to sum
            num /= 10;            // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        return sum == originalNum;
    }

    // Method to calculate the cube of a digit without using Math.pow()
    public static int cube(int digit) {
        return digit * digit * digit; // Calculate the cube by multiplying the digit three times
    }
}
