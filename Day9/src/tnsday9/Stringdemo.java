package tnsday9;

public class Stringdemo {
	public static void main(String[] args) {
		char c[]={'I','n','d','i','a'};
		
		String s1 =new String(c);
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		String longstr ="This is to show" + "jow long sentences"+"can be printed";
		
		System.out.println(longstr);
	}

}
