package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: "); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ");
        result.append("Total tip: ");
        result.append("Total Bill with tip: ");
        result.append("Per person cost before tip: ");
        result.append("Tip per person: ");
        result.append("Total cost per person: ");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people; 
        int percent;
        double cost;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
