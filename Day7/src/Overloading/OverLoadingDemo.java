package Overloading;

public class OverLoadingDemo {

	public static void main(String[] args) {
		
		System.out.println("-------Constructor Overloading ---------");

		
		Point p = new Point();  //default
		System.out.println(p);
		
		Point p1=new Point(14.5f);
		System.out.println(p1);
		
		Point p2=new Point(12.5f, 20.50f);
		System.out.println(p2);
		
		System.out.println("---------------Method OverLoading----------- ");
		System.out.println("Addition of two integers "+ MethodOverloading.addition(5, 100));
		System.out.println("Addition of two float "+ MethodOverloading.addition(5.5f, 99.9999f));
	
		System.out.println("Addition of two String "+ MethodOverloading.addition("5", "100"));

		System.out.println("Addition of three no: "+ MethodOverloading.addition(5, 2, 10));
	}

}
