package com.practise.java;

import java.util.Scanner;

import com.practise.java.pojo.StudentPOJO;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentPOJO[] stud = new StudentPOJO[2];
		
	
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("enter student age");
			stud[i].age=sc.nextInt();
			System.out.println("enter student name");
			stud[i].studentName=sc.next();
			System.out.println("enter student number");
			stud[i].studentNumber=sc.next();
		}
		//hnelfelaf
		//hvsiefhs;d
		
		/*
		 * for(int i=0;i<stud.;i++) { System.out.println("enter marks");
		 * stud.marks[i]=sc.nextInt(); }
		 */
		
		
		//int result = stud.highestMarks(stud.marks);
		//System.out.println("highest marks >>>"+result);
		
		/*
		 * result = stud.lowestMarks(); System.out.println("lowest marks >>>"+result);
		 * 
		 * result = stud.averageMarks(); System.out.println("average marks >>>"+result);
		 * 
		 * stud.passorFail();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
