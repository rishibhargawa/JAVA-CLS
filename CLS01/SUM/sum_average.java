package SUM;
import java.util.Scanner;
public class sum_average {
    public static void main(String[] args) {
        sumlogic obj=new sumlogic();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        System.out.println("Sum is: "+obj.sum(num1, num2, num3, num4, num5));
        System.out.println("Average is: "+obj.sum(num1, num2, num3, num4, num5)/5);
    }
}

//MAKE IT USING ARRAY