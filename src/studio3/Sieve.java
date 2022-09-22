package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n: ");
		int n = in.nextInt();
		int[] sieve = new int [n-2];
		boolean[] prime = new boolean [n-2];
		
		for (int i = 2; i < n; i++)
		{
			sieve[i-2] = i;
			
			for (int count = 2; count < n; count++)
			{
				if (i != count)
				{
					if (i % count == 0)
					{
					prime[i-2] = true;
					
					}
				}
			}
			
		}

		for (int p = 2; p < n; p++)
		{
			if (prime[p-2] == false)
			{
			
			System.out.println(sieve[p-2]);
			}
		}
		
			
		
	}

}
