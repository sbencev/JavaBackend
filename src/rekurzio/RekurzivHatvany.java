package rekurzio;

import java.util.Scanner;

public class RekurzivHatvany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a hatvanyozando szamot(alap): ");

		double alap = Double.parseDouble(sc.nextLine());

		System.out.println("Adja meg a kitevot: ");
		int kitevo = Integer.parseInt(sc.nextLine());

		System.out.println(hatvanyozasCiklussal(alap, kitevo));
		System.out.println(hatvanyozasRekurzioval(alap, kitevo));
		
		sc.close();

	}

	private static double hatvanyozasCiklussal(double alap, int kitevo) {

		double eredmeny = 1;
		for (int i = 1; i <= kitevo; i++) {
			eredmeny *= alap;
		}
		return eredmeny;

	}

	private static double hatvanyozasRekurzioval(double alap, int kitevo) {

		if (kitevo == 0) {
			return 1;
		}
		return alap * hatvanyozasRekurzioval(alap, kitevo - 1);

	}

}
