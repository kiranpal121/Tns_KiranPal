package secondpacakge;
import firstpackage.*;
public class executor {

	public class Executor {

		public static void main(String[] args) {

			//accessing different package class
			
			Base b1 = new Base();
			
			//private , default and protected members can't access
			
			b1.methodPublic();
			b1.varPublic = 41;
			b1.methodPublic();
			
		}
}
}






