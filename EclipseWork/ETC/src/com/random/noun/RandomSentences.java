package com.random.noun;

import java.util.Random;

public class RandomSentences {
	private static Random r = new Random();
	private static String articles[] = { "the", "a ", "one ", "some ", "any " };
	private static String nouns[] = { " boy ", " girl ", " dog ", " town ", " car " };
	private static String verbs[] = { "drove", " jumped", " ran", "walked", "skipped" };
	private static String prepositions[] = { " to", " from", " over", " under", " on" };
	private static String rhyme[] = { "race", "place", "face" };
	private static String rhyme2[] = { "rock", "hawk", "chalk" };

	public static void main(String[] args) {
		for (int n = 0; n < 2; n++) {
			int n1 = r.nextInt(articles.length);
			int n2 = r.nextInt(nouns.length);
			int n3 = r.nextInt(verbs.length);
			int n4 = r.nextInt(prepositions.length);
			int n5 = r.nextInt(rhyme.length);
			int n6 = r.nextInt(rhyme2.length);

			System.out.println(articles[n1].substring(0, 1).toUpperCase() + articles[n1].substring(1) + nouns[n2]
					+ verbs[n3] + prepositions[n4] + " " + randomArticle() + randomNoun() + rhyme2[n6]);
			System.out.println(articles[n1].substring(0, 1).toUpperCase() + articles[n1].substring(1) + nouns[n2]
					+ verbs[n3] + prepositions[n4] + " " + randomArticle() + randomNoun() + rhyme[n5]);
		}
	}

	private static String randomArticle() {
		return articles[r.nextInt(articles.length)];
	}

	private static String randomNoun() {
		return nouns[r.nextInt(nouns.length)];
	}
}
