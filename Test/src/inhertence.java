
interface A{
	void meth1();
}
interface B extends A{
	void meth2();
}
interface c extends B{
	public default void meth1() {
		System.out.println("jjj");
	}
}
public class inhertence {

	public static void main(String[] args) {
		

	}

}
