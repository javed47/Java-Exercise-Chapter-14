package exercise14_7;

public class PigLatin {

	//Instance variables
	private String sentence;
	private StringBuilder pigLatinSentence = new StringBuilder();
	
	public PigLatin(String sentence)
	{
		this.sentence = sentence;
	}

	public void makingPigLatin(){
		
		String[] tokens = sentence.split(" ");	
		 for (String word : tokens){
			 StringBuilder token = new  StringBuilder(word);
			 char buffer = token.charAt(0);
			 token.append(buffer);
			 token.deleteCharAt(0);
			 token.append("ay");
			 pigLatinSentence.append(token).append(" ");
		 }
	}
	
	public String toString()
	{
		return String.format("%s%n", pigLatinSentence);
	}

}
