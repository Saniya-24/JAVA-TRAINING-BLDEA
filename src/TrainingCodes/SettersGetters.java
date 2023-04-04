package TrainingCodes;

class Tiger{
	private String name;
	private String color;
	private int age;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
       
	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

public class SettersGetters {

	public static void main(String[] args) {
		
		 Tiger t1 = new Tiger();
		 
		 t1.setName("Hoshi");
		 t1.setColor("white");
		 t1.setAge(27);
		 t1.setCountry("South Korea");
		 
		 System.out.println(t1.getName());
		 System.out.println(t1.getColor());
		 System.out.println(t1.getAge());
		 System.out.println(t1.getCountry());
		 
	}

}

 