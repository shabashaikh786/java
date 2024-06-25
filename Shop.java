public class Shop{
	public static void main(String args[]){
		
		int  num[] = {1,2,34,57,66};
		String shopName[] = {"Dmart", "supermart", "royalmart", "greenmart"};
		long  total[] = {20000,87766,986765,98765443,9877665};
		char initial[]= {'S','R', 'R','S'};
		
		for(int index =0; index<num.length; index++){
			
			System.out.println("array elements number is:"+num[index]);
		}
		
		for(int index =0; index<shopName.length; index++){
		
			System.out.println("array elements name is:"+shopName[index]);
		}
		
		for(int index =0; index<total.length; index++){
		System.out.println("array elements total is:"+total[index]);
		}
		
		for(int index =0; index<initial.length; index++){
			System.out.println("array elements number is:"+initial[index]);
			
		}
		
		
	}

}