package practice;

public class revp {
	public static String reverse(String input) {
		
	
        return new StringBuilder(input).reverse().toString();
	}
        public static void main(String[] args) {
        	 String str = "hello";
             System.out.println(reverse(str));
	}

}
