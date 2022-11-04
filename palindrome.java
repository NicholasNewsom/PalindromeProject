

import java.util.Stack;
import java.util.Arrays;

public class palindrome
{	
	public static boolean isPalindrome(String string)
	{
		Stack<Character> PaliStrings= new Stack();
		char StringArray[]	= string.toCharArray();
		boolean compChar = true;
		
		for(int i = 0; i < StringArray.length; i++)
		{
			PaliStrings.push(StringArray[i]);
		}
		
		for (int i = 0; i < StringArray.length; i++)
		{
			if (StringArray[i] != PaliStrings.pop())
				compChar = false;
		}
		
		return compChar;
	}
}
