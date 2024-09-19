import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for (i=1;i<=num;i=i+1){
            if(num%i==0){
                System.out.println(i+" is factor");
            }
        }
        sc.close();
    }
}