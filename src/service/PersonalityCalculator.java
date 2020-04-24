package service;

public class PersonalityCalculator{
		public int[] findAnswers(String options) {
		String[] answersInQuotes = options.split(",");
		int[] answersForBrainTest = new int[answersInQuotes.length];
		for(int i=0; i < answersInQuotes.length; i++) {
			answersForBrainTest[i] = Integer.parseInt(answersInQuotes[i]); 
		}
		return answersForBrainTest;
	}
	
	
	public String findYourBrainType(String options) {
		int[] responses = findAnswers(options);
		int A = responses[0]+ responses[1] + responses[2] + responses[4] + responses[7] + responses[9] + responses[10] + responses[11] + responses[13] + responses[17] + responses[19];
		int B = responses[3] + responses[5] + responses[6] + responses[8] + responses[12] + responses[14] + responses[15] + responses[16] + responses[18];
		int finalScore = 66 - A + B;
		for(int i = 0; i < responses.length; i++) {
			System.out.println("The answer for question - " + (i + 1) + " is " + responses[i]);
		}
		System.out.println("Your total score is " + finalScore + ".");
		
		if(finalScore >= 20 && finalScore <= 55) {
			System.out.println("You are \"left brained\"");
			return "leftbrained";
		}
		else if (finalScore >= 56 && finalScore <= 64) {
			System.out.println("You have \"no clear preference\"");
			return "noclearpreference";
		}
		else {
			System.out.println("You are \"right brained\"");
			return "rightbrained";
		}
	}
	
}
