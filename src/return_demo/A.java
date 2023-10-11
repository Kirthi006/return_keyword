package return_demo;

public class A {
public static void main(String[] args) {
	A a1 = new A();
	a1.test();
	a1.test1();
	a1.test2();
	String s = a1.test3();// assign statement to new local variable
	System.out.println(s);
}

public String  test3() { 
	return "sam"; 
	
}

public  int test2() {
	return 0;
	System.out.println(100);// do not write anything after return keyword because that line of code will not execute..
}

public int test1() {
	return 10;//if a method is not void then adding return statement with value is mandatory..
}

public void test() {
	return 100; //if a method is void such statement cannot return any values..


	
}
}
