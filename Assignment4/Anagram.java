// WAP to implement Anagram Checking least inbuilt methods being used.


import java.util.*;

public class Anagram{

static int NO_OF_CHARS = 256;

static boolean areAnagram(char[] str1, char[] str2)
{
	
	int[] count = new int[NO_OF_CHARS];
	int i;

	if (str1.length != str2.length)
		return false;

	for(i = 0; i < str1.length; i++)
	{
		count[str1[i]]++;
		count[str2[i]]--;
	}
	for(i = 0; i < NO_OF_CHARS; i++)
		if (count[i] != 0)
		{
			return false;
		}
	return true;
}

public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	char str1[] = s1.toCharArray();
	char str2[] = s2.toCharArray();

	if (areAnagram(str1, str2))
		System.out.print("The two strings are " +
						"anagram of each other");
	else
		System.out.print("The two strings are " +
						"not anagram of each other");
}
}


