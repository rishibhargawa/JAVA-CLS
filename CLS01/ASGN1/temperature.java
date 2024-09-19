import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        int Celcius=sc.nextInt();
        int fahrenheit=Celcius*9/5+32;
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
        sc.close();
    }
}
