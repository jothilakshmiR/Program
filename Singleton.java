package day1.Examples;

public class Singleton {
private static Singleton myobj;
private Singleton() {
	
}
public static Singleton getInstance() {
	if(myobj == null) {
		myobj = new Singleton();
	}
	return myobj;
	
}
public void getSomeThing() {
	System.out.println(" I am  Priya...");
	
}
	public static void main(String[] args) {
		Singleton st =Singleton.getInstance();
		st.getSomeThing();
		

	}

}
