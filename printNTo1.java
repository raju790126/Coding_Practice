package codepractice;

import java.util.Scanner;

public class printNTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //Scanner Object
		int n = scan.nextInt();
		print(n); // Calling the print method
	}
	public static void print(int n) {
		
		try {
			if (n>0) { //Positive Numbers 
				for (int i=n; i>=1; i--)  //looping the numbers up to n 
				{
					System.out.print(i+" ");
				}
				
			} else { //Negative Numbers
				for (int i=n; i<=1; i++)  //looping the numbers up to n 
				{
					System.out.print(i+" ");
				}
			}
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}

}
