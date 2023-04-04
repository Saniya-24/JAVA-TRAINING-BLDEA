package TrainingCodes;

class Cat {
	private String name;
	private String color;
	private int cost;

	void setData(String name, String color, int cost) {
		this.name = name;
		this.color = color;
	    this.cost = cost;
	}

	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
	}
}

public class Program27 {
	public static void main(String[] args) {
		Cat d1 = new Cat();
		d1.setData("Jimmy", "Black", 7000);
		d1.getData();
	}

}
