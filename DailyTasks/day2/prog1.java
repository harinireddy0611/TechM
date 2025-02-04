package day1;
import static java.lang.Integer.*;
import java.util.Scanner;

public class prog1 {
	public static void main(String args[]) {
		System.out.println("Day1");
		
		Scanner sc=new Scanner(System.in);
		int num=parseInt(args[0]);

		float n1=Float.parseFloat(args[1]);
		double d1=sc.nextDouble();
		
		int itemcode=sc.nextInt();
		
		sc.close();
		//Switch with arrow
		switch(itemcode){
		case 1 -> System.out.println("its is au");
		case 2,3-> System.out.println("its is hyd");
		};

		//Switch with multiple 
		switch(itemcode){
		case 1 : System.out.println("jsbds");
		case 2,3 : System.out.println("xyd");
		};
		
		// Switch with yield
		String str= switch(itemcode){
		case 1 :
			yield "its is au";
		case 2:
			yield "hi";
		default: 
			throw new IllegalStateException("vcgsdfawet");
			

		};
		
		// Printing multiple lines in java 
		// 1. + concatination
		// 2. json 
		// 3. """ triple quotes
		//4. """ and /
		
		System.out.println(num);
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(str);
		sc.close();
		
	}
}
