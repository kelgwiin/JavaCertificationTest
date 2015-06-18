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
	enum MyEnum {
		UNO(10){
			public String getName(){
				return "Uno ";
			}
		}, 
		DOS(20) ,
		TRES(30);
		
		private int num;
		private String name;
		MyEnum(int num){
			this.num = num;
			name = "Número";
		}
		
		public int getNum(){
			return num;
		}
		
		public String getName(){
			return name;
		}
	}
	
	public static void main(String[] args) {
		MyEnum en;
		en = MyEnum.DOS;
		Main.print(en.getNum());
		Main.print(en.getName());
		Main.test1();
	}
	
	public static void print(Object obj){
		System.out.println(obj);
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
