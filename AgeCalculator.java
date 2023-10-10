import java.util.Scanner; //import the Scanner class 
import java.util.Date;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String []args){
         Scanner obj = new Scanner(System.in);
         int age;
         int currentyear = 2023;
         //Date cday;
        System.out.println("Enter age: ");
        age = obj.nextInt();
        int birthyear = currentyear - age; 
        //System.out.println("birth year is: " birthyear); 
        System.out.printf("birth year is %s!%n", birthyear); 
     }
}

