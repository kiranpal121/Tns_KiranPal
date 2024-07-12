package usingfinal;

public class FinalVariable {

	
	
		final int x=100;
	
		final static int y;
		
		final static int z = 10;
		
		void change() 
		{
			//
		}
//			}

		@Override
		public String toString() {
			return "FinalVarible [x=" + x + ", y=" + y +"]";
		}
		
		static {
			y=20;
		 
			System.out.println("Value of Y :" + y);
		}
		
		
		
		
		
		
}
