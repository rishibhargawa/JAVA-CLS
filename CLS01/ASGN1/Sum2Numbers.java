import java.util.Scanner;
public class Sum2Numbers {
    static int Sum(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2=sc.nextInt();
        int Sum2Numbers=Sum(num1,num2);{
            System.out.println("Sum is "+Sum2Numbers);
        }
    }
}
