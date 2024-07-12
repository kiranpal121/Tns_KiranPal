package Covariantdemo;



	class Colour {
		
		protected Colour getColour()
		{
			Colour s= new Colour();
			return s;
		}
	}

	class Red extends Colour {
		
		protected Red getColour() {
			
			Red s=new Red();
			return s;
			
		}
	}


	class Yellow extends Colour {
		
		protected Yellow getColour() {
			
			Yellow s=new Yellow();
			return s;
			
		}
	}



	public class Covariantoverridding {

		public static void main(String[] args) {
			
			Colour c= new Colour();
			System.out.println(c.getColour());
			
			Red r = new Red();
			System.out.println(r.getColour());
			
			
			
			
		
}
}
