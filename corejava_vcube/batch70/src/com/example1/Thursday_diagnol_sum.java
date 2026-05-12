package com.example1;

public class Thursday_diagnol_sum {
	public static void main(String args[])
	{
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int left_diagnol_sum = 0;
		int right_diagnol_sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					left_diagnol_sum = left_diagnol_sum + arr[i][j];
				}
			}
		}
		System.out.println(left_diagnol_sum);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length;j>=0;j--)
			{
				if(i+j==arr.length-1)
				{
					right_diagnol_sum +=arr[i][j];
					
				}
				
			}
		}
		
		System.out.println("right sum : "+ right_diagnol_sum);
		
		
		// this is converting row into a columns i.e converting 3 x 2 into a 2 x 3.
		 
		
	}

}
