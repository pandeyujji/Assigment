

public class Quesone {

	public static void main(String[] args) {
		         {

	         int n=21;
		
	        for(int i=0; i<n; i++) 
		         {
	    	         {
                for(int j=0; j<n; j++) {
                if(i==0 && j>n/4 && j<(3*n)/4 || i==n-1 && j>n/4 && j<(3*n)/4 || j==(n-1)/2)    //It is for I
                         {
                  System.out.print("*");
        	          }
        	  else {
        	 System.out.print(" ");
                          }
                          }
                  
	          for(int j=0; j<n; j++) {
	          if(j==0 || j==n-1  || i==j && i<=n-1)                                         //It is for N
	                  {
	        		 
	          System.out.print("*");
	        	   }
	           else {
	           System.out.print(" ");
	                   }
	        	   }
                  	 
	           for(int j=0; j<n; j++) {
	           if(i==0 && j<=n-1 && j>0|| j==0 && i>0 && i<n-1 || i==n-1 && j<=n-1 && j>0 || i==(n-1)/2 && j<n-1 ) //It is for E
	        	  {
	        	    	        		 
	            System.out.print("*");
	        	  }
	             else {
	             System.out.print(" ");
	        	   }
	        	   }
	        	   	
	        	   {	
	             for(int j=0; j<n; j++) {
	             if(j==0 &&i<n-1 || j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1)           //It is for U
	        	   {
	        	    	        	    	        		 
	              System.out.print("*");
	        	   }
	              else {
	              System.out.print(" ");
	        	   }
	        	   }
	        	     
	        	   {	 
	              for(int j=0; j<n; j++) {
	              if(i==0 && j>0 && j<(n-1) || j==n-1 && i>0 && i<(n-1)/2 || j==0 && i>0 || j==0 && i>0 && i<(n-1)/2  ||
	              i==(n-1)/2 && j>0 && j<n-1 || i==j && i<=n-1 && i>(n-1)/2)                  //It is for R
	        	   {
	        	    	        	    	        	    	        		 
	              System.out.print("*");
	        	   }
	              else {
	              System.out.print(" ");
	                    }
	        	    }
	        	     
	        	    {	 
	              for(int j=0; j<n; j++) {
	              if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1|| j==n-1 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1)  //It is for O
	        	    {
	        	    	        	    	        	    	        	    	        		 
	              System.out.print("*");
	        	      }
	              else {
	              System.out.print(" ");
	        	     }
	        	     }
	        	     
	        	     {
	        	    	  
	        	     {
	               for(int j=0; j<n; j++) {
	      	       if(j==0 || j==n-1  || i==j && i<=n-1) //It is for N
	      	    	{
	      	        	    	        	    	        	    	        	    	        		 
	      	        System.out.print("*");
	      	        }
	      	        else {
	      	        System.out.print(" ");
	      	        }
	      	        }
	                }
	      	        System.out.println(); 
	      	     }
	            }
	           }
	          }
                 }
                }
               }
	      }
	     }
	
	

