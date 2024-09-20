package SUM;

public class sumlogic {
    int sum(int arr[]){ //Define Method
        int sum=0,i;
        for(i=0;i<arr.length;i++) //Loop for Iteration (Replace Arr.length with iterations for input based)
        {
            sum=sum+arr[i]; //SUM fx.
        }
        return sum; //Returing Value to Method
    }
}
