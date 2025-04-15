import java.util.*;
import java.io.*;

class StringHalfReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);           
        PrintWriter pw = new PrintWriter(System.out);  

        String s = sc.nextLine();                      
        int mid = s.length() / 2;                      

        String firstHalf = s.substring(0, mid);       
        String secondHalf = s.substring(mid);         

        String revFH = new StringBuilder(firstHalf).reverse().toString();  
        String revSH = new StringBuilder(secondHalf).reverse().toString(); 

        pw.println(revFH + " " + revSH);               
        pw.flush();                                    
        sc.close();                                    
    }
}
