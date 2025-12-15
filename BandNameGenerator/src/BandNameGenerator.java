import java.util.Scanner;

public class BandNameGenerator {

	private String city;
	private String pet_name;
	
	public void setCity(String user_value) {
		this.city = user_value;
	}
	
	public String getCity() {
		return this.city; 
	}
	
	public void setPetName(String user_value) {	
		this.pet_name = user_value;	
	}
	
	public String getPetName() {
		return this.pet_name;
	}
	
	public String generateBandName() {
		return this.city + " " + this.pet_name;
	}
		
	public static void main(String args[]) {
		
		BandNameGenerator band_name = new BandNameGenerator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome to the 'Band Name Generator' Tool!\n");
		
		System.out.print("What is the name of the city you grew up in?\n");
		band_name.setCity(scanner.nextLine().trim());
		
		System.out.print("What's the name of your pet?\n");
		band_name.setPetName(scanner.nextLine().trim());
		
		scanner.close();
		
		System.out.printf("Your band name could be: %s\n", band_name.generateBandName());
	}
	
}

