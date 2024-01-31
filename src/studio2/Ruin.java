package studio2;

import java.util.Scanner;



public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter starting amount: ");
	
		int startAmount = in.nextInt();
		
		System.out.println("Enter the win chance: ");
		
		double winChance = in.nextDouble();
		
		System.out.println("Enter win limit: ");
		
		int winLimit = in.nextInt();
		
	
		int totalSimulations = 0;
		
		for (int x = 0; x<500; x++) {
		
			while (startAmount > 0 && startAmount<winLimit) {
				if (Math.random() < winChance) {
					System.out.println("Simulation " + totalSimulations + ":" + "WIN");
					startAmount++;
					
				}else {
					System.out.println("Simulation " + totalSimulations + ":" + "LOSE");
					startAmount--;
				}
				
				totalSimulations ++;
			}
			System.out.println(startAmount);
		}
			
	}

}
