package day1.Examples;
class Animal{
	void eat() {
		System.out.println("eating....");
		
	}
}
	class dog extends Animal{
		void bark() {
			System.out.println("barking...");
		}
	}
	class frogs extends Animal{
			void croak() {
				System.out.println("croaking...");
			}
		}
			class cats extends Animal{
				void mew() {
					System.out.println("mew...");
					
				}
			}
				class babydog extends dog{
					void weep() {
						System.out.println("weeping...");
					}
			}
		
public class Inheritance {

	public static void main(String[] args) {
	babydog d = new babydog();
	d.weep();
	d.bark();
	d.eat();
	

	}

}
