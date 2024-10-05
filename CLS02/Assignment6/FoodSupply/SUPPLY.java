package CLS02.Assignment6.FoodSupply;
import java.util.Scanner;
/**
 * SUPPLY
 */
public class SUPPLY {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    String GetType(){
        if(Sticker.equals("Green")){
            FoodType="Vegetarian";
        }
        else if(Sticker.equals("Yellow")){
            FoodType="Contains Egg";
        }
        else if(Sticker.equals("Red")){
            FoodType="Non Vegetarian";
        }
        else {System.out.println("Invalid FoodType");}
        return FoodType;
    }

    void FoodIn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Food Code: ");
        Code=sc.nextInt();
        System.out.println("Enter Food Name: ");
        FoodName=sc.next();
        System.out.println("Enter Food Sticker: ");
        Sticker=sc.next();
        GetType();
        sc.close();
    }

    void FoodOut(){
        System.out.println("Food Supply: ");
        System.out.println(Code+" "+FoodName+" "+Sticker+" "+FoodType);
    }
}