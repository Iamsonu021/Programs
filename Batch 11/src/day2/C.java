package day2;

class A{
	public void m1() {
		System.out.println("Hello Everyone");
	}
}
class B extends A{
	public void m2() {
		System.out.println("welcome to C2TC");		
	}
	public void m1() {
		System.out.println("Good Morning");
	}
	public void m1(String s) {
		System.out.println(s);
	}
}

public class C {

	public static void main(String[] args) {
		A a,a1;
		B b;
		a= new A();
		b= new B();
		a1=a;
		a1.m1();
		a1=b;
		a1.m1();
	

	}

}
