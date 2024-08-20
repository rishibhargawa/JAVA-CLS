import java.util.Scanner;
public class calcMain {
    public static void main(String[] args) {
        calcu obj=new calcu();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number-1 : ");
        int num=sc.nextInt();
        System.out.print("Enter Number-2 : ");
        int num2=sc.nextInt();
        int res=obj.sum(num, num2);
        int res1=obj.diff(num,num2);
        int res2=obj.multiply(num, num2);
        int res3=obj.divide(num, num2);
        System.out.println("SUM"+" "+res);
        System.out.println("DIFFERENCE"+" "+res1);
        System.out.println("MULTIPLICATION"+" "+res2);
        System.out.println("DIVISION"+" "+res3);
    }
}
