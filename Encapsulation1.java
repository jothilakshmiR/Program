package day1.Examples; 
class EncapsulationDemo{


	private int SSN;
    private String EmpName;
    private int EmpAge;

    
    public int getEmpSSN(){
        return SSN;
    }

    public String getEmpName(){
        return EmpName;
    }

    public int getEmpAge(){
       return EmpAge;
    }

    public void setEmpAge(int newValue){
        EmpAge = newValue;
    }

    public void setEmpName(String newValue){
        EmpName = newValue;
    }
    public void setEmpSSN(int newValue){
      SSN= newValue;
    }
}
public class Encapsulation1 {
public static void main(String[] args) {
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Priya");
         obj.setEmpAge(28);
         obj.setEmpSSN(112345);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age : " + obj.getEmpAge());
         
	


	}
}
