package main;

import test1.*;
import test1.IllegalClassAbstract.*;

/**
 * 1) We cannot extends from a class that has a package access
 * 
 * @author kgamez
 * 
 */

//enum MyEnum {
//	UNO(10){
//		public String getName(){
//			return "Uno ";
//		}
//	}, 
//	DOS(20) ,
//	TRES(30);
//	
//	private int num;
//	private String name;
//	MyEnum(int num){
//		this.num = num;
//		name = "Número";
//	}
//	
//	public int getNum(){
//		return num;
//	}
//	
//	public String getName(){
//		return name;
//	}
//}
public class Main /** 1) extends Coo1 **/
{

	
	public static void main(String[] args) {
		//Main.test1();
		
	}
	
	
	public void dataType(){
		int [] a;
		String[] b1[];
		int [] b1Int[];
		
		int b2[][];
		int[][] b3;
		
		 a = new int[2];
		 b1 = new String[2][3];
		 b2 = new int[2][3];
		 b3 = new int[2][3];
		 b2[1][1] = 12;
		 
		 b1[1][2] = "sds";
	}
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void test2(){
//		MyEnum en;
//		en = MyEnum.DOS;
//		Main.print(en.getNum());
//		Main.print(en.getName());
	}
	public static void test1() {
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
		ac.myMethodFinalIllegal();
		InnerPublicClass pc = ac.new InnerPublicClass();

		ac.myMethod();
		ac.myMethodFinalIllegal();

	}

}
