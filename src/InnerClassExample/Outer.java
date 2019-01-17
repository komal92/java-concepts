package InnerClassExample;

public class Outer {
	
	private void haveFun() {
		System.out.println("This is outer class' fun");
	}

	

	private class Inner extends Outer {
		private void haveFun() {
			System.out.println("This is inner class' fun");
		}
	}
	
	public static void main(String[] args) {
		Outer o= new Outer();
		Inner i=o.new Inner();
		
		i.haveFun();
		o=i;
		o.haveFun();// private methods are bonded during compile time and it is the type of the reference variable – not the type of object that it refers to – that determines what method to be called.. 
		
		//Static binding- As a side note, private methods may be performance-wise better (compared to non-private and non-final methods) due to static binding.
		
	}

}
