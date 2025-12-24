package codepractice;

import java.util.Scanner;

public class ThirdLargestNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			int n = scan.nextInt();  //Array size
			int[] a = new int[n];    // declaration of array
			for(int i=0; i<n; i++)   //loop the array insert the variables
			{
				a[i]= scan.nextInt();
			}
			
			int fl = Integer.MIN_VALUE;  //initiate with minimum value
			int sl = Integer.MIN_VALUE;  //initiate with minimum value
			int tl = Integer.MIN_VALUE;  //initiate with minimum value

			for(int i=0; i<n; i++)
			{
				if (a[i]>fl)             //checking fl variable with every array variable
				{
					tl = sl;
					sl = fl;
					fl = a[i];
				}
				else {
					tl =sl;
					sl = a[i];
				}
			}
			
			System.out.println(fl +" "+ sl +" "+ tl);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
	}

}
