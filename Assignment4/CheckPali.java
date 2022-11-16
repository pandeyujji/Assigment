// WAP to check if “2552” is palindrome or not.

import java.io.*;
import java.util.*;

public class CheckPali
{

static boolean checkPalindrome(String str)
{
	
	int len = str.length();

	for(int i = 0; i < len / 2; i++)
	{
		if (str.charAt(i) !=str.charAt(len - i - 1))
			return false;
	}

	return true;
}

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String st = sc.nextLine();	
	if (checkPalindrome(st) == true)
	
		System.out.print("Yes");
		
	else
		System.out.print("No");
}
}


