package CLS02.Assignment6.carrental;
import java.util.Scanner;
/**
 * CarRental
 */
public class CarRental {

    int CarId;
    String CarType;
    float Rent;

    void GetCar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Car Details: ");
        CarId=sc.nextInt();
        CarType=sc.next();
    }

    void GetRent(){
        if (CarType="Small Car") {
            Rent=1000;
        }
    }
}