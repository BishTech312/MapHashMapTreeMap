package mapHashMapTreemap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablePractise {
	
	public static void main(String[] args) {
		
		Hashtable<String,String> table = new Hashtable();
		table.put("David", "6212561562");
		table.put("Mark", "2561521621");
		table.put("Jason", "2536563625");
		
  //      we can't do like this 
 //		table.put(null, null);
//		table.put("David", null);
//		table.put(null, "David");
		
		// HashTable  is synchronized
		// we can not store null key and values
		
//		Set <String> nm = table.keySet(); // we stored to set
//		for(String k : nm) {
//			System.out.println(table.get(k));
//		}
		for(Map.Entry<String, String> i:table.entrySet()) { // another way to print out the HashTable
			System.out.println(i.getValue() + " " + i.getKey());
		}
		
	}

}
