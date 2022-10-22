public class Loops 
{

	   public static void main(String[] args) 
	        {
	        int n=46;
 
		for(int i=0; i<n; i++) 
		{
	        for(int j=0; j<n; j++)
                {
                if (i==0 && j<=(2+2)|| j==(2+2)/2 && i<=(n-1)/8|| i==(n-1)/8 && j<=(2+2)  ||                                                     //It is for I
                   (j==7 && i<=(n-1)/8 ) || j-i==7 && i<=(n-1)/8 || j==12 && i<=(n-1)/8 ||                                                      // It is for N
                   (i==0 && j>=14 && j<=18 || i==(n-1)/16 && j>=14 && j<=18 || i==(n-1)/8 && j>=14 && j<=18|| j==14 && i<=(n-1)/8 ) ||          // It is for E
                   (j==20 && i<(n-1)/8) ||i==(n-1)/8 && j>=21 && j<=23 || j==24 && i<(n-1)/8 ||                                                  //It is for U
                   (j==26 && i!=0 && i<=(n-1)/8) || i==0 && j>=27 && j<=29 || j==30 && i!=0 && i<=(n-1)/16 || i==(n-1)/16 && j>=27 && j<=28 ||  // It is for R
                   (j-i==25 && i>=(n-1)/16 && i<=(n-1)/8) || (i==0 && j>=33 && j<=35 || j==32 && i!=0  && i<(n-1)/8) ||                          //It is for O
                   ( i==(n-1)/8 && j>=33 && j<=35) || j==36 && i!=0  && i<(n-1)/8 || 
                   (j==38 && i<=(n-1)/8 || j-i==38 && i<6 || j==43 && i<=(n-1)/8) )                                                             // It is for N
                    
                     
                     
               
                {
                System.out.print("*");
                }
                else 
                System.out.print(" ");
            
	        }
                System.out.println();
	        }
                }
	        }