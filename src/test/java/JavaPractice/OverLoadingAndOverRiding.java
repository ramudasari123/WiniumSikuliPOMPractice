package JavaPractice;

public class OverLoadingAndOverRiding {
	public void overload(int a, int b){
		int fst = a;
		int snd = b;
		int sum= fst+snd;
		System.out.println("sum is "+sum);
	}
	public void overload(double a, int b){
		double fst = a;
		int snd = b;
		double sum= fst+snd;
		System.out.println("double sum is "+sum);
	}
	public static void main (String args[]) {
		OverLoadingAndOverRiding overload = new OverLoadingAndOverRiding();
		overload.overload(2, 4);
		overload.overload(2.3, 6);

	}

}
