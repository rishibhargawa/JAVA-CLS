import java.util.Scanner;
public class Sum2Numbers {
  int Sum(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sum2Numbers obj=new Sum2Numbers();
        System.out.println("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2=sc.nextInt();
        System.out.println("SUM is: "+obj.Sum(num1, num2));

    }
}
