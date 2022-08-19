package com.StringsAssignment;

//To check if a string is Panagram or not
public class StringPanagram {

	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "The Big Boy";
		System.out.println(isPanagram(s1.toLowerCase()));
		System.out.println(isPanagram(s2.toLowerCase()));

	}
	
	public static boolean isPanagram(String s) {
		if(s.length()<26) {
			return false;
		}
		
		for(char ch = 'a'; ch<='z'; ch++) {
			if(s.indexOf(ch)<0) {
				return false;
			}
		}
		
		return true;
	}

}
