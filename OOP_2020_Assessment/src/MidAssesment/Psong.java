package MidAssesment;



public class Psong {

	public static void main(String[] args) {
		
		//passing operator values to the constructor
		Operator op =new Operator("Simon","Simon@playsong.com",123,"accountant");
		
		
		//passing values to the Artist constructor
		Artist artist= new Artist ("Pablo Albo","pablo@gmail.com","pop",5);
	
		
		
		//calling methods in main
		artist.storeSongsDetails();
		artist.printDetails();
		op.printDetails();
		op.calculateRevenue(artist);
		
		
		
		
		
		

	}

}