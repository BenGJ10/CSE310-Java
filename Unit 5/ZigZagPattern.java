
import java.util.*;
import java.io.*;

public class ZigZagPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);              
        PrintWriter pw = new PrintWriter(System.out);     

        int n = sc.nextInt();                             
        int[] arr = new int[n];                           

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();                        
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int left = 0, right = n - 1;                      
        
        while (left <= right) {
            if (left != right) {
                pw.print(arr[right] + " ");               
                pw.print(arr[left] + " ");                
            } else {
                pw.print(arr[left]);                     
            }
            left++;
            right--;
        }

        pw.flush();                                       
        sc.close();                                      
    }
}
