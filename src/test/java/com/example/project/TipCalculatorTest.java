package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipCalculatorTest {
    @Test
    void testCalculateTip(){
        TipCalculator calculator = new TipCalculator();
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $52.27\n" +
                                "Total percentage: 25%\n" +
                                "Total tip: $13.07\n" +
                                "Total Bill with tip: $65.34\n" +
                                "Per person cost before tip: $8.71\n" +
                                "Tip per person: $2.18\n" +
                                "Total cost per person: $10.89\n" +
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testCalculateTip2(){
        TipCalculator calculator = new TipCalculator();
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $566.97\n"+
                                "Total percentage: 15%\n"+
                                "Total tip: $85.05\n"+
                                "Total Bill with tip: $652.02\n"+
                                "Per person cost before tip: $47.25\n"+
                                "Tip per person: $7.09\n"+
                                "Total cost per person: $54.33\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }
    
    @Test
    void testCalculateTip3(){
        TipCalculator calculator = new TipCalculator();
        int people = 2;
        int percent = 5;
        double cost = 29.56;
        String expectedOutput = "-------------------------------\n" +
                                "Total bill before tip: $29.56\n"+
                                "Total percentage: 5%\n"+
                                "Total tip: $1.48\n"+
                                "Total Bill with tip: $31.04\n"+
                                "Per person cost before tip: $14.78\n"+
                                "Tip per person: $0.74\n"+
                                "Total cost per person: $15.52\n"+
                                "-------------------------------\n";
        String studentOutput = calculator.calculateTip(people,percent, cost);
        assertEquals(expectedOutput,studentOutput);
    }
    
}
