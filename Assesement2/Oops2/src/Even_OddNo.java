import java.util.Scanner;

public class Even_OddNo {
	
	public static void main(String args[]) {
		
		int n;
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter the no of elment in array:");
		n = obj1.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter all of elments:");
		
		for(int i=0;i<n;i++) {
			
			 a[i]=obj1.nextInt();
			 
		}
		
		System.out.println("Odd Number");
		
		for(int i=0;i<n;i++) {
			
			if(a[i] % 2!= 0) {
				
				System.out.println(a[i]+ " ");
				
			}
		}
		System.out.println(" ");
		
		System.out.println("Even Number");
		
        for(int i=0;i<n;i++) {
			
			if(a[i] % 2 == 0) {
				
				System.out.println(a[i]+ " ");
				
			}
		}
		
		
		
		
		
	}

}
