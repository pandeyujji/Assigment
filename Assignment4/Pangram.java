//WAP to implement Pangram Checking with least inbuilt methods being used.

import java.io.*;

class Pangram 

{

	public static boolean checkPangram(String str)
	{
		boolean[] mark = new boolean[26];

		int index = 0;

		for (int i = 0; i < str.length(); i++) 
                             {

                                         if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                                   
                                                        index = str.charAt(i) - 'A';

		             else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';

			else
				continue;
			mark[index] = true;
		}

		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);
		                              return (true);
	}

	public static void main(String[] args)
	{
		String str= "Pack my box with five dozen liquor jugs";

		if (checkPangram(str) == true)
			System.out.print(str + " \nis a pangram.");
		else
			System.out.print(str + " \nis not a pangram.");
	}
}