package com.StringsAssignment;

//How to count vowels and consonents in a string

public class CountVowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vCount = 0, cCount = 0;  
        
       
        String str = "My name is Abraham Lincoln";  
          
        
        str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {  
            
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
               
                vCount++;  
            }  
            
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
               
                cCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);  

	}

}
