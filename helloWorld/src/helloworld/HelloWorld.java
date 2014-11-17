/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.*;

/**
 *
 * @author rfoote
 */
public class HelloWorld {

    public static void main(String[] args) {
	//each pane comes in succession.
	//variables are stored for use in successive panes.
	
	//print HW
	JOptionPane.showMessageDialog(null, "Hello, World!");
	
	//read the user's name graphically
	String name = JOptionPane.showInputDialog(null, "What is your name?");
	
	//ask the user a yes/no question
	int choice = JOptionPane.showConfirmDialog(null, "Do you like cake, " + name + "?");
	
	//Show different response based on answer
	if (choice == JOptionPane.YES_OPTION) {
	    JOptionPane.showMessageDialog(null, "Of course, who doesn't?");
	}
	else {
	    //choice == NO_OPTION ir CANCEL_OPTION
	    JOptionPane.showMessageDialog(null, "We'll have to disagree.");
	}
	
    }
    
}
