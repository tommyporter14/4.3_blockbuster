import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{

	//constructors
	public DVD(String title, int runTime) {
		setTitle(title);
		setRunTime(runTime);
	}
	
	//method override
	@Override 
	public void play() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> movieScenes = super.getScenes();
		System.out.println("What scene would you like to watch?");
		super.printScenes();
		int userChoice = scnr.nextInt();
		if (userChoice >= 1 && userChoice<= (movieScenes.size())) {
			System.out.println("Scene " + userChoice + ": " + movieScenes.get(userChoice-1));
		}
		else {
			System.out.println("Not a valid choice");
		}
	}
}
