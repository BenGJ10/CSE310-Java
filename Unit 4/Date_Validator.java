import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class DateValidator{
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static boolean isValidFormate(String dateStr){
        try{
            LocalDate.parse(dateStr, formatter){
                return true;
            } catch(DateTimeParseException e){
                return false;
            }
        }
    }

    public static String validateDate(String checkInStr, String startStr, String endStr){
        LocalDate checkInDate = LocalDate.parse(checkInStr, formatter);
        LocalDate startDate = LocalDate.parse(startStr, formatter);
        LocalDate endDate = LocalDate.parse(endStr, formatter);

        if((checkInDate.isEqual(startDate)) || (checkInDate.isAfter(startDate)) &&
        (checkInDate.isEqual(endDate)) || (checkInDate.isBefore(endDate))){
            return checkInStr + " is a valid booking date";
        }
        else{
            return checkInStr + " is outside the valid booking range";
        }
    }    
}
public class Date_Validator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String checkInDate = scanner.nextLine();
       String startDate = scanner.nextLine();
       String endDate = scanner.nextLine();
       

       if (!DateValidator.isValidFormat(checkInDate)) {
           System.out.println(checkInDate + " is not in the correct format");
           return;
       }
       
       String result = DateValidator.validateDate(checkInDate, startDate, endDate);
       System.out.println(result);
       
       scanner.close();
   }
}
