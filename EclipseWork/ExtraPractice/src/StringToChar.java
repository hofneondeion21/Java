import java.util.Scanner;

public class StringToChar {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in); // using the scanner class for user input
		String s = input.nextLine(); // stores user input into the String variable s
		char arr[] = new char[s.length()]; // creates an array called
		arr = s.toCharArray(); // using the toCharArray method and storing it into the Char arr array
		// for loop to iterate throught he char arr
		for (int i = 0; i < arr.length; i++) {
			// will print separators
			if (i >0) {
				System.out.print(" . "); // print period to separate each letter
			} // endae IF
			System.out.print(arr[i]); // will print each character that the user
		} // endae FOR
		input.close(); // closes the scanner
	} // endae MAIN
} // endae StringToChar class
