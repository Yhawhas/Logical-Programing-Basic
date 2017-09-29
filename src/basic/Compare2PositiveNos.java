package basic;

public class Compare2PositiveNos {
	static int firstNumber(int x){
	     int firstN = x;
	     while(firstN > 9){
//	    	 System.out.println("Mod: "+(firstN%10));
//	    	 System.out.println("check: "+(firstN - (firstN%10)));
	          firstN = (firstN - (firstN%10))/10;
	          System.out.println("cc "+firstN);
	     }
	     return firstN;   
	 }
	public static void main(String args[]){
		int a = 915;
		int b = 125;
		int x = firstNumber(a);
		System.out.println("aa: "+x);
	}

}
