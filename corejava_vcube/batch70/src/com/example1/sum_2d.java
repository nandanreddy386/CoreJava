package com.example1;

public class sum_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<arr.length;i++)
		{
			int sum = 0;
			
			for(int j=0;j<arr[i].length;j++)
			{
				sum = sum + arr[j][i];
				
				
			}
			System.out.println(sum);
			
		}
		
		
		
		

	}

}
