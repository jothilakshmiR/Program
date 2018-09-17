package day1.Examples;

class Employee{
	public static int base = 10000;
	int salary()
	{
		return base;
	}
	}
class Manager extends Employee{
	int salary() {
	return	base  + 30000;
	}
	
}
class clerk extends Employee{
	int salary(){
		return base + 10000;
	}
		
	}
public class Overriding {
	static void printSalary(Employee e) {
		System.out.println(e.salary());
		
	}

public static void main(String[] args) {
Employee obj1 = new Manager();
System.out.println("Manager's salary : ");
printSalary(obj1);
Employee obj2 = new clerk();
System.out.println("clerk's salary : ");
printSalary(obj2);


	}

}
