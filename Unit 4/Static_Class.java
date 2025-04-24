/* Develop a Java program for text manipulation that reverses a given string while maintaining the 
  positions of special characters (ie.space). 
  Create a static nested class to efficiently handle the string reversal process, ensuring that the 
  special characters remain unchanged in their original positions. Allow users to input and display 
  the reversed string with preserved special character positions. */

import java.util.Scanner;

class Solution{
    static class StringReversal{

        public String reverseString(String input){
            int size = input.length();
            char result[] = new char[size];
            char inputChars[] = input.toCharArray();

            for(int i = 0; i < size; i++){
                if(inputChars[i] == ' '){
                    result[i] = ' ';
                }
            }

            int j = size - 1;
            for(int i = 0; i < size; i++){
                if(inputChars[i] != ' '){
                    while(j >= 0 && inputChars[j] == ' '){
                        j--;
                    }
                    result[i] = inputChars[j];
                    j--;
                }
            }
            return new String(result);
        }
    }
}

class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String inputString = scanner.nextLine();

        Solution.StringReversalUtils reverser = new Solution.StringReversal();
        String reversedString = reverser.reverseString(inputString);

        System.out.println(reversedString);
        scanner.close();
    }
 }