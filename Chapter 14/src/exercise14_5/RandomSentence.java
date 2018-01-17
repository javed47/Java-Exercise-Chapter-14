package exercise14_5;

import java.security.SecureRandom;

public class RandomSentence {
	public static void main(String[] args) {
		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };

		creatingSentence(article, noun, verb, preposition);
	}

	public static void creatingSentence(String[] article, String[] noun, String[] verb, String[] preposition) {
		SecureRandom randomNumber = new SecureRandom();

		for (int count = 0; count < 20; count++) {

			String s = " ";

			// Creating 4 random number
			int randomValue0 = randomNumber.nextInt(4);
			int randomValue1 = randomNumber.nextInt(4);
			int randomValue2 = randomNumber.nextInt(4);
			int randomValue3 = randomNumber.nextInt(4);

			// Creating char array of the first article
			char[] charArray = article[randomValue0].toCharArray();
			// Making the first character capital
			charArray[0] = Character.toUpperCase(charArray[0]);
			// Reconstructing the article with first capital letter
			String s3 = new String(charArray);

			System.out.printf("%s.%n", s3 + s + noun[randomValue1] + s + verb[randomValue2] + s
					+ preposition[randomValue3] + s + article[randomValue2] + s + noun[randomValue0]);

		}
	}
}
