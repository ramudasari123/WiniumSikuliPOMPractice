package JavaPractice;

public class ArraysPractice {
	int total=0;
public void groups(){
	int names[] = new int[3];
	String name[]={"ram","RD","ramDasari"};
	names[0]= 12;
	names[1]=14;
	names[2]=12;
	System.out.println(names[1]);
	System.out.println(name[0]);
	System.out.println(names.length);
}
public void groups1(){
	int names[]= {0,12,16,17,14,7,28};
	for(int i=0;i<names.length;i++){
		System.out.println("value is \t "+names[i]);
	}
	for(int j:names){
		total+= j;
	}
	System.out.println("total is "+total);
}

public void groups2(){
	int multiarrays[][]={{1,2,5,6,3,7},{2,6,3,8,1,4},{7,2,0,9,4,3}};
	System.out.println("0 row 1 column "+multiarrays[0][1]);
	System.out.println("1 row 3 column "+multiarrays[1][3]);
	System.out.println("2 row 5 column "+multiarrays[2][5]);
}
public int groups3(int...fruits){
	int sum=0;
	for(int i:fruits){
		sum +=i;
	}
	System.out.println("sum is "+sum);
	System.out.println("fruits lenght is "+fruits.length);
	return sum;
}


	public static void main(String[] args) {
		
		ArraysPractice array = new ArraysPractice();
		array.groups();
		array.groups1();
		array.groups2();
		array.groups3(19,12,45,567,87,567,76,45,6);
	}

}
