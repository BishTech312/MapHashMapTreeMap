package mapHashMapTreemap;

public class Cat {
	
	private int age;
	private String name;
	private String kind;
	
	public Cat(String name ,String kind , int age) {
		
		this.name =name;
		this.age =age;
		this.kind =kind;
		}
	
	public void move(String direction ) {
		System.out.println(name + " Going to kitchen");
		
		
	}
	
	public void healthControl() {
		if(age <=2  && age < 4) {
			System.out.println(name + " " + "go to vet");
		
		}else if (age > 4) {
			System.out.println(name + " " + " take Aspirin ");
		}
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public boolean isOlder() {
		if(age * 12 > 60) {
			return true;
		}else 
		      return false;
		
		}
		  
			
		
	}

	


