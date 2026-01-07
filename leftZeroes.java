package day9;

import java.util.Arrays;
import java.util.Scanner;

public class leftZeroes {

	public static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		scanner(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arrangeZeroes(a)));
		
	}
	public static int[] arrangeZeroes(int[] a) {
		// TODO Auto-generated method stub
		int i=a.length-1;
		int j =a.length-1;
		while(i>=0) 
		{
			if(a[i]==0)
			{
				i--;
			}
			else
			{
				a[j]= a[i];
				i--;
				j--;
			}
		}
		while(j>=0)
		{
			a[j]=0;
			j--;
		}
			
		return a;
  
	}
	public static void scanner(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
	}

}
