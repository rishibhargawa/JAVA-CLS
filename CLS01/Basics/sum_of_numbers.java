import java.util.Scanner;
public class sum_of_numbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number to print sum: ");
		int num=sc.nextInt();
		int i,sum;
		for (i=0,sum=0;i<=num;i=i+1){
			sum=sum+i;
		}
		System.out.print("SUM of "+num+" from 1 is "+sum);
	}
}
