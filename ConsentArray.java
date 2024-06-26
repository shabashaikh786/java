public class ConsentArray{

	public static void main(String args[]){
	
	char consonents[] = {'A','E','I','O','U','B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
	int count =0;
	
	for(int index=0; index<consonents.length; index++){
	
		if(consonents[index]!='A'&&consonents[index]!='E'&&consonents[index]!='I'&&consonents[index]!='O'&&consonents[index]!='U'){
			System.out.println("condition is true");
			count++;
			
	}else {
		System.out.println("condition is false");
	}
	}
		System.out.println("array element of vowels counts is:"+count);


	
	}


}
