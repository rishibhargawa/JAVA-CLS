package SUM;
//import java.util.Scanner;
public class sum_average {
    public static void main(String[] args) {
        sumlogic obj=new sumlogic();
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your Numbers: ");
        int arr[]={1,2,3,4,5}; //Array Declaration
        //for(int i=0;i<arr.length;i++){ //Loop for Iteration
           //arr[i]=sc.nextInt(); //Input in Array Indexes
        //}
        int result =obj.sum(arr); //Defined result var to call method
        System.out.println("SUM is: "+result);
        System.out.println("Average is: "+result/(float)arr.length);
        //sc.close();   
    }
}

//MAKE IT USING ARRAY (_DONE_)