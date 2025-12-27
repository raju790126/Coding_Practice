//Implement a method to perform basic string compression using the counts of repeated characters. 
//If the "compressed" string would not become smaller than the original string, your method should return the original string.
//Input: aabcccccaaa
//Output: a2b1c5a3
//Input: abcd
//Output: abcd (because a1b1c1d1 is longer than the original)

package day3;

import java.util.Scanner;

public class countCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  //scanner object creation
		System.out.println("Enter the string : ");
		String s = scan.next();                 // take the i/p string
		
		System.out.println(countString(s));     // calling method
	}

	public static String countString(String s) {
		// TODO Auto-generated method stub
	
				int count=1, i ,j;  // local variables
				String t="", r="";
				try {
				for ( i = 0, j=1; i <s.length() && j<=s.length()-1; i++, j++) //loop for fetching elements and count the elements in the string
				{
						if(s.charAt(i) == s.charAt(j))     //comparing both characters are equal or not
						{
							count++;
						}
						else{                              
							t=t+s.charAt(i)+count;  //i value can have the checking element and count have the repeat count both concatinate to the new string
							count=1;
						}
				}
				t=t+s.charAt(i)+count;         // for last index element
				
				if(t.length() <= s.length())  // checking the input string is greater-than the new string
				{
					return t;       //return the string 
				}
				else {
					for(i=0; i<=t.length()-1;i++)  // if the new string is greater-than the new string we eleminate the single repeat one values
					{
						if(t.charAt(i)!= '1')
						{
							r=r+t.charAt(i);       //concatinate the new string to reduce string length
						}
					}
			
			}
			} catch (Exception e) {
				System.out.println(e);// TODO: handle exception
			}
				return r;         // return the string
		
		
	}

}
