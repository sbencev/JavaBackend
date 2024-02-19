package tombok;

import java.util.Scanner;

public class TombTanulok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		byte[] osztalyzatok = new byte[6];

		for (int i = 0; i < osztalyzatok.length; i++) {
			System.out.println("Kerem a tanulo " + (i + 1) + ". osztalyzatat: ");
			osztalyzatok[i] = Byte.parseByte(sc.nextLine());
		}

		System.out.println("A tanulo osztalyzatai:");
		for (int i = 0; i < osztalyzatok.length; i++) {
			System.out.print(osztalyzatok[i] + " ");
		}

		float atlag = 0.0f;
		short osszeg = 0;

		for (int i = 0; i < osztalyzatok.length; i++) {
			osszeg += osztalyzatok[i];
		}
		
		atlag = (float) osszeg / osztalyzatok.length;
		System.out.printf("A tanulo atlaga: %.2f",atlag);

		sc.close();
	}

}
