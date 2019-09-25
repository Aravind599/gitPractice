package JavaConceptsPractice;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		
		
		//meterno 
		//no of units
		//charge per unit 
		//total charge 
		//category 
		
		String meterno ;
		int noOfUnits;
		int chargePerUnit=0;
		int totalCharge;
		String Category;
		
		Scanner sc = new Scanner(System.in);
		//no changes made
		//no changes made

		System.out.println("Enter meter no ");
		
		meterno = sc.next();
		
		System.out.println("Enter no of units");
		
		noOfUnits = sc.nextInt();
		
		//System.out.println("Charge per unit ");
		
		//chargePerUnit=sc.nextInt();
		
	//	System.out.println("enter total charge ");
		
	//	totalCharge = sc.nextInt();
		
		System.out.println("enter category");
		
		Category = sc.next();
		
		switch(Category)
		{
			
			case "house" : 
				        chargePerUnit = 10;
				        break ;
			case "theater" :
				        chargePerUnit = 20 ;
				        break ;
				        
			case "Industry" :
				
				         chargePerUnit = 30 ;
				         break ;
				         
		  	
			
		}
		
		    totalCharge = noOfUnits * chargePerUnit ;
		    
		    
		    System.out.println("total charge >>>"+totalCharge);
		    
		}

	
		
		
		
		
		
		
	}


