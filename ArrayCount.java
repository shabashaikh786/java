public class ArrayCount{
	
	public static void main(String args[]){
		
		int countNumbers[] = {7,12,45,67,89,98,49,64,65,33,99};
		int evenCount = 0;
			int oddCount = 0;
		
		System.out.println("count  of even and odd number");
		for(int index =0; index<countNumbers.length; index++){
			
			if(countNumbers[index] % 2 == 0){
				System.out.println("count of even is:"+evenCount);
				evenCount++;
				
			}else{
							
				System.out.println("count of odd is:"+oddCount);
				oddCount++;
				
			}
		}
			
			System.out.println("total number of even number is:"+evenCount);
			System.out.println("total number of odd number is:"+oddCount);
		}
		
	
	}


