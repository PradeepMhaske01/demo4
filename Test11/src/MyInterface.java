
public interface MyInterface {
	void mn();
	}
interface MyInterface2{
	void mn();
}

  class Child implements MyInterface,MyInterface2{

	@Override
	public void mn() {
		// TODO Auto-generated method stub
		System.out.println("hi it is java");
	}

	
}
