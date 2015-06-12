package test1;

public class Coo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coo2 c2 = new Coo2();
		c2.print();

	}
	void print(){
		Coo1 c = new Coo1();
		System.out.println("Coo2");
		c.print();
	}
}
