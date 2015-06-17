package test1;
import test2.MyProtectedClass;

public class UseClassWithProtectedMember {
	
	public void use(){
		MyProtectedClass pc = new MyProtectedClass();
		
		/**
		 * It does not work because the member class is protected, but it does in the class
		 * that be at the same package
		 */
		//pc.myMsgProtected();
	}
}
