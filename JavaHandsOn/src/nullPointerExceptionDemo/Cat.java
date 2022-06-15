package nullPointerExceptionDemo;

public class Cat {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("Meaow");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
