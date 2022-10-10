package CS;

import java.util.Scanner;

public class aplicationPali {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.nextLine();
		
		System.out.println("whether or not the word is a palindrome: "+ palindrome.isPalindrome(word) );
	}

}
