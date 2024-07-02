public class Cricket{
	public static void runRate(int runRate, String playerName, int totalScore){
	System.out.println("Cricket runRate is:"+runRate); 
	System.out.println("Cricket playerName:"+playerName);
	System.out.println("Cricket totalScore are:"+totalScore);
	}
	public static void result(boolean result){
		if(result == true){
			System.out.println("result is win");
		}else{
			System.out.println("result is loss");
			
		}
		
	}
	public static void players(int players){
	System.out.println("Cricket players are:"+players);

	}
	public static void details(String name, int age,float height,int weight, String education , int noOfMatches,int totalScore){
	System.out.println("Cricket name are:"+name);
	System.out.println("player age are:"+age);
		System.out.println("player height are:"+height);

	System.out.println("player weight are:"+weight);
	System.out.println("player education are:"+education);
	System.out.println("Cricket noOfMatches are:"+noOfMatches);
	System.out.println("Cricket totalScore are:"+totalScore);

	}
	}