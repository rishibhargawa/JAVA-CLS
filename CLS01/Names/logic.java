package Names;
import java.util.Scanner;
public class logic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fs_name=sc.next();
        System.out.print("Enter Last Name: ");
        String ls_name=sc.next();
        System.out.println("Select Designation:");
        System.out.println("1-> Mr.");
        System.out.println("2-> Ms.");
        System.out.print("Your Choice: ");
        int i=sc.nextInt();
        if(i==1){
            System.out.println("Hello Mr. "+fs_name+" "+ls_name);
        }
        else{
            System.out.println("Hello Ms. "+fs_name+" "+ls_name);
        }
    }
}


//MAKE IT USING METHOD