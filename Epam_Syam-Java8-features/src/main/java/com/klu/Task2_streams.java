package com.klu;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Task2_streams {
	
	public static List<String> test(List<String> list)
	{
		 Predicate<String> startwitha  = (Value)->Value.startsWith("a"); //predicate1 for checking the string start with 'a'
	        
	        Predicate<String> length3 = (Value)->Value.length()==3;
	        
	        List<String> result = list.stream().filter(startwitha.and(length3)).collect(Collectors.toList());
	        //Predicate.and() is used in filter for checking the conditions for more than one condition
	        
	        return result;
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n=sc.nextInt();
		
		int i;
		List<String> list = new ArrayList<String>();
		
		//Predicate conditions are starts with "a" and having length >3
		
		String ele;
        for(i=0;i<n;i++)
        {
        	ele = sc.next();
        	
        	list.add(ele);
        }
        
       List<String> output = test(list);
        if(output.size()>1)
        {
        System.out.println("Strings are"+output);
        }
        
        else {
        	System.out.println("No element Found");
        }
     
        sc.close();
		
	}

}