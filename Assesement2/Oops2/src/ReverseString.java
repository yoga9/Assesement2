import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[])
	{
		String str;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		str = obj.nextLine();
		
		char[] obj1 = str.toCharArray();
		System.out.println("Reverse the string: ");
		 
		int j = obj1.length;
		
		for(int i=j; i>0; i--) {
			
			System.out.print(obj1[i-1]);
			
		}
		
		
	}

}
