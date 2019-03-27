package JavaPractice;

public class Practice {
	private String movie;
	
	public void setMovie(String moviename){
		movie = moviename;
	}
	public String getMovie(){
		return movie;
	}
	
	
	public void pract(int age){
		switch (age) {
		case 18:
			System.out.println("vote");
			break;
		case 25:
			System.out.println("marriage");
			break;

		default:
			System.out.println("die");
			break;
		}
	}
	public static void main(String args[]){
		Practice pt = new Practice();
		pt.pract(25);
		pt.setMovie("billa");
		pt.getMovie();
		System.out.println("movie is  "+pt.getMovie());
		
	}
	
	

}
