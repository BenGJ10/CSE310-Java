/* Kenya is implementing a conference registration system where attendees input their names and numbers.
 To address privacy concerns, develop a CustomClass to filter out all the numbers in the system logs.
 Write the program to display the username without the phone number using the toString() method. */

import java.util.Scanner;

class CustomClass {
    protected String username;
    
    public CustomClass(String username){
        this.username = username;
    }

    @Override
    public String toString(){
        
        StringBuilder filtered = new StringBuilder();
        for(char ch : username.toCharArray()){
            if(!Character.isDigit(ch)){
                filtered.append(ch);
            }
        }
        return filtered.toString();
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
    
        CustomClass customObject = new CustomClass(userInput);
        System.out.println(customObject);
    }
}