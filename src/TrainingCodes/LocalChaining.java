package TrainingCodes;

class Dog2{
	String name;
	int cost;
	String breed;
	Dog2(){
		this("Tommy");
		System.out.println("Inside cons-1");
	}
	Dog2(String name){
		this("Rocky",5000);
		System.out.println("Inside cons-2");
	}
	Dog2(String name,int cost){
		this("Snoofy",8000,"GoldenRetriever");
		System.out.println("Inside cons-3");
	}
	Dog2(String name,int cost,String breed){
		super();
		System.out.println("Inside cons-4");
	}
}

public class LocalChaining {

	public static void main(String[] args) {
		Dog2 d1=new Dog2();
	}

}
