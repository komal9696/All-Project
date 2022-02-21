package com.vote;


public class ifloop
{
	
		public static int Eligible1(int voter)
		{
		
		if(voter>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println(" not eligible for voting");
		}
		return voter;
	}
		public static int findMax(int arr[]){  
	        int max=0;  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;
	}
		
		public static int withdraw(int amount)
		{
		int minbal=10000;
		if(amount>minbal)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			System.out.println("Sufficient Balance");
		}
		return amount;
	}
}

