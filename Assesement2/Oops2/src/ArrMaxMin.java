
public class ArrMaxMin {
	
	public int max(int[] arr) {
		
		int max = 0;
		 
	for(int i=0; i<arr.length;i++) {
		
		if(arr[i]> max) {
			
			max = arr[i];
			
		}
		
		return  max;
		
	}}
	
public int min(int[] arr) {
		
		int min = arr[0];
		 
	for(int i=0; i<arr.length;i++) {
		
		if(arr[i]< min) {
			
			min = arr[i];
			
		}
		
		return min;
		
	}}
	
	public static void main(String args[]) {
		
		int[] arrayNo = { 1, 2, 3, 4, 5};
		ArrMaxMin a = new ArrMaxMin();
		
		System.out.println("Max value in the array :" + a.max(arrayNo));
		System.out.println("Min value in the array :" + a.min(arrayNo));
	}
	
	}


