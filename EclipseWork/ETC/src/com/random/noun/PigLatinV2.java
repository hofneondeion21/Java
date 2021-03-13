package com.random.noun;

import java.util.Scanner;

public class PigLatinV2 {
	public static String convert(String word) {
		String initial = word.substring(0, 1);
		String newWord = " ";

		if (initial.equals("a") ||
				initial.equals("e") ||
				initial.equals("i") ||
				initial.equals("o") ||
				initial.equals("u")) {
			newWord = word + "w" + "ay";
		} else {
			newWord = word.substring(1) + initial + "ay";
		}
		return newWord;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a phrase/Sentence: ");					// Prompts User action
		String sentence = scan.nextLine();					// Example: The Quick Brown Fox
		String[] words = sentence.split(" ");				//  String array = { "The", "Quick", "Brown", "Fox"};
		System.out.println("The piglantin word is: ");
		for(int i = 0 ; i < words.length; i++) {			
			System.out.println(convert(words[i]));
		}
		scan.close();
	}
}
