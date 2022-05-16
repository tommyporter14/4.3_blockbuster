import java.util.ArrayList;

public abstract class Movie {
	
	//fields
	private String title;
	private int runTime;
	protected ArrayList<String> scenes;
	
	//getters/setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	//methods
	public void printInfo() {
		System.out.println("Title: " + title);
		System.out.println("Run Time: " + runTime);
	}
	
	public void printScenes() {
		for (String scene : scenes) {
			System.out.println("Scene " + (scenes.indexOf(scene)+1) + ": " + scene);
		}
	}
	
	public abstract void play();
}
