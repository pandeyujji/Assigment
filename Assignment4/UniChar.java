//WAP to find if String contains all unique characters.

import java.util.*;

class UniChar {
	boolean uniqueCharacters(String str)
	{
		for (int i = 0; i < str.length(); i++)
		       for (int j = i + 1; j < str.length(); j++)
			if (str.charAt(i) == str.charAt(j))
				return false;

		                              return true;
	}

	public static void main(String args[])
	{
		UniChar obj = new UniChar();
                             Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
