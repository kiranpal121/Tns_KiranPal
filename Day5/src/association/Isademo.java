package association;

public class Isademo {

public static void main(String[] args) {

		
		Employee employee=new Employee("Kiran", 1001, "IT");
		Manager manager=new Manager("Neha", 1002, "Hr", 8);
		
		System.out.println(employee);
		System.out.println("-----------------------------------------------------------");
		System.out.println(manager);
	}
}
