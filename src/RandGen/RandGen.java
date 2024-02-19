package RandGen;

import java.util.Random;

public class RandGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();

		int[] tomb1 = new int[generator.nextInt(5, 11)];

		int[] tomb2 = new int[generator.nextInt(5, 11)];

		for (int i = 0; i < tomb1.length; i++) {
			tomb1[i] = generator.nextInt(1, 51);
		}

		for (int i = 0; i < tomb2.length; i++) {
			tomb2[i] = generator.nextInt(1, 51);
		}

		System.out.println("A tomb elemei: ");
		for (int i : tomb1) {
			System.out.println(i + " ");
		}


		int osszeg1 = 0;
		for (int i = 0; i < tomb1.length; i++) {
			osszeg1 += tomb1[i];
		}

		System.out.println("\nA tomb elemeinek osszege: " + osszeg1);

		int szamlalo1 = 0;
		for (int i = 0; i < tomb1.length; i++) {
			if (tomb1[i] % 2 == 0) {
				szamlalo1++;
			}
		}

		System.out.println("Paros szamok mennyisege: " + szamlalo1 + "-db.");

		int max = 0;
		for (int i = 1; i < tomb1.length; i++) {
			if (tomb1[max] < tomb1[i]) {
				max = i;
			}
		}

		System.out.println("A legnagyobb elem: " + tomb1[max]);

		int i = 0;
		while ((i< tomb1.length)&&(Math.sqrt(tomb1[i]))%1!=0) {
			i++;
		}
		if(i< tomb1.length) {
			System.out.println("A tomb elso negyzetszama: "+tomb1[i]);
		}
		else {
			System.out.println("A tombben nincs negyzetszam.");
		}
		
		//2.
		
		System.out.println("\nA tomb elemei: ");
		for (int i2 : tomb2) {
			System.out.println(i2 + " ");
		}


		int osszeg2 = 0;
		for (int i2 = 0; i2 < tomb2.length; i2++) {
			osszeg2 += tomb2[i];
		}

		System.out.println("\nA tomb elemeinek osszege: " + osszeg2);

		int szamlalo2 = 0;
		for (int i2 = 0; i2 < tomb2.length; i2++) {
			if (tomb2[i] % 2 == 0) {
				szamlalo2++;
			}
		}

		System.out.println("Paros szamok mennyisege: " + szamlalo2 + "-db.");

		int max2 = 0;
		for (int i2 = 1; i2 < tomb2.length; i2++) {
			if (tomb2[max2] < tomb2[i]) {
				max2 = i2;
			}
		}

		System.out.println("A legnagyobb elem: " + tomb2[max]);

		int i2 = 0;
		while ((i2< tomb2.length)&&(Math.sqrt(tomb2[i2]))%1!=0) {
			i2++;
		}
		if(i2< tomb2.length) {
			System.out.println("A tomb elso negyzetszama: "+tomb2[i2]);
		}
		else {
			System.out.println("A tombben nincs negyzetszam.");
		}

	}

}
