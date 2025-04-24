/* Alex is a young inventor who dreamed of creating a magical machine. This machine could take a 
 series of numbers, perform a special mathematical trick, and reveal their transformed values.
 Write a program that takes an array of integers as input, and calculates the square of each element 
 using a functional interface. */


import java.util.Scanner;

@FunctionalInterface
interface SquareFunction{
    int apply(int number);
}

class Calculator{
    public int calculateSquares(int[] numbers){
        SquareFunction square = (n) -> n * n;

        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            result[i] = sqaure.apply(numbers[i]);
        }
        return result;
    }
}
public class Lambda_Function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        Calculator calculator = new Calculator();
        int[] squaredNumbers = calculator.calculateSquares(numbers);

        StringBuilder result = new StringBuilder();
        for (int square : squaredNumbers) {
            result.append(square).append(" ");
        }

        System.out.println(result.toString().trim());
        scanner.close();
    }
}
