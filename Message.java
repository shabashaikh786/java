public class Message{

	public static void main(String args[])
	{

		//declare 9 Array
		
		int num[] = {3,6,9,12,15};
		char vowels[] = {'A','E','I','O','U'};
		String senderName[] = {"zen","alice","bob", "james","nike"};
		float time[] = {1.23f,2.60f,3.45f,6.7f,7.34f};
		byte noOfUser[] = {10,20,30,40,50};
		long members[] = {1000l,20000l,3000l,40000l,40776l,567899l};
		boolean isVowels[] = {true,false,true,false,true};
		short amount[] = {400,500,600,700,800};
		double versions[] = {4.5,6.7,89.5,33.5,3,5,6.7};

		
		System.out.println("length of array number is:"+num.length);
		for(int i=0; i<num.length; i++){
			System.out.println("array elements are:"+num[i]);	
		}
		
		
		System.out.println("length of array vowels is:"+vowels.length);
		for(int test=0; test<vowels.length; test++){
			System.out.println("array elements are:"+vowels[test]);	
		}
		
		
		System.out.println("length of array senders are:"+senderName.length);
		for(int car=0; car<senderName.length; car++){
			System.out.println("array elements are:"+senderName[car]);	
		}
		
		
		System.out.println("length of array time is:"+time.length);
		for(int j=0; j<time.length; j++){
			System.out.println("array elements are:"+time[j]);	
		}
		
		
		System.out.println("length of array users is:"+noOfUser.length);
		for(int k=0; k<noOfUser.length; k++){
			System.out.println("array elements are:"+noOfUser[k]);	
		}
		
		
		System.out.println("length of array member is:"+members.length);
		for(int user=0; user<members.length; user++){
			System.out.println("array elements are:"+members[user]);	
		}
		
		
		System.out.println("length of array isvowels :"+isVowels.length);
		for(int door=0; door<isVowels.length; door++){
			System.out.println("array elements are:"+isVowels[door]);	
		}
		
		
		System.out.println("length of array amount is:"+amount.length);
		for(int window=0; window<amount.length; window++){
			System.out.println("array elements are:"+amount[window]);	
		}
		System.out.println("length of array version is:"+versions.length);
		for(int glass=0; glass<versions.length; glass++){
			System.out.println("array elements are:"+versions[glass]);	
		}
		
		
		
		
	}
}