package day1.Examples;
class Adder{
	static int add(int a,int b) {
		return a+b;
		
	}
	static double add(double a,double b) {
		return a+b;
	}
	

public class Overloading {

	public void main(String[] args) {
	System.out.println(Adder.add(12,12));
System.out.println(Adder.add(13.6, 13.8));

	}

}
}
