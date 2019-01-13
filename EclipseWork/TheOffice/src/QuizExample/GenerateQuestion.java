package QuizExample;

import java.util.Random;

// will generate a random Question when user types in NEXT
public abstract class GenerateQuestion implements GenerateQuestionLayout {
	private CreatingQuestions cq = new CreatingQuestions();
	private Random r = new Random();
	
	private int rand = r.nextInt(cq.getQ().length);
	
	
//	private String[] ques = new String[10];
	
	public String question() {
		String question = null;
		for (int i = 0; i < cq.getQ().length; i++) {
			question = cq.getQ()[rand];
		} // endae FOR
		return question;
	}
	
	public void addToQues() {
//		for (int i = 0; i< cq.getQ().length; i++) {
//			System.out.println(cq.getQ()[i]);
//			if (input =)
//		} // endae FOR
	}
	 
}
