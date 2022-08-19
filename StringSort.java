package com.StringsAssignment;


//How to sort a string
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rock";
		s1 = s1.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char[] arr = s1.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		for(int i = 0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
	}

}
