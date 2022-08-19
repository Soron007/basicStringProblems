package com.StringsAssignment;

// How to reverse a String

public class ReverseString {

	public static void main(String[] args) {
		String s  = "iNeuron";
		
		//We need to reverse the String s
		//Initialize another string as empty
		
		String result = "";
		for(int i = s.length()-1; i>=0; i--) {
			result += s.charAt(i);
		}
		
		
		System.out.println(result);

	}

}
