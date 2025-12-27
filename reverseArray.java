//Write a program to reverse an array without using another array
//write the code with single array


package day2;
import java.util.Scanner; //import JDK packages

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); // scanner method to take the input values
		System.out.println("Enter the size of the array :");
		int n = scan.nextInt();
		int [] a = new int[n];                  //created a integer array
		try {
			for (int i = 0; i < a.length; i++) { //loop function for to scan the input values
				a[i] = scan.nextInt();
			}
			
			reveArray(a);  //calling method
		} 
		catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		
	}
	public static void reveArray(int[] a)  //reverse method
	{
		System.out.print("Reversed the array : ");
		try {       //exception handing block
			for (int i = a.length-1; i >=0; i--) { //fetching the elements in reverse from the Array a 
				System.out.print(a[i]+" ");
			}
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}
}
