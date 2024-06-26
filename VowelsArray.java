public class VowelsArray{

	public static void main(String args[]){
	
	char vowels[] = {'A','E','I','O','U','B','C','D'};
	int count =0;
	
	for(int index=0; index<vowels.length; index++){
	
		if(vowels[index]=='A'||vowels[index]=='E'||vowels[index]=='I'||vowels[index]=='O'||vowels[index]=='U'){
			System.out.println("condition is true");
			count++;
			
	}else {
		System.out.println("condition is false");
	}
	}
		System.out.println("array element of vowels counts is:"+count);

	
	
	
	
	
	}


}

