package com.StringsAssignment;


//Print repeated characters in a string
public class CharacterRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "HHeelloo";
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			for(int j = i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					sb.append(s.charAt(i));
				}
			}
		}
		
		System.out.println(sb);

	}

}
