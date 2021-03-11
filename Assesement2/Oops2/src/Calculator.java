import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the 1st numbers:");
		int a = obj.nextInt();
		
		System.out.println("Enter the 2nd numbers:");
		int b = obj.nextInt();
		
		System.out.println("Enter the operator:");
		char op = obj.next().charAt(0);
		
		int result = 0;
		switch(op) {
		
		case '+':
			result = a+b;
			System.out.println(a+ "+" +b+ "=" +result);
			break;
			
		case '-':
			result = a-b;
			System.out.println(a+ "+" +b+ "=" +result);
			break;
			
		case '*':
			result = a*b;
			System.out.println(a+ "+" +b+ "=" +result);
			break;
			
		case '/':
			result = a/b;
			System.out.println(a+ "+" +b+ "=" +result);
			break;
				
		default:
			System.out.println("Invalid operator");
			
		}
		
		
		
		
	}

}
