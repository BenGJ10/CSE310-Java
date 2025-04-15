/* Given a single line of input text using Scanner, the program must:
    1. Print the total number of characters.
    2. Print the sum of ASCII values of all characters.
    3. Print a string formed using every alternate character (starting from index 0).
*/

import java.util.Scanner;

public class IO_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // 1. Total number of characters
        int length = input.length();
        System.out.println(length);

        // 2. Sum of ASCII values of all characters
        int asciiSum = 0;
        for (int i = 0; i < length; i++) {
            asciiSum += input.charAt(i);
        }
        System.out.println(asciiSum);

        // 3. Alternate characters 
        StringBuilder alternateChars = new StringBuilder();
        
        for (int i = 0; i < length; i += 2) {
            alternateChars.append(input.charAt(i));
        }
        System.out.println(alternateChars.toString());

        scanner.close();
    }
}
