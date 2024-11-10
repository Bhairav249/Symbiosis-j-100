package hasAInheritance;

interface Player1 {

	public void start();

	public void pouse();

	public void stop();
}

interface MusicPlayer extends Player1 {
	default public void next() {
		System.out.println("Next From Music Player");

	}
}

class SmartPhone1 implements MusicPlayer {
	public void start() {
		System.out.println("Start");

	}

	public void stop() {
		System.out.println("Stop");

	}

	public void pouse() {
		System.out.println("pouse");

	}
}

public class Player {
	public static void mian(String[] args) {
		SmartPhone1 sm = new SmartPhone1();
		sm.start();

	}
}
