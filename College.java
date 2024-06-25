public class College{
	public static void main(String args[]){
		
		int  code[] = {1,2,34,57,66};
		String name[] = {"BKIT", "PDA", "REVA", "GOVT"};
		long  totalStudent[] = {20000,87766,986765,98765443,9877665};
		char initial[]= {'S','R', 'R','S'};
		
		for(int index =0; index<code.length; index++){
			
			System.out.println("array elements code is:"+code[index]);
		}
		
		for(int index =0; index<name.length; index++){
		
			System.out.println("array elements name is:"+name[index]);
		}
		
		for(int index =0; index<totalStudent.length; index++){
		System.out.println("array elements total student is:"+totalStudent[index]);
		}
		
		for(int index =0; index<initial.length; index++){
			System.out.println("array elements number is:"+initial[index]);
			
		}
		
		
	}

}