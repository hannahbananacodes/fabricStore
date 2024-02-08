//AUTHOR: Hannah Holmes
//COURSE: CPT 167
//PURPOSE: Create a program for the quilt shop
//STARTDATE: 23 Jan 2024

package edu.tridenttech.holmes.program2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//declare variables
		String welcomeMessage = "Hi, welcome to Quincy's Quilt Shop!";
		String userName = null;
		String farewellMessage = "Thanks for stopping by, ";
		String FABRIC_FLORAL = "Floral";
		String FABRIC_SOLID = "Solid";
		String FABRIC_GEO = "Geometric";
		final double FLORAL_PRICE = 4.99;
		final double SOLID_PRICE = 5.49;
		final double GEO_PRICE = 9.99;
		final double DISCOUNT_SMALL = 5.00;
		final double DISCOUNT_MED = 15.00;
		final double DISCOUNT_LARGE = 0.10;
		final double PERCENT_TAX = 0.075;
		double menuSelection = 0;
		String fabricSelection = null;
		double fabricPrice = 0;
		double numOfYards;
		double yardagePrice;
		double discountAmount;
		double subtotal;
		double costTax;
		double grandTotal;
		
		// scanner
		Scanner console = new Scanner(System.in);
		
		//print welcome message
		System.out.println(welcomeMessage);
		
		//get user name
		System.out.println("Please enter your name.");
		userName = console.nextLine();
		
		//display options + get fabric selection
		System.out.println("Please make a selection by typing a number choice.");
		System.out.printf("%-5s%-15s%1s%3.2f\n","[1]",FABRIC_FLORAL,"$",FLORAL_PRICE);
		System.out.printf("%-5s%-15s%1s%3.2f\n","[2]",FABRIC_SOLID,"$",SOLID_PRICE);
		System.out.printf("%-5s%-15s%1s%3.2f\n","[3]",FABRIC_GEO,"$",GEO_PRICE);
		System.out.printf("%-5s%-15s\n","[4]","Quit");
		menuSelection = console.nextDouble();
		
		//first selection
		if (menuSelection == 1) {
			fabricSelection = FABRIC_FLORAL;
			fabricPrice = FLORAL_PRICE;
		} else if (menuSelection == 2) {
			fabricSelection = FABRIC_SOLID;
			fabricPrice = SOLID_PRICE;
		} else if (menuSelection == 3) {
			fabricSelection = FABRIC_GEO;
			fabricPrice = GEO_PRICE;
		} else {
			fabricSelection = null;
		}
		
		//get yardage and calculate cost
		if (fabricSelection != null) {
		System.out.println("Please enter the number of yards to purchase.");
		numOfYards = console.nextDouble();
		yardagePrice = numOfYards * fabricPrice;
		
		//second selection
		if (yardagePrice >= 200) {
			discountAmount = yardagePrice * DISCOUNT_LARGE;
		} else if (yardagePrice >= 100) {
			discountAmount = DISCOUNT_MED;
		} else if (yardagePrice >= 50) {
			discountAmount = DISCOUNT_SMALL;
		} else {
			discountAmount = 0;
		}
		
		// calculate totals
		subtotal = yardagePrice - discountAmount;
		costTax = subtotal * PERCENT_TAX;
		grandTotal = subtotal + costTax;
		
		//display totals
		System.out.println("Here are your selections and totals:");
		System.out.printf("%-30s%-15s\n","Fabric Type: ",fabricSelection);
		System.out.printf("%-30s%1s%3.2f\n","Fabric Price: ","$",fabricPrice);
		System.out.printf("%-30s%3.2f\n","Number of yards: ",numOfYards);
		System.out.printf("%-30s%1s%3.2f\n","Yardage price: ","$",yardagePrice);
		System.out.printf("%-30s%1s%3.2f\n","Discount amount: ","$",discountAmount);
		System.out.printf("%-30s%1s%3.2f\n","Tax: ","$",costTax);
		System.out.printf("%-30s%1s%3.2f\n","Grand total: ","$",grandTotal);
		
		}
		//display farewell message
		System.out.println(farewellMessage + userName + ".");
		
		console.close();
	}

}
