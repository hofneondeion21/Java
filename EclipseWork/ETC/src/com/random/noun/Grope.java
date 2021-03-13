package com.random.noun;

import java.util.Random;

public class Grope {
	private static Random r = new Random();
	private static String articles[] = { " the ", " a ", "one ", "some ", "any " };
	private static String nouns[] = { " boy ", " girl ", " dog ", " town ", " car " };
	private static String verbs[] = { " drive ", " jump ", " run ", " walk ", " skip ", " cut ", " code " };
	private static String prepositions[] = { " to", " from", " over", " under", " on", " behind " };
	private static String rhyme[] = { "race", "place", "face", "lace", "mace", "pace" };
	private static String rhyme2[] = { "rock", "hawk", "chalk", "lock", "block", "stock", "tock" };

	public static void main(String[] args) {
		for (int n = 0; n < 5; n++) {
			System.out.println(generateLimerickPoem());
		}
	}
	
	private static String generateLimerickPoem() {
		String line1 = generatePatternA();
		String line2 = generatePatternA();
		String line3 = generatePatternB();
		String line4 = generatePatternB();
		String line5 = generatePatternA();
		return String.format("%s%n%s%n%s%n%s%n%s%n", 
				line1, line2, line3, line4, line5);
	}
	
	private static String getRandomWordInPatternA() {
		return rhyme[r.nextInt(rhyme.length)];
	}
	
	private static String getRandomWordInPatternB() {
		return rhyme2[r.nextInt(rhyme2.length)];
	}

	private static String randomArticle() {
		return articles[r.nextInt(articles.length)];
	}

	private static String randomNoun() {
		return nouns[r.nextInt(nouns.length)];
	}

	private static String randomPreposition() {
		return prepositions[r.nextInt(prepositions.length)];
	}

	private static String randomVerb() {
		int rand = r.nextInt(verbs.length);
		return (rand >= 3) ? verbs[rand].trim()+"s" : verbs[rand];
		
	}
	
	private static String capitalized(String str) {
		return (str.isEmpty() || str == null) ? "" : str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	private static String generatePatternA() {
		return String.format(capitalized(randomArticle().trim()) + randomNoun()
						+ randomVerb() + randomPreposition() + " " + randomArticle() + getRandomWordInPatternA() + ".");
	}
	
	private static String generatePatternB() {
		return String.format(capitalized(randomArticle().trim()) + randomNoun()
						+ randomVerb() + randomPreposition() + " " + randomArticle() + getRandomWordInPatternB() + ".");
	}
}
