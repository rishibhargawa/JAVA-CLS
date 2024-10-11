/**
 * resort
 */
import java.util.Scanner;
public class resort {

    int RNo;
    String NameStr;
    double Charges;
    int Days;

    double Compute(){
        double charges_total=0;
        charges_total=Days*Charges;
        if (charges_total>11000) {
            charges_total=charges_total*1.02;
        }
        return charges_total;
    }
    void Getinfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Details: ");
        System.out.print("RoomNo: ");
        RNo=sc.nextInt();
        System.out.print("Your Name: ");
        NameStr=sc.next();
        System.out.print("Enter Charges: ");
        Charges=sc.nextDouble();
        System.out.print("Enter Days: ");
        Days=sc.nextInt();
        sc.close();
    }

    void DispInfo(){
        System.out.println("Summary of Details are as follow: ");
        System.out.println("Room No: "+RNo+" "+"Name: "+NameStr+" "+"Days: "+Days+" "+"Charges: "+Compute());
    }
}