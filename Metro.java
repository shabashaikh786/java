public class Metro{
	public static void fromTo( String from, String to){
	System.out.println(" from is:"+from); 
	System.out.println(" to is:"+to);
	System.out.println("from is:"+from+ "to is:"+to);
	}
	public static void result(String from , String to){
		if(from == "banashakari" || to == "BTM"){
			System.out.println("condition is true");
			System.out.println("ticket price is 25rs");
		}else{
			System.out.println("ticket price is 50rs");
			
		}
		
	}
	public static void balance(int cardBal, int ticketPrice){
	System.out.println("card balance is:"+cardBal);

	}
}