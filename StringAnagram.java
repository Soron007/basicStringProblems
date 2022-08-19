package com.StringsAssignment;

//To check if two strings are anagram or not
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter the first String: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the second String: ");
		String s2 = sc.nextLine();
		
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(isAnagram(s1,s2)) {
			System.out.println("The Strings are Anagrams");
		}else {
			System.out.println("The Strings are not Anagrams");
		}
		
		
		

	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
		char[] string1 = s1.toCharArray();
		char[] string2 = s2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		return Arrays.equals(string1, string2);
		}
	}

}
