package multilevelinheritance;

public class MultiLevelInheritancedemo {

	public static void main(String[] args) {

		city c=new city();
		c.setCityName("Pune");
		c.setArea(23000.50f);
		c.setCapital("Delhi");
		c.setCountryName("India");
		c.setStateName("maharashtra");
		c.setLanguage("Marathi");
		
		System.out.println(c);
}
}