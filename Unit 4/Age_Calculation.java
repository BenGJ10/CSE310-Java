/* Ram is building a birthday reminder system for a website. The system needs to calculate the user's 
 current age based on the birth date and current date provided by the user. Both the birth date and the 
 current date will be inputted in the format dd/MM/yyyy. The system should : 
    Accept the user's birth date and the current date as input.
    Calculate the user's age in years based on these two dates.
    If the user has already had their birthday this year, the system should display their age.
    If the user’s birthday is still to come, the system should subtract one year from the calculated age.
*/
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class AgeCalculator {
    
    public int calculateAge(String birthDateStr, String currentDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        LocalDate currentDate = LocalDate.parse(currentDateStr, formatter);
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);
        
        int age = currentDate.getYear() - birthDate.getYear();
        
        if(currentDate.getMonthValue() < birthDate.getMonthValue() || 
        currentDate.getMonthValue() == birthDate.getMonthValue() && currentDate.getDayOfMonth() < birthDate.getDayOfMonth()){
            age--;
        }
        return age;
    }
}

public class Age_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String birthDateStr = scanner.nextLine();
        String currentDateStr = scanner.nextLine();
        
        
        AgeCalculator ageCalculator = new AgeCalculator();
        int age = ageCalculator.calculateAge(birthDateStr, currentDateStr);
        
       
        System.out.println(age);
        
        scanner.close();
    }
}
