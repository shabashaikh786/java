public class CubeDisplay{

	public static void main(String args[]){
	 
	 int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	 int cube =  1;
	 
	 for(int index=0; index<num.length; index++){
		 cube = index*index*index;
	 
		 System.out.println("cube of elements are :"+  cube);
		 
	 
	 }
	}
}
