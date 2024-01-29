/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import common.Library;
import model.BMICalculator;
import model.NormalCalculator;
import view.Menu;

/**
 *
 * @author LAPTOP ACER
 */
public class ComputerProgram extends Menu<String> {

    private static String[] mc = {"Normal Calculator", "BMI Calculator", "Exit"};
    private Library lib = new Library();
    private NormalCalculator nCal = new NormalCalculator();
    private BMICalculator bCal = new BMICalculator();

    public ComputerProgram() {
        super("Calculator Program", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                doNormalCalculate();
                break;
            case 2:
                doBMICalculate();
                break;
            case 3:
                System.out.println("Exitting...");
                System.exit(0);
        }
    }
    

    private void doNormalCalculate() {
        NormalCalculator.memory = lib.getDouble("Input a number");
        while (true) {
            char ope = lib.getOperator();
            if (ope == '='){
                System.out.println("Result: "+NormalCalculator.memory);
                break;
            }
            double num = lib.getDouble("Input a number");
            NormalCalculator cal = new NormalCalculator(num, ope);
            cal.doCalculate();
            System.out.println(cal.toString());
        }
    }
   
    private void doBMICalculate() {
        double weight = lib.getDouble("Input your weight");
        double height = lib.getDouble("Input your height");
        BMICalculator bmi = new BMICalculator(height, weight);
        bmi.displayNotification();
    }
}
