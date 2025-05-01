/* Arjun is working on an analytics tool that processes numerical data from different sources, 
 such as stock prices and sales reports. The tool needs to identify the highest and second-highest 
 values in a dataset and swap them. 
 Your task is to help Arjun implement a custom generic class. */

import java.util.*;

class GenericSwapper<T extends Number>{
    private T[] array;

    public GenericSwapper(T[] array){
        this.array = array;
    }
    
    public void displayArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void swapFirstAndSecondHighest(){
        int firstIndex = -1, secondIndex = -1;
        double firstMax = Double.NEGATIVE_INFINITY, secondMax = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < array.length; i++){
            double value = array[i].doubleValue(); 
            if(value > firstMax){
                secondMax = firstMax;
                secondIndex = firstIndex;

                firstMax = value;
                firstIndex = i;
            } else if(value > secondMax && value < firstMax){
                secondMax = value;
                secondIndex = i;
            }
        }

        if(firstIndex != -1 && secondIndex != -1){
            T temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
        }
    }
}

public class CustomGenericClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int size = scanner.nextInt();

        if (choice == 1) {

            Integer[] intArray = new Integer[size];
            for (int i = 0; i < size; i++) {
                intArray[i] = scanner.nextInt();
            }

            GenericSwapper<Integer> swapper = new GenericSwapper<>(intArray);
            System.out.println("Original Array:");
            swapper.displayArray();

            swapper.swapFirstAndSecondHighest();
            System.out.println("Array after swapping highest and second highest:");
            swapper.displayArray();

        } else if (choice == 2) {

            Double[] doubleArray = new Double[size];
            for (int i = 0; i < size; i++) {
                doubleArray[i] = scanner.nextDouble();
            }

            GenericSwapper<Double> swapper = new GenericSwapper<>(doubleArray);
            System.out.println("Original Array:");
            swapper.displayArray();

            swapper.swapFirstAndSecondHighest();
            System.out.println("Array after swapping highest and second highest:");
            swapper.displayArray();
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}