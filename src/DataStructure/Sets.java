package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		//define the collection
		
		Set <String> animals = new HashSet<String>();
		
		//adding element
		
		animals.add("dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("snake");
		animals.add("hog");
		
		//printing the elements
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("dog");
		animals.add("Cat");
		animals.add("groose");
		animals.add("hog");
		
		System.out.println(animals.size() + " " + animals);
		
		
		
		//create a new set that we use for coparison
		
		Set <String> farmanimal = new HashSet<String>();
		
		farmanimal.add("chicken");
		farmanimal.add("cow");
		farmanimal.add("horse");
		farmanimal.add("dog");
		
		//intersection set
		
		Set<String> intersectionSet = new HashSet<String>(animals);
		intersectionSet.retainAll(farmanimal);
		System.out.println("The intersection is : " + intersectionSet);
		
		//union sets
		Set<String> unionSet = new HashSet<String>(farmanimal);
		
		unionSet.addAll(animals);
		System.out.println("The union is " + unionSet);
		
			

	}

}
