package ArrayQues;

public class sortarrlogic {
    int[] ar1(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            // System.out.println(arr[i]);
        }
        return (arr);
    }
}
