package extra;

class A {

	String name = "Bhuvan";

	A(String name) {
		this.name = name;
	}

	public void printLocal() {
		System.out.println(name);
	}
}

public class B {
	public static void main(String[] args) {
		A a = new A("shashank");
		a.printLocal();
	}
}
