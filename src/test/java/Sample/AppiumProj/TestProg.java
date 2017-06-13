package Sample.AppiumProj;

public class TestProg {

	public void testing(int a, int b){
		for(int x=a;x>=0;x--){
			if(a%x==0 && b%x==0){
				System.out.println("ddd "+x);
				System.out.println("aaaaaaaaaa");
			}
		}
		//return 1;
	}
	
	public static void main(String[] args) {
		TestProg test = new TestProg();
		test.testing(5, 5);
	}

}
