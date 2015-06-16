package test1;

public abstract class IllegalClassAbstract {
	public abstract void myMethod();

	/**
	 * This method seems Illegal but isn't
	 */
	public final void myMethodFinalIllegal() {
		System.out.println("Final Method inside an Abstract Class");
		InnerClass ic = new InnerClass();
		ic.print();
	}

	private class InnerClass {
		public void print(){
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
