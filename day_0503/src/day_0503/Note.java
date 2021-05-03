package day_0503;

class test implements Runnable {
	@Override
	public void run() {
		System.out.println("test");

	}
}

public class Note {

	public static void main(String[] args) {

		new Runnable() {
			public void run() {
				System.out.println("test");

			}
		};
		
		test t = new test();
		t.run();

	}

}
