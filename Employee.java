public class Employee{
	public static void main(String args[]){
		
		int  id[] = {1,2,34,57,66};
		String name[] = {"suresh", "ramesh", "reva", "suma"};
		long  totalEmployee [] = {20000,87766,986765,98765443,9877665};
		char initial[]= {'S','R', 'R','S'};
		
		for(int index =0; index<id.length; index++){
			
			System.out.println("array elements id is:"+id[index]);
		}
		
		for(int index =0; index<name.length; index++){
		
			System.out.println("array elements name is:"+name[index]);
		}
		
		for(int index =0; index<totalEmployee.length; index++){
		System.out.println("array elements total Employee is:"+totalEmployee[index]);
		}
		
		for(int index =0; index<initial.length; index++){
			System.out.println("array elements number is:"+initial[index]);
			
		}
		
		
	}

}