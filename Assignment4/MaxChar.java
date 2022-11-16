//WAP to find the maximum occurring character in a String.


import java.util.*;
public class MaxChar {
	
	static char getMaxOccurringChar(String str)
	{
		int count[] = new int[256];//ASCI No. is 256

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; 
		char result = ' '; 

		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	public static void main(String[] args)
	{
                             Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Max occurring character is "
						+ getMaxOccurringChar(str));
	}
}
