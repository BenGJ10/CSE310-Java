import java.util.Scanner;

class CommonElementsFinder<T> {
    private T[] array1;
    private T[] array2;

    public CommonElementsFinder(T[] array1, T[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    public void displayArrays(){
        System.out.print("First Array:");
        for (T element : array1) {
            System.out.print(" " + element);
        }
        System.out.println();

        System.out.print("Second Array:");
        for (T element : array2) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    public void findCommonElements(){
        boolean found = false;

        for(T elem1 : array1){
            for(T elem2 : array2){
                if(elem1 == elem2){
                    if(!found){
                        System.out.print("Common Elements:");
                        found = true;
                    }
                    System.out.print(" " + element1);
                    break; 
                }
            }
        }
    }
}

public class GenericCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int N = scanner.nextInt();

        if (choice == 1) {
            Integer[] array1 = new Integer[N];
            for (int i = 0; i < N; i++) {
                array1[i] = scanner.nextInt();
            }

            int M = scanner.nextInt();
            Integer[] array2 = new Integer[M];
            for (int i = 0; i < M; i++) {
                array2[i] = scanner.nextInt();
            }

            CommonElementsFinder<Integer> finder = new CommonElementsFinder<>(array1, array2);
            finder.displayArrays();
            finder.findCommonElements();
        } 
        else if (choice == 2) {
            Double[] array1 = new Double[N];
            for (int i = 0; i < N; i++) {
                array1[i] = scanner.nextDouble();
            }

            int M = scanner.nextInt();
            Double[] array2 = new Double[M];
            for (int i = 0; i < M; i++) {
                array2[i] = scanner.nextDouble();
            }

            CommonElementsFinder<Double> finder = new CommonElementsFinder<>(array1, array2);
            finder.displayArrays();
            finder.findCommonElements();
        }
        scanner.close();
    }    
}
