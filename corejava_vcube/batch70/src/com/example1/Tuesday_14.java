package com.example1;

import java.util.HashMap;

public class Tuesday_14 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hp = new HashMap<>();
		int arr[] = {1,2,2,3,4,1,5,2,2,2,2,2,2,2,2,2};
		for(int i=0;i<7;i++)
		{
			int j = arr[i];
			if(!hp.containsKey(j))
			{
				hp.put(j,hp.getOrDefault(j,0)+1);
			}
		}
		for(int i : hp.keySet())
		{
			System.out.println(i);
			
		}
		
		
		

	}

}
