/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import java.awt.*;
import java.awt.event.*;   // for action events 
import javax.swing.*;

/**
 * @author rfoote
 */
public class JFrames {
    public static void main(String[] args) {
	//simple JFrame 1
	JFrame sFrame1 = new JFrame();
	sFrame1.setForeground(Color.BLACK);
	sFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	sFrame1.setLocation(new Point(100,100));
	sFrame1.setSize(new Dimension(300,100));
	sFrame1.setTitle("Simple Frame 1");

	//add Buttons
	JButton sf1Button1 = new JButton();
	sf1Button1.setText("SF1 Button 1");
	sFrame1.add(sf1Button1);
	
	JButton sf1Button2 = new JButton();
	sf1Button2.setText("SF1 Button 2");
	sf1Button2.setBackground(Color.YELLOW);
	sFrame1.add(sf1Button2);
	
	sFrame1.setVisible(true);
	
	//--------------------------------
	
	//simple JFrame 2 (with layout)
	JFrame sFrame2 = new JFrame();
	sFrame2.setForeground(Color.BLACK);
	sFrame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//set location immediately below sFrame1 
	sFrame2.setLocation(new Point(100,220));
	//dimension redundant with Frame.pack() ??
	//sFrame2.setSize(new Dimension(300, 100));
	sFrame2.setTitle("Simple Frame 2");
	
	//set layout
	sFrame2.setLayout(new FlowLayout());
	
	//add Buttons
	JButton sf2Button1 = new JButton();
	sf2Button1.setText("SF2 Button 1");
	sFrame2.add(sf2Button1);
	
	JButton sf2Button2 = new JButton();
	sf2Button2.setText("SF2 Button 2");
	sf2Button2.setBackground(Color.YELLOW);
	sFrame2.add(sf2Button2);
	
	//frame pack trims excess whitespace
	sFrame2.pack();
	sFrame2.setVisible(true);
	
	//--------------------------------
	
	//simple frame 3 implements buttons using grid layout
	JFrame sFrame3 = new JFrame("Simple Frame 3");
	sFrame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//set location immediately below sFrame2
	sFrame3.setLocation(new Point(100,300));
	//using GridLayout
	sFrame3.setLayout(new GridLayout(2,3));
	for (int i = 1; i <= 6; i++) {
	    sFrame3.add(new JButton("SF3 Button " + i));
	}
	sFrame3.pack();
	sFrame3.setVisible(true);
	
	//--------------------------------
	
	//simple frame 4 implements buttons using border layout
	JFrame sFrame4 = new JFrame("Simple Frame 4");
	sFrame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//set location immediately below sFrame3
	sFrame4.setLocation(new Point(100, 400));
	//using BorderLayout
	sFrame4.setLayout(new BorderLayout());
	sFrame4.add(new JButton("north"), BorderLayout.NORTH);
	sFrame4.add(new JButton("east"), BorderLayout.EAST);
	sFrame4.add(new JButton("south"), BorderLayout.SOUTH);
	sFrame4.add(new JButton("west"), BorderLayout.WEST);
	sFrame4.add(new JButton("center"), BorderLayout.CENTER);
	
	sFrame4.pack();
	sFrame4.setVisible(true);
	
	//---------------------------------
	
	//telephone keypad GUI
	JFrame tFrame = new JFrame("Telephone");
	tFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	tFrame.setSize(new Dimension(250, 200));
	tFrame.setLocation(new Point(100, 520));
	tFrame.setLayout(new BorderLayout());
	
	//main phone buttons
	JPanel centerPanel = new JPanel(new GridLayout(4,3));
	for (int i = 1; i <= 9; i++) {
	    centerPanel.add(new JButton("" + i));
	}
	centerPanel.add(new JButton("*"));
	centerPanel.add(new JButton("0"));
	centerPanel.add(new JButton("#"));
	
	tFrame.add(centerPanel, BorderLayout.CENTER);
	
	//south status panel
	JPanel southPanel = new JPanel(new FlowLayout());
	southPanel.add(new JLabel("Number to dial: "));
	southPanel.add(new JTextField(10));
	tFrame.add(southPanel, BorderLayout.SOUTH);
	
	tFrame.setVisible(true);
	
	//---------------------------------
	
	//Send message panel
	JFrame mFrame = new JFrame("Send Message");
	mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	mFrame.setSize(new Dimension(400, 250));
	mFrame.setLocation(new Point(500, 100));
	mFrame.setLayout(new BorderLayout());
	
	JPanel northEast = new JPanel(new GridLayout(3,1));
	northEast.add(new JButton("Browse..."));
	northEast.add(new JButton("Browse..."));
	
	JPanel northCenter = new JPanel(new GridLayout(3,1));
	northCenter.add(new JTextField());
	northCenter.add(new JTextField());
	northCenter.add(new JTextField());
	
	JPanel northWest = new JPanel(new GridLayout(3,1));
	northWest.add(new JLabel("From: "));
	northWest.add(new JLabel("To: "));
	northWest.add(new JLabel("Subject: "));
	
	JPanel north = new JPanel(new BorderLayout());
	north.add(northWest, BorderLayout.WEST);
	north.add(northCenter, BorderLayout.CENTER);
	north.add(northEast, BorderLayout.EAST);
	
	mFrame.add(north, BorderLayout.NORTH);
	mFrame.add(new JTextField(), BorderLayout.CENTER);
	mFrame.add(new JButton("Send"), BorderLayout.SOUTH);
	
	mFrame.setVisible(true);
	
    }
    
}
