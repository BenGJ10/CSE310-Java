/* Sabrina is working on a project that involves analyzing a set of numbers. In her exploration, 
 she encounters scenarios where extracting even numbers and finding their sum is essential.
 Create a program that calculates the sum of even numbers from a given array of integers using a 
 functional interface. Define a functional interface for checking even numbers and calculating the sum.
 */

import java.util.Scanner;

@FunctionalInterface
interface EvenChecker{
    boolean isEven(int number);
}

class EvenSumCalculator{
    public int calculateEvenSum(int[] numbers, EvenChecker checker){
        int sum = 0;
        for(num : numbers){
            if(checker.isEven(num)){
                sum += num;
            }
        }
        return sum;
    }
}
public class Lambda_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        EvenSumCalculator calculator = new EvenSumCalculator();
        
        int sum = calculator.calculateEvenSum(numbers, (n) -> n % 2 == 0);
        System.out.println(sum);
        scanner.close();
    }
}
