/* Emma, an eco-conscious consumer, wants to calculate the energy cost based on her energy usage. 
 The program should allow Emma to input the number of usage hours and specify whether they are during 
 peak (hour type 1) or off-peak (hour type 2) hours.
 The program should calculate the energy cost using:

 0.15 per hour for peak hours (hour type 1).
 0.08 per hour for off-peak hours (hour type 2).
 Your task is to write a program consisting of two classes:

 EnergyPricing (main class) that prompts the user for input (number of usage hours and hour type).
 EnergyCostCalculatorInterface (interface) that defines the calculateCost method.

 Implement the calculateCost method using an anonymous inner class that calculates the energy cost 
 based on the input values. */

import java.util.Scanner;

interface EnergyCostCalculatorInterface{
    double calculateEnergyCost(int hours)
}

class EnergyCalculator{
    public static double calculateEnergyCost(int usageHours, int hourType){
        if(hourType == 1) {
            EnergyCostCalculatorInterface peakCostCalculator = new EnergyCostCalculatorInterface() {
                double calculateEnergyCost(int usageHours){
                    return usageHours * 0.15;
                }
            };
            return peakCostCalculator.calculateEnergyCost(usageHours);
        }
         else if (hourType == 2) {
            EnergyCostCalculatorInterface offPeakCostCalculator = new EnergyCostCalculatorInterface() {
                double calculateEnergyCost(int usageHours){
                    return usageHours * 0.08;
                }
            };
            return offPeakCostCalculator.calculateEnergyCost(usageHours);
        }
         else{
            return -1;
         }
    }
}

public class Anonymous_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int usageHours = scanner.nextInt();
        int hourType = scanner.nextInt();
        
  
        double energyCost = EnergyCalculator.calculateEnergyCost(usageHours, hourType);
        
        if (energyCost > 0) {
            System.out.println("Energy cost: " + String.format("%.2f", energyCost));
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
