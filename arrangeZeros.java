package day6;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//Input: nums = [0]
//Output: [0]

import java.util.Arrays;
import java.util.Scanner;

public class arrangeZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n = scan.nextInt();
		int[] a = new int [n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(shiftZeroes(a)));
		

	}

	public static int[] shiftZeroes(int[] a) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		try {
 			while(i<a.length)
			{
				if (a[i] == 0) {
					i++;
				}
				else
				{
					a[j]=a[i];
					j++;
					i++;
				}
			}
			
			while(j<a.length)
			{
				a[j] = 0;
				j++;
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return a;
		
	}

}
