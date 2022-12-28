import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //arithmetic operator(+,-,*,/,%,++,--)
//        int a=num1+num2;
//        System.out.println(a);
        
        //assignment operator(=,+=,-=, *=)
//       num1+=3;
//       System.out.println(num1);
       
       
        //comparison operator(==, >=, <=, >, <)
//        if(num1==num2) {
//        	System.out.println("true");
//        }
//        else {
//        	System.out.println("false");
//        }
        
        //logical operator(&&, !, ||)
        if(num1>3 && num2>7) {
        	System.out.println("hello");
        }
        
	}

}
