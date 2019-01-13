package QuizExample;

public class Choices extends Options{
	
	private String a, b, c, d;
	
	private static Choices cc = null;
	public static Choices getInstance() {
		if (cc == null) {
			cc = new Choices();
		} // endae IF
		return cc;
	}
	
	public void setChoiceA(String a)  {
		this.a = a;
	} // enae setChoicesA
	
	public void setChoiceB(String b)  {
		this.b = b;
	} // enae setChoicesB
	
	public void setChoiceC(String c) {
		this.c = c;
	} // endae setChoiceC
	
	public void setChoiceD(String d) {
		this.d = d;
	} // endae setChoiceD
	
	
	
	
	
	
	
	

}
