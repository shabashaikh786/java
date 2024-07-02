public class Shopping{

	public static void details(String shoppingType){
	System.out.println("shopping type is :"+shoppingType);
	
	
	}
	public static void itemName(String item,String shoppingType){
	System.out.println("item name is :"+item+  "shopping type is:"+shoppingType);
		
		
	}
	
	public static void shoppingDetails(String item,String shoppingType,int totalPrice){
	System.out.println("item name is :"+item+  "shopping type is:"+shoppingType+ "total price is:"+totalPrice);
	}
	public static void totalPrice(int totalPrice,String gst){
	System.out.println( "total price is:"+totalPrice+ "gst is :"+gst);
	}



}