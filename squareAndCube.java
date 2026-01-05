package codepractice;
//find square and cube value for given integer...
import java.util.Scanner;

public class squareAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  //Scanner method for dynamic input
		System.out.println("Enter Number");
		int n = scan.nextInt(); //scan the input and assign to variable
		System.out.println("Type -> sqaure for S or Cube for C"); //Asking user for square or cube of the number.
		String name = scan.next(); //scan the letter for calculation
		if(name.equals("S")) { //checking the letter
			square(n);         // calling method for square
		}else if (name.equals("C")) {
			cube(n);           //calling method for cube
		}else {
			System.out.println("Re-Type the letters in correct manner...");
		}
		
		
	}

	public static void square(int n) {
		// TODO Auto-generated method stub --> square of a number
		System.out.println(n*n); //print the square of the number
		
	}
	public static void cube(int n) {
		// TODO Auto-generated method stub --> Cube of a number
		System.out.println(n*n*n); //print the cube of the number
		
	}

}
