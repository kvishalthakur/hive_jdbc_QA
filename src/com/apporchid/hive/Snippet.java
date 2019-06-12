package com.apporchid.hive;

import java.util.Optional;

public class Snippet {
	 public static void main(String[] args) {
		 String[] words = new String[10]; 
		 words[5]="vial";
	        Optional<String> checkNull = Optional.ofNullable(words[5]); 
	        System.out.println(checkNull.get());
	        if (checkNull.isPresent()) {   
	            String word = words[5].toLowerCase();   
	            System.out.print(word);   
	        } else  
	            System.out.println("word is null");   
	}
}
