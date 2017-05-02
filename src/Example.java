public class Example {
	public static void main(String[] args) {
		m1();
		m2();
	}
	public static void m1() {
		int a=1;
		int b=1;
		int c=a+b;
	}
	public static void m2() {
		m1();
		m1();
	}
}
