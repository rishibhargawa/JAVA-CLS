import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
