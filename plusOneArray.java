package day7;

//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//*Example 1:*
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//*Example 2:*
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//*Example 3:*
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].


import java.util.Arrays;
import java.util.Scanner;

public class plusOneArray {

	static Scanner scan;     //global object
	static int r=0;          //global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);                       //scanner obj creation
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();  //length of the array
		int [] a = new int[n];   // Array obj
		
		scanner(a); //calling method
		System.out.println(Arrays.toString(a)); //print input array
		 r =convertInteger(a); //calling convertInterger from array
		System.out.println(Arrays.toString( convertArray(r)));;   // calling convertArray method from string

	}
	
	public static int convertInteger(int[] a) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < a.length; i++) {   //looping input array
			r = r * 10 + a[i];       //convert array elements into integer number
		}
		return r+1;  //add +1 with extract integer
		
	}
	
	public static int[] convertArray(int r) {      
		String l="";
		l = r+"";                         //Convert integer to string
		int[] b = new int [l.length()];   //New array creation with string length
		for(int i =l.length()-1; i>=0; i--)
		{
			b[i] = r%10;                   //spliting the string and adding into new array
			r=r/10;
		}
		
		return b;                  //return new array
		
	}

	public static void scanner(int[] a)         //Scanner to take the input elements
	{
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();              // adding input elements to array
		}   
	}
	

}
