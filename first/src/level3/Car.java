package level3;

public class Car {
	String name;
	String color;
	int cc;

	public Car() {
		this("소나타", "흰색", 2500);
	}



	public Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다.\n"
				, name, color, cc);
	}

}
