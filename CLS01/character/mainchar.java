import java.util.Scanner;

public class mainchar {
    public static void main(String[] args) {
        logic obj=new logic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Line: ");
        String s1=sc.nextLine();
        obj.str(s1);
    }
}

//MAIN FILE FOR VOWELS AND CONSONANTS