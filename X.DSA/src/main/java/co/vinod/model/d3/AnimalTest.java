package co.vinod.model.d3;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a1;
		a1 = new Animal() {
			@Override
			public void talk() {
				System.out.println("Animal talking...");
			}
		};
		a1.talk();
	}
}
