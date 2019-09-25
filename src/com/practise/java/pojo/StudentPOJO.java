package com.practise.java.pojo;

public class StudentPOJO {

	public String studentNumber;
	public String studentName;
	public int age;
	public int[] marks = new int[6];

	int highestmarks;
    int lowestMarks;
	// highest marks
	public int highestMarks(int[] array) {
		

		this.highestmarks = array[0];
		for (int i = 0; i < this.marks.length; i++) {
			
			if (this.highestmarks > this.marks[i]) {
				continue;
			} else {
				this.highestmarks = this.marks[i];
			}

		}
		return this.highestmarks;
	}

	
	
	public int lowestMarks() {
		this.marks[0] = 78;
		this.marks[1] = 35;
		this.marks[2] = 45;
		this.marks[3] = 95;
		this.marks[4] = 55;
		this.marks[5] = 49;
		
		this.lowestMarks = this.marks[0];
		
       for (int i = 0; i < this.marks.length; i++) {
			
			if (this.lowestMarks < this.marks[i]) {
				continue;
			} else {
				this.lowestMarks = this.marks[i];
			}

		}
		return this.lowestMarks;
	}



	public int averageMarks() {
		int total=0;
		this.marks[0] = 78;
		this.marks[1] = 35;
		this.marks[2] = 45;
		this.marks[3] = 95;
		this.marks[4] = 55;
		this.marks[5] = 49;
		 for (int i = 0; i < this.marks.length; i++) {
			 
			 total=total+this.marks[i];
		 }
		 return total/6;
	}



	public void passorFail() {
		
		this.marks[0] = 78;
		this.marks[1] = 35;
		this.marks[2] = 45;
		this.marks[3] = 95;
		this.marks[4] = 55;
		this.marks[5] = 49;
		int count = 0;
		for (int i = 0; i < this.marks.length; i++) {
			if(this.marks[i]>=35)
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.println("student got failed ");
		}
		else
		{
			System.out.println("student got passed");
		}
	}



	
	

}
