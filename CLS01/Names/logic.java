package Names;
import java.util.Scanner;
public class logic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fs_name=sc.next();
        System.out.print("Enter Last Name: ");
        String ls_name=sc.next();
        name obj=new name();
        System.out.println(obj.full_name(fs_name, ls_name));
        sc.close();
    }
}


//MAKE IT USING METHOD(_DONE_)