import java.util.Scanner; //import the Scanner class 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
 

public class DaysCalculator {

    public static void main(String []args){
        // int countryCode;
        // int middleNumber;
        // int endNumber;
        // String userPhoneNumber = "44-123-123";
        // String[] userNumberArray = userPhoneNumber.split("-");
        // countryCode = Integer.parseInt(userNumberArray[0]);
        // middleNumber = Integer.parseInt(userNumberArray[1]);
        // endNumber = Integer.parseInt(userNumberArray[2]);
        // System.out.println("country code is " + countryCode + "/n middle is " + middleNumber + "/n endnumber is" + endNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth in format DD/MM/YYYY: ");
        // user to input a date in format DD/MM/YYYY
        String userInputDate = scanner.nextLine();
       int year;
       int month;
       int dayOfMonth; 
       String userInputDate2 = "1/1/2001";
       String[] userDateArray = userInputDate2.split("/");
       dayOfMonth = Integer.parseInt(userDateArray[0]);
       month = Integer.parseInt(userDateArray[1]);
       year = Integer.parseInt(userDateArray[2]);
       System.out.println(month);

        LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
        LocalDate currentDate = LocalDate.now(); 
       
        // 4. print out the result
        long days = ChronoUnit.DAYS.between(birthDate, currentDate);
        
        System.out.println("You have lived for " + days + " days.");
        scanner.close();
    }
}
