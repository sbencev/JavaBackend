package tulToltes;

public class TulToltes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A terulet: " + teruletSzamitas(7));
		System.out.println("A terulet: " + teruletSzamitas(5, 6));
		System.out.println("A terulet: " + teruletSzamitas(3.8,true));
		System.out.println("A terulet: " + teruletSzamitas(5, 6,true));

	}

	public static double teruletSzamitas(double negyzetOldala) {

		return negyzetOldala * negyzetOldala;

	}

	/**
	 * Teglalap teruletenek kiszamolasa
	 * 
	 * @param teglalapAoldal
	 * @param teglalapBoldal
	 * @return terulet
	 */
	public static double teruletSzamitas(double teglalapAoldal, double teglalapBoldal) {

		return teglalapAoldal * teglalapBoldal;

	}

	public static double teruletSzamitas(double sugar, boolean ezEgykor) {

		if (ezEgykor) {
			return sugar * sugar * Math.PI;
		}
		return 0.0;
	}
	
	public static double teruletSzamitas(double aOldal, double magassag, boolean ezEgyharomszog) {
		
		if(ezEgyharomszog) {
			return (aOldal*magassag);
		}
		return 0.0;
		
	}

}
