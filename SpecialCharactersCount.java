package com.StringsAssignment;


//How to count special characters in a string
public class SpecialCharactersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abraham@!#800 ,./?";
		
		s = s.toLowerCase();
		
		int count= 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)>=32 && s.charAt(i)<=64) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
