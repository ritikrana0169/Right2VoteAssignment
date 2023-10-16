package com.right2vote;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
		
		double amount = 600.00;
        double priceOfTShirt = 50.00;
        double priceOfJeans = 80.00;
        double priceOfJacket = 100.00;
        

        combinations(amount, priceOfTShirt, priceOfJeans, priceOfJacket);
	}

	public static void combinations(double amount, double priceOfTShirt, double priceOfJeans, double priceOfJacket) {
        int items=0; //TAKING THE COUNT VARIABLE FOR JUST COUNTING COMBINATIONS IN PRINT STATEMENT
		for (int tShirts=1; tShirts*priceOfTShirt<=amount; ++tShirts) {
			double remainingAmountAfterTShirt=amount-(tShirts*priceOfTShirt);
            for (int jeans=1; jeans*priceOfJeans<=remainingAmountAfterTShirt; ++jeans) {
                int jackets=(int) ((amount-(tShirts*priceOfTShirt)-(jeans*priceOfJeans))/priceOfJacket);
                double totalCost=(tShirts*priceOfTShirt)+(jeans*priceOfJeans)+(jackets*priceOfJacket);
                if (totalCost<=amount  && jackets>=1 && jeans>=1 && tShirts>=1) {
                	++items;
                	System.out.println(items+" ->  "+tShirts+" T-shirts, "+jeans+" Jeans, "+jackets+" Jackets");
                }
            }
        }
        if(items==0){
            System.out.println("Unable to find combination");
        }
    }
	
	}


