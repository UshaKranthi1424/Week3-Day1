package week3.day1;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("24 inch");

	}

	public static void main(String[] args) {
		Desktop comp = new Desktop();
		comp.computermodel();
		comp.desktopsize();

	}

}
