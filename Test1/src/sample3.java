public class sample3 {
    public static void main(String[] args) {
        int i,j;
        boolean flag;
        for (i=2;i<=100;i++){
            flag=true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                System.out.println(i);
        }
    }
}
