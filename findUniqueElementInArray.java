//Given two arrays, write a function to check if they have at least one common item.

//Return true if any item appears in both arrays

//Return false otherwise

//Example : 
//array1 = ["a", "b", "c", "x"]
//array2 = ["z", "y", "x"]
//Return : True 
//Example @ 2 
//array1 = ["a", "b", "c"]
//array2 = ["x", "y", "z"]
//Return : False

package day5;

public class findUniqueElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array1 = {"a", "b", "c", "X"};                  //Pte-defined inputs
		String [] array2 = {"x", "y", "z"};
		System.out.println(checkCommonELement(array1, array2));   //Calling method
		String[] array3 = {"a", "b", "c"};                        //Pte-defined inputs
		String[] array4 = {"x", "y", "z"}; 
		System.out.println(checkCommonELement(array3, array4));   //Calling method
		
	}

	public static boolean checkCommonELement(String[] array1, String[] array2) {
		// TODO Auto-generated method stub
		for(int i=0; i<array1.length;i++) {          //looping the first array
			for(int j=0; j<array2.length; j++) {     //looping the second arraY
				if(array1[i].equalsIgnoreCase((array2[j])))  //comparing elements by ignore cases
				{
					return true;                     //return when its true
				} 
			}
		}
		return false;           ////return when its false
	}

}
