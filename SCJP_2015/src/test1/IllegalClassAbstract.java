package test1;

public abstract class IllegalClassAbstract {
	public abstract void myMethod();
	
	/**
	 * This method seems Illegal but isn't
	 */
	public final void myMethodFinalIllegal(){
		System.out.println("Final Method inside an Abstract Class");
	}

}
