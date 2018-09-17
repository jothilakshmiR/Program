package day1.Examples;
import java.util.Arrays;
import java.util.Scanner;

public class Dimensional {



	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter length of string array");
	int length = sc.nextInt();
	String[] input = new String[length];
	System.out.println("please enter array element");
	for(int i = 0; i< length; i++)
	{
		String usrInput = sc.next();
		input[i] = usrInput;
	}
	 System.out.println("The String array input from user is : ");
	    System.out.println(Arrays.toString(input));
	    System.out.println("Please enter number of rows and columns of 2D array");
	    int rows = sc.nextInt();
	    int columns = sc.nextInt();

	    int[][] data = new int[rows][columns];
	    System.out.println("Please enter array elements row by row");

	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < columns; j++) {
	        int value = sc.nextInt();
	        data[i][j] = value;
	      }
	    }

	    System.out.println("The 2d int array input from user is : ");
	    System.out.println(Arrays.deepToString(data));

	    sc.close();
	  }
	
	
 
	}


