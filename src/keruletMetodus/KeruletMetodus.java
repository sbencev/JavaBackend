package keruletMetodus;

public class KeruletMetodus {

	public static void main(String[] args) {
	
		System.out.println("Kerulet: "+ keruletSzamitas(5,8));
		System.out.println("Kerulet: "+ keruletSzamitas(6));
		System.out.println("Kerulet: "+ keruletSzamitas(5,8,7));

	}

	static double keruletSzamitas(double a) {

		return 4 * a;

	}

	static double keruletSzamitas(double a, double b) {

		return 2 * (a + b);

	}

	static double keruletSzamitas(double a, double b, double c) {

		return a + b + c;

	}

}
