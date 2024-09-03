import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int i,c;
        for(i=1,c=0;i<=num;i=i+1){
            if(num%i==0){
                c=c+1;
            }
        }
        if(c>2){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}