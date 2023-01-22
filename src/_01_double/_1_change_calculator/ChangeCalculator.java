package _01_double._1_change_calculator;

import java.awt.PrintJob;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have");
int nickel = Integer.parseInt(nickels);
String dimes = JOptionPane.showInputDialog("How many dimes do you have");
int dime = Integer.parseInt(dimes);
String quarters = JOptionPane.showInputDialog("How many quarters do you have");
int quarter = Integer.parseInt(quarters);
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double n = nickel * 0.05;
double d = dime * 0.10;
double q = quarter * 0.25;

double cash = d + q + n;
JOptionPane.showMessageDialog(null, "You have " + cash);
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

