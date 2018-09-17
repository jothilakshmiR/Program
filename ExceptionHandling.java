package day1.Examples;
import java.util.Scanner;
class Exception{
	public static void main(String[] args) {
		int a,b, result;
		Scanner input = new Scanner(System.in);
				System.out.println(" Input two Integers");
				
		a = input.nextInt();
		b = input.nextInt();
		try
		{
			result = a/b;
			System.out.println("Result = " + result);
			
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught : Division by zero.");
			
		}
				
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		String language[] = { "Database", "Operating System", "Mobile Computing","Network"};
		try {
			for(int c = 1; c <= 5; c++)
				System.out.println(language[c]);
			
				
		

	}
catch(ArithmeticException e) {
	System.out.println(e);
}
}
}
