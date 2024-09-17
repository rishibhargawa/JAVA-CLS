import java.util.Scanner;
public class leapyear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; 
                } else {
                    return false; 
                }
            } else {
                return true; 
            }
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        leapyear checker = new leapyear();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); 
        boolean isLeapYear = checker.isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}