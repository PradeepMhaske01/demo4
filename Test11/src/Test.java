
public class Test {
	public static void main(String[] args) {
		child c = new child();
		c.m1(11);
	}

}
class Parent{
	
	void m1(int i) {

		System.out.println("integer");
	}
}
class child extends Parent{
	void m1(float f) {
		
		System.out.println("float");
	}
	
}