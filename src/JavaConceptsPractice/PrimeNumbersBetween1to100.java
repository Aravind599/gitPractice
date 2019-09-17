package JavaConceptsPractice;

public class PrimeNumbersBetween1to100 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++)
		{
			
			
			
			if(i%i==0 )
			{
				int count = 0;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						//System.out.println("this is not a prime number >>>"+i);
						count++;
						break;
					}
					
				}
				if(count==0)
				{
					System.out.println("this is a prime number >>>"+i);
				}
			}
		}

	}

}
