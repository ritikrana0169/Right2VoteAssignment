package com.right2vote;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		 double budget = 600.00;
        double tShirt = 50.00;
        double jeansPrice = 80.00;
        double jacket = 100.00;
		
		 List<String> combinations = new ArrayList<>();
		 int maxTshirts = (int) (budget / tShirt);
	     int maxJeans = (int) (budget / jeansPrice);
	     int maxJackets = (int) (budget / jacket);
	     
	     for (int tshirts = 1; tshirts <= maxTshirts; tshirts++) {
	            for (int jeans = 1; jeans <= maxJeans; jeans++) {
	                for (int jackets = 1; jackets <= maxJackets; jackets++) {
	                    double totalCost = tshirts * tShirt + jeans * jeansPrice + jackets * jacket;

	                    // Check if the combination meets the condition
	                    if (totalCost <= budget - tShirt) {
	                        combinations.add(tshirts + " T-shirt(s), " + jeans + " Jeans, " + jackets + " Jacket(s)");
	                    }
	                }
	            }
	        }  
	     if (combinations.isEmpty()) {
	            System.out.println("No Combination Found.");
	        } else {
	            System.out.println("Combinations");
	            for (String combination : combinations) {
	                System.out.println(combination);
	            }
	        }
		
	}
	
	

}
