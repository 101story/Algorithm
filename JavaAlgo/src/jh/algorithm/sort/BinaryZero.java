package jh.algorithm.sort;

import java.util.Arrays;

public class BinaryZero {

	public static void main(String[] args) {
	        String str1 = Integer.toBinaryString(328);
	        String[] words = str1.split("1");
	        System.out.println(str1);
	        int longLen = 0;
	        /*for(String a : words){
	            System.out.println(a);
	            if(a.length() > longLen){
	                   longLen = a.length();
	            }
	        }*/
	        int b = str1.length()-1;
	        if(str1.charAt(b)=='0'){
		        if(words.length!=0) {
			         int last = words.length-1;
			         words[last] = "";
		        }
	        }

	        // List<String> names = Arrays.asList(words); 
	        // longLen = names.stream().max(Comparator.comparingInt(String::length));
	        Arrays.sort(words);    
	         for(String a : words){
	            System.out.println(a);
	         }
	        if(words.length!=0) {
		         int last = words.length-1;
		         longLen=words[last].length();
	        }
	        System.out.println(longLen);
	        
	}

}
