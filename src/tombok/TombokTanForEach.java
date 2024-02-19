package tombok;

import java.util.Scanner;

public class TombokTanForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		byte[] osztalyzatok = new byte[6];

		for (int i = 0; i < osztalyzatok.length; i++) {
			System.out.println("Kerem a tanulo " + (i + 1) + ". osztalyzatat: ");
			osztalyzatok[i] = Byte.parseByte(sc.nextLine());
		}

		System.out.println("A tanuló osztályzatai: ");
		for (byte kovetkezoTombE1em : osztalyzatok) {
			System.out.print(kovetkezoTombE1em + " ");
		}

		float atlag = 0.0f;
		short osszeg = 0;

		for (byte kovetkezoTombElem : osztalyzatok) {
			osszeg += kovetkezoTombElem;
		}

		atlag = (float) osszeg / osztalyzatok.length;
		System.out.printf("A tanulo atlaga: %.2f", atlag);

		sc.close();
	}
	
}
