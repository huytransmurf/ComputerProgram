/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LAPTOP ACER
 */
public class NormalCalculator {

    private double number;
    public static double memory;
    private char operator;

    public NormalCalculator() {
    }

    public NormalCalculator(double number, char operator) {
        this.number = number;
        this.operator = operator;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void doCalculate() {
        switch (operator) {
            case '+':
                memory+=number;
                break;
            case '-':
                memory -= number;
                break;
            case '/':
                memory/=number;
                break;
            case '*':
                memory*=number;
                break;
            case '^':
                 memory = Math.pow(memory, number);
                 break;
        }
    }

    @Override
    public String toString() {
        return "Memory: " + memory;
    }

}
