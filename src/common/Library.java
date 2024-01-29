/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

public class Library {

    Scanner sc = new Scanner(System.in);

    public int getInt(String msg) {
        int number;
        while (true) {
            try {
                System.out.println(msg + ": ");
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input a number only!!");
            }
        }
        return number;
    }

    public double getDouble(String msg) {
        double number;
        while (true) {
            try {
                System.out.println(msg + ": ");
                number = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input a number only!!");
            }
        }
        return number;
    }

    public String getString(String msg) {
        System.out.println(msg + ": ");
        return sc.nextLine();
    }

    public char getOperator() {
        char c;
        while (true) {
            String input = getString("Input an operator");
            if (input.length()>1){
                System.out.println("A character only!!!");
            } else {
                c = input.charAt(0);
                switch (c){
                    case '+':
                    case '-':
                    case '/':
                    case '*':
                    case '^':
                    case '=':
                        return c;
                    default:
                        System.out.println("Please input (+, -, *, /, ^)");
                        break;
                }
            }
        }
    }
   
}
