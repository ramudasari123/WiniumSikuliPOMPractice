package JavaPractice;

public class InterfaceClass {

	interface running{
		public void abc();
		public abstract void cash();
	}
public class Extedingone implements running{

	public void abc() {
		System.out.println("its abc");
	}

	public void cash() {
		System.out.println("its cash");
	}
	
}
	public static void main(String[] args) {
		//Extedingone run  = new Extedingone();
		
	}
}