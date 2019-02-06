package com.mycompany.app;

public class App {

    public static void main(String[] args) {

    	double num1, num2;
        num1 = Double.parseDouble(args[0]);
        num2 = Double.parseDouble(args[1]);

	double output = num1+num2;
        System.out.println(num1+" + "+num2+": "+output);
    }
}
