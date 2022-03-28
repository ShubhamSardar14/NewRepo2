/*Q 2 Write a Java program to concatenate a given string to the end of another string*/
package StringLab2;

public class Concat {

	
	static String Add(String a,String b) {
		return a+ ""+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="World";
		
		String newString=Concat.Add(s1, s2);
		System.out.println(newString);
	}

}
