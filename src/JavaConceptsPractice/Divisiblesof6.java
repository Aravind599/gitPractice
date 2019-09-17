package JavaConceptsPractice;

import java.util.Scanner;

public class Divisiblesof6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a input value >>");
		int k=sc.nextInt();
		//int i = 6;
		for(int j=1 ;j<=k;j++)
		{
			
			if(k%j==0)
			{
				System.out.println(j);
			}
				
			
		}

	}

}
