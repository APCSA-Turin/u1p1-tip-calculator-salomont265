package com.example.project;
import java.math.BigDecimal;

import java.math.RoundingMode;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        

        double costTip = cost * (double)(percent/100.0);
        BigDecimal bigDecimal = new BigDecimal(costTip);
        BigDecimal costTipRound = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        double totalBill = cost + costTip;
        BigDecimal bigDecimal1 = new BigDecimal(totalBill);
        BigDecimal totalBillRound = bigDecimal1.setScale(2, RoundingMode.HALF_UP);

        double personCostBeforeTip = cost/people;
        BigDecimal bigDecimal2 = new BigDecimal(personCostBeforeTip);
        BigDecimal personCostBeforeTipRound = bigDecimal2.setScale(2, RoundingMode.HALF_UP);

        double personCostTip = costTip/people;
        BigDecimal bigDecimal3 = new BigDecimal(personCostTip);
        BigDecimal personCostTipRound = bigDecimal3.setScale(2, RoundingMode.HALF_UP);

        double personCostAfterTip = personCostTip +personCostBeforeTip;
        BigDecimal bigDecimal4 = new BigDecimal(personCostAfterTip);
        BigDecimal personCostAfterTipRound = bigDecimal4.setScale(2, RoundingMode.HALF_UP);

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" +cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "  + percent+"%"+"\n" );
        result.append("Total tip: " + "$" + costTipRound + "\n" );
        result.append("Total Bill with tip: " +"$" + totalBillRound+"\n" );
        result.append("Per person cost before tip: " + "$" + personCostBeforeTipRound+"\n" );
        result.append("Tip per person: " +"$" + personCostTipRound+"\n" );
        result.append("Total cost per person: " +"$" +personCostAfterTipRound+"\n" );
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;           
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
