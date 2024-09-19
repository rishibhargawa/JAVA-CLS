import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int num=sc.nextInt();
        int square=num*num;
        System.out.println("Square of Number is : "+square);
        sc.close();
    }   
}