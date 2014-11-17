/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optionpanetests;

import javax.swing.JOptionPane;

/**
 *
 * @author rfoote
 */
public class OptionPaneTests {

    public static void main(String[] args) {
	int age = 0;
	double money = 0.0;
	
	while (age == 0) {
	    try {
		String ageText = JOptionPane.showInputDialog(args, "How old are you?");
		age = Integer.parseInt(ageText);
	    }
	    catch (NumberFormatException nfe) {
		age = 0;
		JOptionPane.showMessageDialog(null, "Are you sure that's a number?\n Try again.");
	    }
	}
	
	while (money == 0.0) {
	    try {
		String moneyText = JOptionPane.showInputDialog(null, "How much do you make?");
		money = Double.parseDouble(moneyText);
	    }
	    catch (NumberFormatException nfe) {
		money = 0.0;
		JOptionPane.showMessageDialog(null, "Is that actually an amount of money?\n Try again.");
	    }
	}
	
	JOptionPane.showMessageDialog(null, "If you can double your money each year\n" +
		"you'll have " + (money * 32) + 
		" dollars at age " + (age + 5) + "!");
    }
    
}
