/* Imagine Tim is developing a user authentication system for a secure application. 
  As part of the security checks, users need to enter two passphrases and the system VowelCountMatching
  class must verify if two entered passphrases have the same number of vowels. Provide the result as 
  'Access Granted' if true, or 'Access Denied' otherwise, along with the count of Vowels using the 
  equals() method.cTim needs your assistance in completing the system. Help him by writing the code. */

import java.util.Scanner;

class VowelCountMatching {
    protected String phrase;

    public VowelCountMatching(String phrase){
        this.phrase = phrase;
    }

    public int countVowels(String phrase){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(char ch : phrase.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    @Override
    // By default, equals() compares object references (memory addresses), which isn't useful here.
    public boolean equals(Object obj){
        // Checks if both references point to the same object
        if (this == obj) return true;
        // Checks if the incoming object is of the correct class type.
        if(obj instanceof VowelCountMatching){
            // Downcasting
            // Converts the generic Object type to VowelCountMatching so you can access its data.
            VowelCountMatching other = (VowelCountMatching) obj;
            return this.countVowels(this.phrase) == other.countVowels(other.phrase);
        }
        return false;
    }
}

public class equalsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        VowelCountMatching object1 = new VowelCountMatching(firstString);
        VowelCountMatching object2 = new VowelCountMatching(secondString);

        boolean result = object1.equals(object2);

        System.out.println(result ? "Access Granted" : "Access Denied");
        System.out.println("First String: " + object1.countVowels(firstString));
        System.out.println("Second String: " + object2.countVowels(secondString));
    }
}
