package day8;

import java.util.Scanner;

public class nonRepeatCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String s = scan.next();
		System.out.println(checkNonRepeat(s));
		scan.close();
	}
	
	public static int checkNonRepeat(String s)
	{
		int count =0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				return i;
			}
			count=0;
		}
		return -1;
		
	}

}
