import java.util.Scanner;

public class Main {
	private static Scanner z = new Scanner(System.in);
	public static void main(String args[]) {
		
		System.out.println("WITHOUT SKIP!");
		withOutSkip();
		System.out.println("\n\nWITH SKIP!\n");
		withSkip();

		
		
	}
	
	
	
	public static void withOutSkip() {
		int a = z.nextInt();
		System.out.println(" Int: "+a);
//		z.skip(" \n");
		String b = z.nextLine();
		System.out.println(" String: "+b);
	}
	
	
	public static void withSkip() {
		int a = z.nextInt();
		System.out.println(" Int: "+a);
		z.skip("\n");
		String b = z.nextLine();
		System.out.println(" String: "+b);
	}
}
