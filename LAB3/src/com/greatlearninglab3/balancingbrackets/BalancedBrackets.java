package com.greatlearninglab3.balancingbrackets;



import java.util.*;

public class BalancedBrackets {
	static Scanner sc=new Scanner(System.in);
	
	 
	
	
	
	static boolean IsBalancedBrackets(String n) {
		
		Stack<Character> stack= new Stack<>(); 
		for(int i=0;i<n.length();i++) {
			char x=n.charAt(i);
			
			if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                System.out.println("the pushed brackets"+stack);
                
                }
			if(stack.isEmpty()) {
				return false;
				
			}
			char check;
			switch(x) {
			case ')':
				check=stack.pop();
				if (check=='['|| check=='{') {
					
					return false;
				}
				break;
				

			case ']':
				check=stack.pop();
				if (check=='('||check=='{') {
					return false;
					
				}
				break;
				
			case '}':
				check=stack.pop();
				if (check=='('||check=='[') {
					return false;
				}
					
					break;
				}
		}
		return (stack.isEmpty());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the String : ");
		String a=sc.next();
		
		if (IsBalancedBrackets(a)){
			System.out.println(" the entered string has balanced brackets");
			
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
			
		
		
		
		
	}

}
