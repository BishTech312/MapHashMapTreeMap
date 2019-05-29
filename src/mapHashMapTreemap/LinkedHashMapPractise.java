package mapHashMapTreemap;

import java.util.LinkedHashMap;
import java.util.Set;



public class LinkedHashMapPractise {

	public static void main(String[] args) {
		
		Dog bulldog = new Dog("Nora", "BullDog",1);
		Dog poddle = new Dog("Lora", "Poddle",2);
		Dog husky= new Dog("Max", "Husky",3);
		
		LinkedHashMap<Integer, Dog> dogs = new LinkedHashMap();
		dogs.put(1, bulldog);
		dogs.put(2, poddle);
		dogs.put(3, husky);
		System.out.println(dogs.get(1).getName());
		dogs.get(1).setName("Sora");
		System.out.println(dogs.get(1).getName());
		System.out.println(dogs.values()); // i will get the hash code  for the dog object with values method
		Set  <Integer> dogKeys = dogs.keySet();
		for(Integer k : dogKeys) {
			
			System.out.println("Name "+ dogs.get(k).getName());
			System.out.println("Age " + dogs.get(k).getAge());
			
		}
		
		
	}
}
