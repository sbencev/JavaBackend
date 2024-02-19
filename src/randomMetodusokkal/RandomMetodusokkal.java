package randomMetodusokkal;

import java.util.Random;

public class RandomMetodusokkal {

	static Random generator = new Random();

	public static void main(String[] args) {

		int[] tomb1 = tombRandomFeltotltes(5, 10, 1, 50);
		int[] tomb2 = tombRandomFeltotltes(5, 10, 1, 50);

		vezerles(tomb1);
		System.out.println();
		vezerles(tomb2);

	}

	static void vezerles(int[] tomb) {

		kilistaz(tomb);

		System.out.println("\nA tomb elemeinek osszege: " + osszegzes(tomb));

		System.out.println("Paros szamok mennyisege: " + hanyparos(tomb) + "-db.");

		System.out.println("A legnagyobb elem: " + tomb[maxKivalasztas(tomb)]);

		int elsoNegyzetIndexe = elsoNegyzetSzam(tomb);
		System.out.println((elsoNegyzetIndexe >= 0) ? "A tomb elso negyzetszama: " + tomb[elsoNegyzetIndexe]
				: "A tombben nics negyzetszam");

	}

	static int elsoNegyzetSzam(int[] tomb) {

		int i = 0;
		while ((i< tomb.length)&&(Math.sqrt(tomb[i]))%1!=0) {
			i++;
		}

		if (i < tomb.length) {
			return 1;
		} else {

			return 0;
		}

	}

	private static int maxKivalasztas(int[] tomb) {

		int max = 0;
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[max] < tomb[i]) {
				max = i;
			}
		}

		return max;
	}

	private static int[] tombRandomFeltotltes(int minElemszam, int maxElemszam, int alsoErtek, int felsoErtek) {

		int[] tomb = new int[generator.nextInt(minElemszam, maxElemszam + 1)];

		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = generator.nextInt(alsoErtek, felsoErtek);
		}

		return tomb;
	}

	static void kilistaz(int[] tomb) {

		System.out.println("A tomb elemei: ");
		for (int tombErtek : tomb) {
			System.out.println(tombErtek + " ");
		}
	}

	static int osszegzes(int[] tomb) {

		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg += tomb[i];
		}

		return osszeg;
	}

	static int hanyparos(int[] tomb) {

		int szamlalo = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				szamlalo++;
			}
		}

		return szamlalo;
	}

}
