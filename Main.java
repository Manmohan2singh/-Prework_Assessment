import java.util.Scanner;

 

public class Main {

 

	Scanner sc = new Scanner(System.in);

 

       //function to checkPalindrome

       public void checkPalindrome()  {
    	   
    	   String original, reverse = ""; // Objects of String class  
    	      Scanner in = new Scanner(System.in);   
    	      System.out.println("Enter a number to check if it is a palindrome");  
    	      original = in.nextLine();   
    	      int length = original.length();   
    	      for ( int i = length - 1; i >= 0; i-- )  
    	         reverse = reverse + original.charAt(i);  
    	      if (original.equals(reverse))  
    	         System.out.println("Entered number is a palindrome.");  
    	      else  
    	         System.out.println("Entered number isn't a palindrome.");   
    	      System.out.println();

      }

 

       //function to printPattern

       public void printPattern() {
    	   
    	   Scanner in = new Scanner(System.in);   
 	      System.out.println("Enter a number to printPattern");  
 	      String original = in.nextLine(); 
 	      int row=Integer.parseInt(original);  
    	 //i for rows and j for columns      
    	 //row denotes the number of rows you want to print  
 	      int i, j;   
    	 //outer loop for rows  
    	 for(i=0; i<row; i++)   
    	 {   
    		 //inner loop for columns  
    	 for(j=(row-1); j>=i; j--)   
    	 {   
    		 //prints stars   
    	 System.out.print("*");   
    	 }   
    	 //throws the cursor in a new line after printing each line  
    	 System.out.println();   
    	 }   
    	 }   
    	 

 

        //function to check no is prime or not

        public void checkPrimeNumber() {
        	
        	 Scanner in = new Scanner(System.in);   
    	      System.out.println("Enter a number to check whether the no is a  prime number.");  //it is the number to be checked
    	      String original = in.nextLine(); 
    	      int n=Integer.parseInt(original); 
    	      
        	 int i,m=0,flag=0;      
        	  m=n/2;      
        	  if(n==0||n==1){  
        	   System.out.println(n+" is not prime number");      
        	  }else{  
        	   for(i=2;i<=m;i++){      
        	    if(n%i==0){      
        	     System.out.println(n+" is not prime number");      
        	     flag=1;      
        	     break;      
        	    }      
        	   }      
        	   if(flag==0)  { System.out.println(n+" is prime number"); }  
        	  }//end of else 
        	  System.out.println();
        	}    


         

         //function to print Fibonacci Series

         public void printFibonacciSeries() {
        	 
        	 Scanner in = new Scanner(System.in);   
    	      System.out.println("Enter a number to make a Fibonacci Series");  
    	      String original = in.nextLine(); 
    	      int count=Integer.parseInt(original);  
    	      
                //initialize the first and second value as 0,1 respectively.
          		int first=0,second=1,n3,i;    
          		 System.out.print(first+" "+second);//printing 0 and 1    
          		    
          		 for(i=2;i<count+1;++i)//loop starts from 2 because 0 and 1 are already printed    
          		 {    
          		  n3=first+second;    
          		  System.out.print(" "+n3);    
          		  first=second;    
          		  second=n3;    
          		 }    
          		System.out.println();
          		}

 

	//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

	do {

		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

		System.out.println();

 

		choice = sc.nextInt();

		switch (choice) {

 

		case 0:

		choice = 0;

		break;

 

	case 1: {

		obj.checkPalindrome();

		}

		break;

 

	case 2: {

 

		obj.printPattern();

		}

		break;

 

	case 3: {

		obj.checkPrimeNumber();

		}

		break;

 

	case 4: {

 

		obj.printFibonacciSeries();

		}

		break;

 

	default:

		System.out.println("Invalid choice. Enter a valid no.\n");

		}

 

		} 

	while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

		}

 

	}