package com.zaleus3.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class GUIInit
{
	private JLabel lengthL, widthL, areaL;
	    static JTextField lengthTF;
		static JTextField widthTF;
		static JTextField areaTF;
	    private JButton calculateB, exitB;
	    private CalculateHandler cbHandler;
	    private ExitHandler ebHandler;
	    //Button handlers:
	    //private CalculateButtonHandler cbHandler;
	    //private ExitButtonHandler ebHandler;

	public GUIInit()
	{
		JPanel mainGUI = new JPanel(new BorderLayout(20, 20));
		lengthL = new JLabel("Enter the length: ");
		
		widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaL = new JLabel("Area: ", SwingConstants.RIGHT);
		
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateHandler();
		calculateB.addActionListener(cbHandler);
		exitB = new JButton("Exit");
		ebHandler = new ExitHandler();
		exitB.addActionListener(ebHandler);
		mainGUI.setSize(640, 480);
		mainGUI.setVisible(true);
	}
	
}
