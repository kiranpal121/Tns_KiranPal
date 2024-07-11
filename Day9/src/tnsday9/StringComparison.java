package tnsday9;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "TNSIF";
		String s2 = "TNSIF";
		String s3 = new String ("TNSIF");
		String s4 = new String ("TNSIF");
		
		System.out.println("Case 1:" + (s1==s2));
		System.out.println("Case2 :"+ (s1==s3));
		
		System.out.println("Case 3: "+ (s2.equals(s1)));
		System.out.println("Case 4: "+ (s2.equals(s4)));
		
		System.out.println("Case5 :"+ (s3==s4));
		System.out.println("Case 6: "+ (s3.equals(s4)));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.compareTo("TNSIF"));
		System.out.println(s1.compareToIgnoreCase ("tnsif"));
		System.out.println(s1.compareTo(s4));
	    System.out.println(s1.compareTo("AA"));
	
	
	}
}
