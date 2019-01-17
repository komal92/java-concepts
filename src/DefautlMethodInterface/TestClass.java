package DefautlMethodInterface;

public class TestClass implements PI1,PI2{

	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		PI1.super.show();
	}
}
