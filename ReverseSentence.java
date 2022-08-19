package com.StringsAssignment;

//How to reverse the words in a sentence without changing the order of them (Leetcode easy problem)
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "Think Twice";
			
			String[] s1 = s.split(" ");
			
			int n  = s1.length;
			
			StringBuilder output =  new StringBuilder();
			
			for(int i = 0; i<n; i++) {
				output.append(reverse(s1[i]));
				if(i!=n-1) {
					output.append(" ");
				}
			}
			
			System.out.println(output.toString());
	}
	
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}

}
