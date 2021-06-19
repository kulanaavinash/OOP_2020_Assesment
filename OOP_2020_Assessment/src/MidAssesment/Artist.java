package MidAssesment;

import java.util.Scanner;

public class Artist extends User {

	private String gerner;
	private int nSongs;
	public String[][] song = new String[5][2]; 
	private boolean arrayNumberCorrect = true;
		
	public Artist(String name, String email, String gerner, int nSongs) {
		super(name, email);
		this.gerner = gerner;
		this.nSongs = nSongs;
	}
	
	public void storeSongsDetails() {
		Scanner obtain = new Scanner(System.in);
		if (this.nSongs <= 5) {
			for(int a = 0; a < this.nSongs; a++) {
				System.out.println("ENTER SONG NAME : ");
				song[a][0] = obtain.nextLine();
				for(int b = 1; b < 2; b++) {
					try {
						System.out.println("ENTER THE SONG RATE : ");
						song[a][b] = obtain.nextLine();
						int price = Integer.parseInt(song[a][b]);
					}
					catch (NumberFormatException e) {
						System.out.println("ENTER THE NUMBER FOR PRICE : ");
						song[a][b] = obtain.nextLine();
					}
				}
			}
		} else {
			System.out.println("Error!!!  You can only add 5 songs.");
		}
	}
	
	public static boolean isCorrect(String s) {
		return s.matches("[0-9]");
	}
	
	
	public void printDetails() {
		System.out.println("\n\nArtist name " + super.name);
		System.out.println("Artist email " + super.email);
		System.out.println("Artist music gerner is " + this.gerner);
		System.out.println("Number of songs is " + this.nSongs);
		System.out.println("Song list is : ");
		
		try {
			for(int a = 0; a < this.nSongs; a++) {
				for(int b = 0; b < 2; b++) {
					System.out.print(song[a][b] + "");
				}
				System.out.println("");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			
		}
	}
    //getters
	public String[][] getSong() {
		return song;
	}
	
	public int getNumberOfSongs() {
		return this.nSongs;
	}
	
}