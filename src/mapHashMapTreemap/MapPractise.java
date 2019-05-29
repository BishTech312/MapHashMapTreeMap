package mapHashMapTreemap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapPractise {
public static void main(String[] args) {
	
	
	Map dictionaryForEnglish = new HashMap();
	dictionaryForEnglish.put("Grammer", "Straightforawar,mnvn,vncxknlvkxcn lk c");
	dictionaryForEnglish.put("Spelling", "This section contains lots of quick " + "tips and other etc" );
	
	System.out.println(dictionaryForEnglish.get("Grammer"));
	
	System.out.println(dictionaryForEnglish.get("Spelling"));
	
	
	Map dictionary2 = new HashMap();
	
	dictionary2.put("Usage", "This section gives you lots ");
	dictionary2.putAll(dictionaryForEnglish);
	System.out.println(dictionary2.get("Spelling"));
	dictionary2.remove(dictionary2.get("Speling"));
	dictionary2.remove("Usage");
	System.out.println(dictionary2.get("Usage"));
	
	// create one map with called employee
	
	Map employee = new HashMap();
	
	employee.put("Ulan", "Account");
	employee.put("Sarah", "IT");
	employee.put("Aziya", "SIT");
	employee.put("Rus", "UAT");
	employee.put("Lee", "UX");
	employee.put("David", "IT");
	System.out.println(employee.get("Ulan"));
	
	Set <String> department =employee.keySet();
	
	for(String str : department) { // I want to print name and values who is department
		// is equals to Account
		if(employee.get(str).equals("Account")) {
			}
		System.out.println(str + " " + employee.get(str) +  " name + Department");
		}
	System.out.println(employee.entrySet()); 
	Set  entry = employee.entrySet();
	System.out.println(entry);
	
//	Set name = new HashSet();
//	name.add("Sarah =IT");
//	name.add("David= IT");
	Iterator n = entry.iterator();
	while(n.hasNext()) {
		System.out.println(n.next());
	}
	employee.clear(); // this method will clear all element inside the map.
	System.out.println(employee);
	System.out.println(employee.containsValue("Account"));// it will return true or false
	
	System.out.println("David is not available "+ employee.containsKey("David"));
	 //System.out.println(employee.get("David").equals("David"));
	System.out.println("Is empty " + employee.isEmpty()); //it will return true or false
	employee.replace("David", "IT"); // it will Replace
	System.out.println("David department is " + employee.get("David"));
	
	System.out.println(employee.values()); // it will return collection of values of employee object
	Collection cl = employee.values(); // if the return type is Collection we can assign like this
	
	
	
	
	
	
	
	
	
}


}
