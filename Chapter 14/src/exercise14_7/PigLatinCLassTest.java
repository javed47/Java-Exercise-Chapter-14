package exercise14_7;

import java.util.Scanner;

public class PigLatinCLassTest {
	public static void main(String[] args) {

		// Instantiate a scanner object and ask user to give the sentence input
		Scanner input = new Scanner(System.in);
		System.out.println("Give the sentence which needs to be in Pig Latin format: ");
		String sentence = input.nextLine();
		System.out.printf("%s%n%s", "The real sentence is: ", sentence);

		// Instantiate the PigLatin class
		PigLatin pigLatin = new PigLatin(sentence);
		pigLatin.makingPigLatin();

		// Printout the pig latin sentence
		System.out.printf("%s%n%s%n", "The Pig Latin sentence is: ", pigLatin.toString());

	}
}
