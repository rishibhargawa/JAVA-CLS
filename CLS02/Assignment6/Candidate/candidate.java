package CLS02.Assignment6.Candidate;

import java.util.Scanner;

public class candidate {
    int Rno;
    String Name;
    float Score;
    String Remarks;

    String AssignRem(){
        if (Score>=50){
            Remarks="Selected";
        }
        else{
            Remarks="Not selected";
        }
        return Remarks;
    }

    void Enter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details: ");
        System.out.print("Enter RollNumber: ");
        Rno=sc.nextInt();
        System.out.print("Name of Candidate: ");
        Name=sc.next();
        System.out.print("Enter the Score: ");
        Score=sc.nextFloat();
        AssignRem();
        sc.close();
    }

    void Display(){
        System.out.println("Here is the result for the candidate: ");
        System.out.println("Roll Number: "+Rno+" "+"Name: "+Name+" "+"Score: "+Score+" "+"Remarks: "+AssignRem());
    }
}
