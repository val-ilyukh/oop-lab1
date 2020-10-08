package helloWorld;
import java.util.Scanner;


public class Palindrome {
	public static void main(String args[]) {
		String s = new String();
		Scanner in = new Scanner(System.in);
		System.out.println(reverseString("Hello"));
		s = in.nextLine();
		if (isPalindrome(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		in.close();
	}
	public static String reverseString(String s) {
		String output = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			output += s.charAt(i);
		}
		return output;
	}
	public static boolean isPalindrome (String s) {
		if (s.equals(reverseString(s))) return true;
		else return false;	
	}
}
