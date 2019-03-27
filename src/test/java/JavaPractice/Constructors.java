package JavaPractice;

public class Constructors {
private String name;
	public Constructors(String person){
		name = person;
	}
	public String getName(){
		return name;
	}
	public void naming(){
		System.out.println("name is "+getName());
		System.out.println(getName()=="ram"?"True":"False");
	}
	
	
	public static void main(String[] args) {
		Constructors ct = new Constructors("ram");
		ct.naming();
	}

}
