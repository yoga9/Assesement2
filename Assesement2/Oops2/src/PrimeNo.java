
public class PrimeNo {
	
	 void fun(int N) {
		
		int i, j, count;
		
		System.out.println("Prime No between 1 and " + N + " are:");
		
		for(int i=1; i<=N; i++) {
			
			if(i==1 || i==0)
				continue;
			
			count=1;
			
			for(j=2; j<=i/2;j++) {
				
				if(i%j==0) {
					
					count=0;
					break;
					
				}
				
			}
			if(count==1)
				System.out.println(i+ " ");
		}
	}
   
	 public static void main(String args[]) {
		 
		 int N=50;
		 
	     fun(N);
		 
		 
	 }
	
}
