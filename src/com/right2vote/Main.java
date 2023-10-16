package com.right2vote;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
		
	double budget = 600.00;
        double priceOfTShirt = 50.00;
        double priceOfJeans = 80.00;
        double priceOfJacket = 100.00;
        

        combinations(budget, priceOfTShirt, priceOfJeans, priceOfJacket);
	}

	public static void combinations(double budget, double priceOfTShirt, double priceOfJeans, double priceOfJacket) {
        int items=0; 
		
		for (int tShirts=1; tShirts*priceOfTShirt<=budget; ++tShirts) {
	        double remainingAmount=budget-(tShirts*priceOfTShirt);
            for (int jeans=1; jeans*priceOfJeans<=remainingAmount; ++jeans) {
                int jackets=(int) ((budget-(tShirts*priceOfTShirt)-(jeans*priceOfJeans))/priceOfJacket);
                double totalCost=(tShirts*priceOfTShirt)+(jeans*priceOfJeans)+(jackets*priceOfJacket);
                if (totalCost<=budget  && jackets>=1 && jeans>=1 && tShirts>=1) {
                	++items;
                	System.out.println(items+" --  "+tShirts+" T Shirts, "+jeans+" Jeans, "+jackets+" Jackets");
                }
            }
        }
        if(items==0){
            System.out.println("Unable to find combination");
        }
    }
	
	}


