package main;

import test1.*;
import test1.IllegalClassAbstract.*;

/**
 * 1) We cannot extends from a class that has a package access
 * 
 * @author kgamez
 * 
 */
public class Main /** 1) extends Coo1 **/
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IllegalClassAbstract ac = new IllegalClassAbstract() {
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("body method @myMethod");
			}

			/**
			 * This has error because it has a modifier final inside.
			 */
			// public final void myMethodFinalIllegal(){
			// System.out.println("Final Method inside an Abstract Class");
			// }

		};
		InnerPublicClass pc =  ac.new InnerPublicClass();
		
		ac.myMethod();
		ac.myMethodFinalIllegal();

	}

}
