/* Given an array arr[] of n integers, construct a product array res[] (of the same size)
   such that res[i] is equal to the product of all the elements of arr[] except arr[i].
   
   Input: arr[] = [10, 3, 5, 6, 2]
   Output: [180, 600, 360, 300, 900]
   
   Explanation: 
	For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
	For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
	For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
	For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
	For i = 4, res[i] = 10 * 3 * 5 * 6 is 900. */


package day4;

import java.util.Scanner;

public class productAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);                    // Scanner Object creation
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int[] a = new int[n];                            //Array obj creation
		
		try {
			for (int i = 0; i < a.length; i++)      //Taking the array elements
			{ 
				a[i] = scan.nextInt();
			}
			
			System.out.print("Input : [");          //Printing the input array
			for (int i = 0; i < a.length; i++) {
				if(i != a.length-1)
				{
					System.out.print(a[i]+", ");
				}
				else
				{
					System.out.print(a[i]);
				}
			}
			System.out.println("]");
			productEle(a);                          // calling method
			
		} catch (Exception e) {
			System.out.println(e);                  // TODO: handle exception
		} 
		
	}
	
	public static void productEle(int[] a) {
		
		int [] res = new int [a.length];            // created a new result array with same size of input array
		int pro=1;
		try {
			for (int i = 0; i < a.length; i++) {     //product the elements in the array
				
				for (int j = 0; j < a.length; j++) {
					if(i != j)
					{
						pro = pro * a[j];
					}
				}
				res[i] = pro;     //Inserting every product elemnt into the result array
				pro = 1;          //Here again we reset pro to 1.
			}
			
			System.out.print("output : [");          // Printing loop for output
			for (int i = 0; i < res.length; i++) {
				if(i != res.length-1)
				{
					System.out.print(res[i]+", ");
				}
				else
				{
					System.out.print(res[i]);
				}
			}
			System.out.print("]");
		} catch (Exception e) {
			System.out.println(e);                    // TODO: handle exception
		}
		
	}

}
