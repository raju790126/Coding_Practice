package codepractice;

import java.util.Scanner;

public class squareAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		System.out.println("Type -> sqaure for S or Cube for C");
		String name = scan.next();
		if(name.equals("S")) {
			square(n);
		}else if (name.equals("C")) {
			cube(n);
		}else {
			System.out.println("Re-Type the letters in correct manner...");
		}
		
		
	}

	public static void square(int n) {
		// TODO Auto-generated method stub
		System.out.println(n*n);
		
	}
	public static void cube(int n) {
		// TODO Auto-generated method stub
		System.out.println(n*n*n);
		
	}

}
