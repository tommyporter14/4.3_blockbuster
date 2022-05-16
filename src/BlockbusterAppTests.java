import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BlockbusterAppTests {

	@Test
	void testDVDTitle() {
		DVD dvd = new DVD("Star Wars: A New Hope", 121);
		String expected = "Star Wars: A New Hope";
		String actual = dvd.getTitle();
		assertEquals(expected, actual);
	}
	

	@Test
	void testDVDRunTime() {
		DVD dvd = new DVD("Star Wars: A New Hope", 121);
		int expected = 121;
		int actual = dvd.getRunTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSTitle() {
		VHS vhs = new VHS("Star Wars: A New Hope", 121);
		String expected = "Star Wars: A New Hope";
		String actual = vhs.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSRunTime() {
		VHS vhs = new VHS("Star Wars: A New Hope", 121);
		int expected = 121;
		int actual = vhs.getRunTime();
		assertEquals(expected, actual);
	}
	

	@Test
	void testVHSCurrentTime() {
		VHS vhs = new VHS("Star Wars: A New Hope", 121);
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSPlay() {
		VHS vhs = new VHS("Star Wars: A New Hope", 121);
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("R2’s Mission");
		scenes.add("Meeting Old Ben");
		scenes.add("Rescuing the Princess");
		scenes.add("Use the Force, Luke");
		vhs.setScenes(scenes);
		vhs.play();
		int expected = 1;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSRewind() {
		VHS vhs = new VHS("Star Wars: A New Hope", 121);
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("R2’s Mission");
		scenes.add("Meeting Old Ben");
		scenes.add("Rescuing the Princess");
		scenes.add("Use the Force, Luke");
		vhs.setScenes(scenes);
		vhs.play();
		vhs.play();
		vhs.rewind();
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
}
