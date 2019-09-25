package com.practise.java;

import com.practise.java.pojo.MatchCaliculas;

public class MathApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MatchCaliculas mat = new MatchCaliculas();
		
		int sum = mat.add();
		
		System.out.println("sum is >>>>"+sum);

		int difference = mat.difference();
		
		System.out.println("difference is >>>>"+difference);
		
		int multiplication = mat.multiplication();
		
		System.out.println("multiplication is >>>>"+multiplication);
		
		float division =mat.division();
		
		System.out.println("division is >>>>"+division);
	}

}
