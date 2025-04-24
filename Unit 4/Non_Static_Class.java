/* Saran is tasked with designing a program to alphabetize a given string. 
  Implement a class, StringSorter, that takes a string as input and sorts its characters alphabetically.
  The sorting functionality is encapsulated within a non-static nested class, Alphabetizer, which is
  responsible for sorting the characters and returning the result.
  Write a program that takes user input for a string, utilizes the StringSorter class to alphabetize it, 
  and displays the sorted string. */ 


import java.util.Arrays;
import java.util.Scanner;

class Solution{
    class StringSorter{
        protected String input;
        public StringSorter(String input){
            this.input = input;
        }
        
        class Alphabetizer{
            public String sort(){
                char[] chars = input.toCharArray();
                Arrays.sort(chars);
                
                return new String(chars);
            }
        }
        public String alphabetize(){
            Alphabetizer alphabetizer = new Alphabetizer();
            return alphabetizer.sort();
        }
    }
}
public class Non_Static_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Solution solution = new Solution();
        Solution.StringSorter sorter = solution.new StringSorter(input);

        String sortedString = sorter.alphabetize();
        System.out.println(sortedString);

        scanner.close();
    }
}
