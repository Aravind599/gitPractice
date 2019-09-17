package JavaConceptsPractice;

public class Is7Primenumber {

	public static void main(String[] args) {
		
		int i=7;
		int count=0;
		for(int j=2;j<i/2;j++)
		{
			
			if(i%j==0)
			{
				count++;
				break;
				
			}
			
		}
		if(count==0)
		{
			System.out.println("7 is a prime number");
		}
          // american guy 4th push
	}

}
