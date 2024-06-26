public class IndustryRunner{

	public static void main(String args[]){
		
		System.out.println(" before preincrement:"+Industry.id);
		++Industry.id;
		System.out.println(" after preincrement:"+Industry.id);
		
		System.out.println(" before predecrement:"+Industry.id);
		--Industry.id;
		System.out.println(" after predecrement:"+Industry.id);
		
	}
}