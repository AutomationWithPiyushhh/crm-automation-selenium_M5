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
//		A a = new A("shashank");
//		a.printLocal();

		String nick = "Mahi";

		String fn = "Mahendra('" + nick + "')";
		String mn = "singh";
		String ln = "Dhoni";

		String fullName = fn + " " + mn + " " + ln;
		System.out.println(fullName);

//		dynamic xpath
		String orgName = "phonepe";
		String xpath = "//a[text()='" + orgName + "']";
		System.out.println(xpath);

	}
}
