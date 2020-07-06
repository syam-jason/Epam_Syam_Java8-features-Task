package com.klu;
import java.util.*;

import java.util.stream.IntStream;
public class Task3_Palindromes {
	
	static void checkPalindrome(String text) {
		String temp  = text.replaceAll("\\s+", "").toLowerCase();
	    boolean result =  IntStream.range(0, temp.length() / 2)
	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	    
	    
	    	 if(result)
	    	  {
	    		  System.out.println(text);
	    	  }
	    
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		
		
		int n;
		
		n = sc.nextInt();
		System.out.println("Enter a array of strings");
		String s;
		for(int i = 0; i<n; i++)
		{
			s=sc.next();
			
			list.add(s);
		}
		Iterator<String> iterator = list.iterator();
	      while(iterator.hasNext()) {
	    	  checkPalindrome(iterator.next());
	    	 
	        
	      }
	      sc.close();
		
		
		
	}

}