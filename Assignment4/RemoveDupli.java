//WAP to remove Duplicates from a String.(Take any String ex with duplicates
character)


import java.util.*;   
  
public class RemoveDupli   
{  

    static void removeDuplicate(char str[], int length)   
    {   
         
        int at = 0;   
    
       
        for (int i = 0; i < length; i++)   
        {   
               
            int j;
   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
      
            if (j == i)    
            {   
                str[at++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, at)));   
    }   
     
    public static void main(String[] args)   
    {   
        String line = "Ujjwal is learning java very quickly";   
        char str[] = line.toCharArray();    
        int length= str.length;   
        removeDuplicate(str, length);   
    }   
}  