package part1_initialiazation_of_mathod;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=100;i++)
		{
			checkPrime(i);	
		}
	}
	public static void checkPrime(int n)
	{
			
			int count=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(n+"   ");
			}

	}

}
