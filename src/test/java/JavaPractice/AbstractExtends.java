package JavaPractice;

public class AbstractExtends extends AbstractPractice{

	@Override
	public void dog() {
		System.out.println("dog will bark");
		
	}
public static void main(String[] args) {
	AbstractExtends abstracting = new AbstractExtends();
	abstracting.dog();
	}
}
