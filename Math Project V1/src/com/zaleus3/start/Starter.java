package com.zaleus3.start;

import java.io.Console;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

import com.zaleus3.gui.GUIInit;

public class Starter 	
	{
	
	//All of the numbers
 	static double[] scores =	  { 8.4414, 7.3348, 7.8188, 8.4436, 7.9750,
							  		4.8576, 3.8390, 6.2612, 6.9652, 7.7440,
							  		7.7436, 7.2468, 5.6672, 7.0576, 7.7462,
							  		8.2412, 7.7506, 6.3844, 5.7970, 8.6240,
							  		8.1180, 7.5460, 7.6560, 6.8552, 7.5416,
							  		8.3226, 7.3590, 6.6748, 4.8048, 7.2600,
							  		5.2426, 7.5416, 9.1564, 7.9860, 7.4932,
							  		7.4844, 7.7000, 8.2192, 7.4140, 4.6662,
							  		6.9300, 8.5052, 7.7924, 7.2116};
 	//All of the numbers
 	
 
 	
 	public static double Secondaverage(double[] Double)
 	{
 		//Adds numbers together and finds the average
		double sum = 0;
		for(int i=0; i < Double.length; i++)
			sum = sum + Double[i];
		return sum / Double.length;
		//Adds numbers together and finds the average
 	}
 	/*
 	public static double[] InputCalculator()
 	{
 	Console console = System.console();
	System.out.println("Enter the total count of numbers e.g. 30 numbers");
 	String totalnumbers = console.readLine("Numbers: ");
 	int numberint = Integer.parseInt(totalnumbers);
 	double[] scoreinput = new double[0];
 	
 	for(int z = 1; z<=numberint; ++z)
 	{
 		String numinput = console.readLine("Number " + z + ": ");
 		double numconv = Double.parseDouble(numinput);
 		scoreinput = ArrayUtils.add(scoreinput,  numconv);
 	}
 	
 	
		//Adds numbers together and finds the average
	double sum = 0;
	for(int i=0; i < scoreinput.length; i++)
		sum = sum + scores[i];
	double average = sum / scoreinput.length;
	System.out.println("Mean of entered numbers: " + average);
	double[] score2 = new double[0];
	String trialsinput = console.readLine("Number of samples to calculate: ");
	int trialsnumber = Integer.parseInt(trialsinput);
			for(int f = 1; f<=trialsnumber; ++f)
			{	
				score2 = null;
				ArrayUtils.nullToEmpty(score2);
				
				for(int q = 1; q <= 20; ++q)
				{
					Random rand = new Random();
					int grab = rand.nextInt(numberint - 0);
					score2 = ArrayUtils.add(score2, scoreinput[grab]);
				}
				System.out.println("Mean of sample " + f + ": " + Secondaverage(score2));
			}
 	return scoreinput;
 	}
 	*/
	public static void main(String[] args)
	{
		GUIInit gui = new GUIInit();
		//InputCalculator();
		
		
	}

}
