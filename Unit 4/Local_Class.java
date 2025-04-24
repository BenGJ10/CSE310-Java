/* Kehlani is a diligent homemaker with a knack for organization and management. She’s planning a 
  system to monitor the expiry dates of groceries to ensure her household always uses fresh items and 
  reduces waste.
  She designed a method monitorExpiryDates that collects the names of groceries and their respective 
  days until expiration. The class ExpiryChecker under the method monitorExpiryDates tracks the items 
  nearing their expiry dates and displays warning messages when they are close to expiration (less than 
  or equal to 7 days).
  Now, help Kehlani by writing a program using the concept of local classes */

import java.util.Scanner;

class GroceryMonitor {
    public void monitorExpiryDates(String[] items, int[] daysRemaining) {
        
        class ExpiryChecker {
            protected String item;
            protected int days;
            
            public ExpiryChecker(String item, int days){
                this.item = item;
                this.days = days;
            }
            public void checkAndWarn(){
                if(days <= 7){
                    System.out.println(item + " is nearing its expiry date. Only " + days + " days left");
                }
            }
        }
        for(int i = 0; i < items.length; i++){
            ExpiryChecker expChecker = new ExpiryChecker(items[i], daysRemaining[i]);
            expChecker.checkAndWarn();
        }
    }
}

public class Local_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int numItems = scanner.nextInt();
    
        String[] groceryItems = new String[numItems];
        int[] daysRemaining = new int[numItems];
    
    
        for (int i = 0; i < numItems; i++) {
            groceryItems[i] = scanner.next();
            daysRemaining[i] = scanner.nextInt();
        }
    
        GroceryMonitor monitor = new GroceryMonitor();
        monitor.monitorExpiryDates(groceryItems, daysRemaining);
    
        scanner.close();
    }
}
