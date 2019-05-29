package mapHashMapTreemap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapPractise {
	public static void main(String[] args) {
		
		
		Cat russionBlue = new Cat("Kitty","RussionBlue",3);
		Cat scottish = new Cat("Lucy","Scottish",4);
		Cat persion = new Cat("Bella","Persion",5);
		
		TreeMap number = new TreeMap();
		number.put("David", 20);
		number.put("Mykola", 35);
		number.put("Lisa", 33);
		
		System.out.println(number.values());
		TreeMap <String,Cat> cats = new TreeMap();
		cats.put("Russion", russionBlue);
		cats.put("Scottish",scottish);
		cats.put("Persion", persion);
		
		Set <String>catkey = cats.keySet();
		
		for(String str : catkey) {
			if(cats.get(str).getName().startsWith("L")) {
				System.out.println(" it will print out the name started L  is ===> "+ cats.get(str).getName());
			}
			System.out.println(cats.get(str).getName());
		}
		
	}

}
