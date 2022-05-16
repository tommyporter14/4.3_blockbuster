import java.util.ArrayList;
import java.util.Scanner;

public class BlockbusterApp {

	public static void main(String[] args) {
	
		//scanner
		Scanner scnr = new Scanner(System.in);
		
		//array lists for movies and scenes
		ArrayList<Movie> movies = new ArrayList <>();
		movies.add(new VHS("Star Wars: A New Hope", 121));
		movies.add(new VHS("Indiana Jones: Raiders Of The Lost Ark", 105));
		movies.add(new VHS("The Lord of the Rings: The Fellowship of the Ring", 178));
		movies.add(new DVD("Harry Potter and the Sorcerer's Stone", 153));
		movies.add(new DVD("Iron Man", 126));
		movies.add(new DVD("School of Rock", 109));
		
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		movies.get(0).setScenes(movieScenes1);
		
		ArrayList<String> movieScenes2 = new ArrayList<>();
		movieScenes2.add("At the school");
		movieScenes2.add("Trip to Nepal");
		movieScenes2.add("Meeting Sallah in Egypt");
		movieScenes2.add("Opening of the Ark");
		movies.get(1).setScenes(movieScenes2);
		
		ArrayList<String> movieScenes3 = new ArrayList<>();
		movieScenes3.add("The Shire");
		movieScenes3.add("Leaving for  Rivendell");
		movieScenes3.add("Fellowship meeting");
		movieScenes3.add("Frodo leaving for Mordor");
		movies.get(2).setScenes(movieScenes3);
		
		ArrayList<String> movieScenes4 = new ArrayList<>();
		movieScenes4.add("Baby Harry");
		movieScenes4.add("You're a wizard");
		movieScenes4.add("Hogwarts");
		movieScenes4.add("Fight with Quirrell/Voldemort");
		movies.get(3).setScenes(movieScenes4);
		
		ArrayList<String> movieScenes5 = new ArrayList<>();
		movieScenes5.add("Stark Industries");
		movieScenes5.add("Arc Reactor");
		movieScenes5.add("Fight with Stane");
		movieScenes5.add("S.H.I.E.L.D");
		movies.get(4).setScenes(movieScenes5);
		
		ArrayList<String> movieScenes6 = new ArrayList<>();
		movieScenes6.add("Dewey kicked out of band");
		movieScenes6.add("Taking Ned's persona");
		movieScenes6.add("Teaching rock to kids");
		movieScenes6.add("Battle of the bands");
		movies.get(5).setScenes(movieScenes6);
		
		//prompt and print moveis
		System.out.println("Welcome to my Blockbuster App");
		System.out.println("Which movie would you like to watch from the list below (enter 1-6)?:");
		for (Movie movie : movies) {
			System.out.println((movies.indexOf(movie) + 1) + ". " + movie.getTitle());
		}
		
		//get user choice
		int movieChoice = scnr.nextInt();
		movies.get(movieChoice - 1).printInfo();
		
		
		//go through scenes
		scnr.nextLine();
		System.out.println("Do you want to watch this movie (Y/N)?:");
		String userYn = scnr.nextLine();
		boolean Yn = true;
		while(Yn) {	
			if (userYn.equalsIgnoreCase("Y")) {
				movies.get(movieChoice -1).play();
				System.out.println("Watch another scene?");
				userYn = scnr.next();
			}
			else if (userYn.equalsIgnoreCase("N")) {
				Yn = false;
			}
			else {
				System.out.println("Not a valid choice, try again:");
				userYn = scnr.nextLine();
			}
		}
		
		System.out.println("Goodbye!");
		scnr.close();
	}

}
