/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmigui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author rfoote/Reges/Stepp from "Building Java Programs"
 */
public class BmiGui implements ActionListener {
    private JFrame frame;
    private JTextField heightField;
    private JTextField weightField;
    private JLabel bmiLabel;
    private JButton computeButton;
    
    public BmiGui() {
	heightField = new JTextField(5);
	weightField = new JTextField(5);
	bmiLabel = new JLabel("Type your height and weight");
	computeButton = new JButton("Compute");
	computeButton.addActionListener(this);
	
	//layout time...
	JPanel north = new JPanel(new GridLayout(2,2));
	north.add(new JLabel("Height:"));
	north.add(heightField);
	north.add(new JLabel("Weight:"));
	north.add(weightField);
	
	frame = new JFrame("BMI");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new BorderLayout());
	frame.add(north, BorderLayout.NORTH);
	frame.add(bmiLabel, BorderLayout.CENTER);
	frame.add(computeButton, BorderLayout.SOUTH);
	
	frame.pack();
	frame.setVisible(true);
	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	String heightText = heightField.getText();
	//scrub and doubleify the input 
	double height = Double.parseDouble(heightText);
	String weightText = weightField.getText();
	double weight = Double.parseDouble(weightText);
	
	//compute BMI and display it on screen
	double bmi = weight / ((height * height) * 703);
	bmiLabel.setText("BMI: " + bmi);
    }
    
    
    
    

}
