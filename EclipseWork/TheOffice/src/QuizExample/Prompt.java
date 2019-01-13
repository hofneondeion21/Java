package QuizExample;


// Layout of the whole quiz.. this will include the Question and the Choices
// THis is the Singleton design
public class Prompt {
	
	
	
	private static Prompt p = null;
	private Question q;
	private static Prompt getInstance() {
		if (p == null) {
			p = new Prompt();
		} // endae IF
		return p;
	} // endae getInstance
	
	
	
	private void getQuestion() {
		q = new Question();
		
		
	}
	
	
	

}
