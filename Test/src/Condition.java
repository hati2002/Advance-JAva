import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age:");
		int age=sc.nextInt();
		
//		if(age>=18) {
//			System.out.println("you can drive");
//		}
//		else {
//			System.out.println("you can not drive");
//		}

		if(age<5) {
			System.out.println("you are child");
		}
		else if(age>5 && age<18){
			System.out.println("you are young");
		}
		else {
			System.out.println("you are adult");
		}
	}

}
