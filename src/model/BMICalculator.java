/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LAPTOP ACER
 */
public class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator(double height, double weight) {
        this.height = height/100;
        this.weight = weight;
    }

    public BMICalculator() {
    }

    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public double getWeight() {
        return weight;
    }

   
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double calculateBMI(){
        return weight/(height*height);
    }
    public void displayNotification(){
        double bmi = calculateBMI();
        System.out.println("BMI: "+String.format(String.format("%.1f", bmi)));
        if (bmi < 19){
            System.out.println("Under-standard: BMI is less than 19");
        } else if (bmi <25) {
            System.out.println("Standard: BMI is between 19-25");
        } else if( bmi<30){
            System.out.println("Overweight: BMI is between 25-30");
        } else if (bmi <40){
            System.out.println("Fat - should lose weight : BMI is between 30-40");
        } else System.out.println("Very fat - should lose weight immediately: BMI is over 40");
    }
}
