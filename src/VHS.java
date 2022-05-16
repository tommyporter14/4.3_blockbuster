import java.util.ArrayList;

public class VHS extends Movie{

	//fields
	private int currentTime;

	//getter/setter
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	//Constructors
	public VHS() {
	}
	
	public VHS(String title, int runTime) {
		setTitle(title);
		setRunTime(runTime);
	}
	
	//methods
	@Override
	public void play() {
		if(currentTime >= scenes.size()) {
			System.out.println("You've reached the end of the tape, starting rewind.");
			rewind();
		}
		else {
			System.out.println("Scene " + (currentTime +1) + ": " + scenes.get(currentTime));
			currentTime++;
		}
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
}
