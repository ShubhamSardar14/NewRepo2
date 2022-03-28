package StringLab2;

//Write a Java program to return the
//sum of the digits present in the given string. If there is no digits the sum return is 0.
public class SumofDigit {

	static 	int sumofdigit(String r)
	{
		  int len= r.length();
		  int sum=0;
		  for(int i= 0;i<len;i++)
		  {
			  
			  if(Character.isDigit(r.charAt(i)))   
			  {
				  String l = r.substring(i,i+1);
				  sum= sum + Integer.parseInt(l);
				  
			  }}
			 return sum;
		  
		 
		
	}
	
	
	public static void main(String[] args) {
		 
  String r="456he12";
 
  int totalofdigit= sumofdigit(r);
  System.out.println("total of digits in string "+ totalofdigit);
  

	}

	

}
