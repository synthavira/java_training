package com.example.assignment;

import java.util.Scanner;

public class OxygenPlants {
	 public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter floor area of the room(m*m)");
	       double floorArea = sc.nextDouble();
	       System.out.println("Enter  plant area of a single plant(in cm2)");
	       double plantArea = sc.nextDouble();
	       plantArea = plantArea / 10000;
	       double totalPlants = floorArea / plantArea;
	       totalPlants = Math.round(totalPlants / 10) * 10;
	       double totalOxygen = totalPlants * 0.9;
	       System.out.println("Total no of plants is " + totalPlants);
	       System.out.println("Total production of oxygen is  "+totalOxygen);
	       sc.close();

	   }
}
