public class FactoryRunner{

	public static void main(String args[]){
	
	System.out.println(" before postincrement:"+Industry.id);
	Industry.id++;
	
	System.out.println(" after postincrement:"+Industry.id);
		
	System.out.println(" before postdecrement:"+Industry.id);
	Industry.id--;
	
	System.out.println(" after postdecrement:"+Industry.id);
	
	
	
	}

}