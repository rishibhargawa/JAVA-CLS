package ArrayQues;

public class sortarr {
    public static void main(String[] args) {
        sortarrlogic object=new sortarrlogic();
        int arr[]={76,22,43,690,349,439,21,23,9853};
        int arr1[]=object.ar1(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
