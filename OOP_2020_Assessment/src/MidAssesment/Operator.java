package MidAssesment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operator extends User implements Calculation {
	private int OpeNumber;
	private String designation;
	
	public Operator(String name, String email, int OpeNumber, String designation) {
		super(name, email);
		this.OpeNumber = OpeNumber;
		this.designation = designation;
	}
	
	public void printDetails() {
		System.out.println("\nOperator name is : " + super.name);
		System.out.println("Operator email is : " + super.email);
		System.out.println("Operator number is : " + this.OpeNumber);
		System.out.println("Operator designation is : " + this.designation);
	}
	
	public void calculateRevenue(Artist art) {
		int downloads = 0; 
		int a = 0;
		double average = 0;
		double rev;
		
		Scanner check = new Scanner(System.in);
		

		try {
			System.out.println("\nENTER NUMBER OF DOWNLOADS : ");
			downloads = check.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Error !!Type an integer value");
		}


		
		try {
			for(a = 0; a < art.getNumberOfSongs(); a++) {
				for(int b = 1; b < 2; b++) {
					average = average + Integer.parseInt(art.song[a][b]);
				}
			}
		}
		catch (NumberFormatException e) {
			
		}
		rev = downloads * (average/a);
		
		System.out.println("Artist : " + art.name);
		System.out.println(" Songs Album revenue is LKR " + rev);
	}
}

