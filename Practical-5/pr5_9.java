// 9. Program to implement the following scenario:
//    Interface A   Interface B
//           \       /
//            \     /
//            Interface C (extends A, B)
//                    |
//                  Class E (extends D, implements C)
//            Class D ---> /

// Define top-level interfaces A and B
interface A {
	void methodA();
}

interface B {
	void methodB();
}

// Interface C inherits from both A and B
interface C extends A, B {
	void methodC();
}

// Concrete class D with its own behavior
class D {
	void methodD() {
		System.out.println("Inside D.methodD() - functionality of Class D");
	}
}

// Class E extends D and implements C (which already includes A and B)
class E extends D implements C {
	@Override
	public void methodA() {
		System.out.println("E implements A: methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("E implements B: methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("E implements C: methodC()");
	}
}

// Demo class to show the relationships work as expected
class ScenarioDemo {
	public static void main(String[] args) {
		E obj = new E();
		// Call methods from interfaces A, B, C and base class D
		obj.methodA();
		obj.methodB();
		obj.methodC();
		obj.methodD();

		// Polymorphic references
		A aRef = obj; aRef.methodA();
		B bRef = obj; bRef.methodB();
		C cRef = obj; cRef.methodC();
		D dRef = obj; dRef.methodD();
	}
}

// Keep the public class name matching the file to avoid filename conflicts.
public class pr5_9 { }
