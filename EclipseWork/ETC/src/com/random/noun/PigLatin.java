package com.random.noun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PigLatin {

	private static final String PIG_LATIN_ENDING = "ay";
	private static List<String> storedSentences = new ArrayList<>();

	public static void main(String... args) {
		promptUserForSentence();
	}

	private static void promptUserForSentence() {
		try (Scanner z = new Scanner(System.in)) {
			System.out.println("Enter a phrase or sentence (or type 'exit' to end program) : ");
			String userSentence = z.nextLine();
			while (!userSentence.equalsIgnoreCase("exit")) {
				tokenizeSentence(userSentence);
				printPigLatinHistory();
				System.out.println("Enter another phrase or sentence \nOr type 'exit' to end program : ");
				userSentence = z.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void tokenizeSentence(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder str = new StringBuilder("");
		String latinWord = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 2) {
				latinWord = convertToPigLatin(words[i]);
				printLatinWord(latinWord);
				str = str.append(latinWord);
			}
		}
		storePigLatinSentence(str.toString());
	}

	public static void printLatinWord(String str) {
		System.out.println(str);
	}

	private static String convertToPigLatin(String str) {
		String trimmedStr = str.trim();
		String firstLetter = trimmedStr.substring(0, 1);
		String tempWord = trimmedStr.substring(1);
		return tempWord.substring(0, 1).toUpperCase() + tempWord.substring(1) + firstLetter.toLowerCase()
				+ PIG_LATIN_ENDING + " ";
	}

	private static void storePigLatinSentence(String pigLatinStr) {
		storedSentences.add(pigLatinStr);
	}

	private static void printPigLatinHistory() {
		System.out.println("----------RUNNING HISTORY---------");
		for (String s : storedSentences) {
			System.out.printf("%s\n", s);
		}
		System.out.println("\n-----------------------------------");
	}

}
