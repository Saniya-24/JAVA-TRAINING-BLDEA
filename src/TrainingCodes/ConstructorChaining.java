package TrainingCodes;

class Animal extends Object{
	Animal(){
		super();
		System.out.println("Inside Zero-Parameterized Constructor");
	}
	Animal(int a){
		super();
		System.out.println("Inside Parameterized Constructor");
	}
}
class Rabbit extends Animal{
	Rabbit(){
		super();
	}
	Rabbit(int a){
		super(10);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		Rabbit d1=new Rabbit();
		Rabbit d2=new Rabbit(10);

	}

}
