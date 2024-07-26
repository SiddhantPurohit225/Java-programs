package InnerClass;


class Outer {
	static int outer_x = 100;

	void test() {
		//Inner inner = new Inner();
		Inner.display();
	}	

	static class Inner {
		static void display() {
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}

class Main {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
		Outer.Inner innerclass = new Outer.Inner();
		innerclass.display();  

        //else:
        // Outer.Inner.display();

	}
}
