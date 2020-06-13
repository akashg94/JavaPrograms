package DataStructure;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		//create a collection
		
		ArrayList <String> cities = new ArrayList <String>();
		//adding emelemnts
		
		cities.add("Australia");
		cities.add("Bangladesh");
		cities.add("China");
		cities.add("Dublin");
		
		//iterate the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		//get the size
		int size = cities.size();
		System.out.println("There are "  + size + "elements in the collection");
		
		//retrive specific element
		System.out.println(cities.get(1));
		
		//remove
		cities.remove(2);
		System.out.println(cities);

	}

}
