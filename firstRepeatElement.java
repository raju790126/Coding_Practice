
// Write a program to find the first repeat element in the array & if its not print -1...


package day2;

import java.util.Scanner;

public class firstRepeatElement {
	public static void main(String [] arg) {
		Scanner scan = new Scanner(System.in); // scanner method to take the input values
		System.out.println("Enter size of the array : ");
		int n = scan.nextInt();
	    int [] a = new int[n];           //created a integer array
	     
	    for(int i=0; i<a.length; i++)   //loop function for to scan the input values
	    {
	        a[i] = scan.nextInt();
	    }
	    
	    repeat(a);                     //calling method
	    }
	
	    public static void repeat(int[] a)  //repeat value handling method
	    {
	        try{               //exception handing
	            int count =0;
	            for(int i=0; i<a.length; i++)  //loops for took one element in the array
	            {
	                for(int j=i+1; j<a.length; j++) //loop for check took element with remaining elements
	                {
	                    if(a[i] == a[j])  //condition for both elements are equal or not
	                    {
	                        count ++;
	                        System.out.print("Repeat element is "+a[i]);
	                        System.exit(0); //OS exit from entire running program 
	                    }
	                }
	            }
	            if(count == 0) //condition for only non-repeated elements present in the array 
	            {
	                System.out.print("No repeat elements -> -1"); //print
	            }
	            
	        }
	        catch(Exception e)
	        {
	            System.out.print(e);
	        }
		
	}
	
}
