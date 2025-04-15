/* Janani aims to create a versatile palindrome checker capable of handling both numeric values 
and words. The base class, PalindromeChecker, features a parameterized constructor that takes an 
integer as input. It includes a method, isPalindrome(), which determines whether the given integer is 
a palindrome. Include a method displayResult() to print the result of the palindrome check for numbers.
The subclass, WordPalindromeChecker, is derived from the base class. This subclass overrides the 
isPalindrome() method to accommodate word inputs, treating them case-insensitively. The overridden 
displayResult() method ensures that the outcome of the word palindrome check is appropriately printed.
Create instances of both classes in the main class and display the results. */

import java.util.Scanner;

class PalindromeChecker {
    protected int number;
    public PalindromeChecker(int number){
        this.number = number;
    }
    
    public boolean isPalindrome(){
        int org = number, rev = 0, rem;
        while(org > 0){
            rem = org % 10;
            rev = rev * 10 + rem;
            org /= 10;
        }
        return number == rev;
    }
    
    public void displayResult(){
        if(isPalindrome()){
            System.out.println("The number is a palindrome.");
        } else{
            System.out.println("The number is not a palindrome.");
        }
    }
}

class WordPalindromeChecker extends PalindromeChecker {
    protected String word;
    public WordPalindromeChecker(String word){
        super(0);
        this.word = word;
    }
    @Override
    public boolean isPalindrome(){
        String lowerCaseWord = word.toLowerCase();
        int left = 0, right = lowerCaseWord.length() - 1;
        
        while(left < right){
            if(lowerCaseWord.charAt(left) != lowerCaseWord.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    @Override
    public void displayResult(){
        if(isPalindrome()){
            System.out.println("The word is a palindrome.");
        } else{
            System.out.println("The word is not a palindrome.");
        }
    }
}

public class PalindromeCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        PalindromeChecker numberChecker = new PalindromeChecker(number);
        numberChecker.displayResult();

        scanner.nextLine();
        String word = scanner.nextLine();

        WordPalindromeChecker wordChecker = new WordPalindromeChecker(word);
        wordChecker.displayResult();

        scanner.close();
    }
}