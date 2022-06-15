package nullPointerExceptionDemo;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExceptionDemoClass {
	public static void main(String[] args) {
		// Operation with proper cat object
		Cat myCat = new Cat();
		myCat.makeNoise();

		// Operation with null object
		Cat myCat1 = null;

		// Says Cannot assign field "age" because "myCat1" is null
		// myCat1.age = 3;

		/*
		 * Says Cannot invoke "nullPointerExceptionDemo.Cat.makeNoise()" because
		 * "myCat1" is null
		 */
		// myCat1.makeNoise();

		List<Cat> cats = new ArrayList<>();
		Cat myOtherCat = new Cat();

		// Enforcing null pointer by NOT setting up the name
		// myOtherCat.setName("Lucy");
		myOtherCat.setAge(10);
		cats.add(myOtherCat);

		// null pointer check beforehand
		if (cats != null && cats.get(0) != null && cats.get(0).name != null) {
			System.out.println(getFirstCatNameLength(cats));
			System.out.println(getFirstCatAge(cats));
		}

	}

	private static int getFirstCatAge(List<Cat> cats) {
		// TODO Auto-generated method stub
		return cats.get(0).getAge();
	}

	private static int getFirstCatNameLength(List<Cat> cats) {
		// Showcasing that name is null
		System.out.println(cats.get(0).getName());
		// TODO Auto-generated method stub
		return cats.get(0).getName().length();
	}

}

// Ways to avoid null pointer
// Try to initialize objects with actual values rather than null.
// Try not to return null from a method.
