package datastructureComparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListVSArrayList {

	public static void main(String[] args) {
		String[] friendsArray1 = new String[4];
		String[] friendsArray2 = { "Ashwani", "Amit", "Anupam", "Manoj" };

		ArrayList<String> friendsArrayList1 = new ArrayList<>(Arrays.asList("Ashwani", "Amit", "Anupam", " Manoj"));
		List<String> friendsArrayList2 = List.of("Ashwani", "Amit", "Anupam", "Manoj");

		System.out.println(friendsArray1);
		System.out.println(friendsArray1[1]);
		System.out.println(friendsArray2[1]);
		System.out.println(friendsArray2.length);
		
		for (String a: friendsArray2) {
			System.out.println("Iterating through the list using new for loop: "+ a);
		}
		System.out.println("+++++++++++++++++++++");

		
		for(int a=0;a<friendsArray2.length; a++) {
			System.out.println("Iterating through the list using old for loop: "+ friendsArray2[a]);

		}

		
		System.out.println(friendsArrayList1);
		System.out.println(friendsArrayList2);
		System.out.println(friendsArrayList1.get(1));
		System.out.println(friendsArrayList2.get(1));
		System.out.println(friendsArrayList1.size());
		friendsArrayList1.add("Popsi");
		System.out.println(friendsArrayList1);
		friendsArrayList1.add(1, "Prakhar");
		System.out.println(friendsArrayList1);
		//friendsArrayList2.add(1, "Prakhar");
		friendsArrayList1.remove("Ashwani");
		System.out.println(friendsArrayList1);




		


		

	}

}
