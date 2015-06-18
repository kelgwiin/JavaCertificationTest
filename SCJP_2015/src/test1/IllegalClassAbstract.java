package test1;

public abstract class IllegalClassAbstract extends Coo1 {
	public abstract void myMethod();

	/**
	 * This method seems Illegal but isn't
	 */
	public final void myMethodFinalIllegal() {
		System.out.println("Final Method inside an Abstract Class");
		InnerClass ic = new InnerClass();
		ic.print();
		int[] list = new int[5];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		list[4] = 50;
		ic.print(list);
		print();
	}

	private class InnerClass {
		public void print(int... x){
			for (int i : x) {
				System.out.println("Multiple Args: " + i+ " Length: "+x.length);
			}
			System.out.println("Private Nested Class");
		}
	}
	
	public class InnerPublicClass {
		
		public InnerPublicClass(){
			
		}
		public void print(){
			System.out.println("Public Nested Class");
		}
	}
}
