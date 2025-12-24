package codepractice;

import java.util.Scanner;

public class print1ToN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Scanner Object
		int n = scan.nextInt();
		print(n); // Calling the print method
	}
	public static void print(int n) {
		
		try {
			if (n>0) { //positive numbers
				for (int i=1; i<=n; i++)  //looping the numbers up to n 
				{
					System.out.print(i+" ");
				}
				
			} 
			else {	//Negative numbers
				for (int i=1; i>=n; i--)  //looping the numbers up to n 
				{
					System.out.print(i+" ");
				}
			}
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}
}
