public class Laptop{
	public static void main(String args[]){
		
		int  num[] = {1,2,34,57,66};
		String name[] = {"hp", "dell", "lenavo", "apple"};
		long  price[] = {20000,87766,986765,98765443,9877665};
		char initial[]= {'S','R', 'R','S'};
		
		for(int index =0; index<num.length; index++){
			
			System.out.println("array elements number is:"+num[index]);
		}
		
		for(int index =0; index<name.length; index++){
		
			System.out.println("array elements name is:"+name[index]);
		}
		
		for(int index =0; index<price.length; index++){
		System.out.println("array elements total is:"+price[index]);
		}
		
		for(int index =0; index<initial.length; index++){
			System.out.println("array elements number is:"+initial[index]);
			
		}
		
		
	}

}