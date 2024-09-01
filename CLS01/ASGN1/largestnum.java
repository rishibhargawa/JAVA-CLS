import java.util.Scanner;
public class largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter your Number2: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Number 1 is Largest");
        }
        else{
            System.out.println("Number 2 is Largest");
        }
    }
}
