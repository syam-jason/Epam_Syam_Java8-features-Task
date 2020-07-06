package com.klu;

import java.util.*;


public class Average {

	public static void main(String[] args) {
		
		System.out.println("Enter no of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>(); 
		
		
		
		int i;
		int ele;
		for(i=0;i<n;i++)
		{
			System.out.println("enter "+i+ "the element");
			ele = sc.nextInt();
			list.add(ele);
		}
		
		//convert list of integer to stream
		
		OptionalDouble result = list.stream().mapToInt(x->x).average();
		System.out.println("Average of list of intergers are"+result);
		sc.close();
		
		
	}
}