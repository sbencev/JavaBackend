package teruletKerulet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Kérje be a konzolról egy téglalap két oldalának méretét.
Írja ki a képernyőre a téglalap kerületét és területét.
Formázza a kiírandó eredményt.
 */

public class TeruletKeruletMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adja meg a teglalap egyik oldalat: ");
		int teglalapEgyikOldala = Integer.parseInt(sc.nextLine());
		
		System.out.println("Adja meg a teglalap masik oldalat: ");
		int teglalapMasikOldala = Integer.parseInt(sc.nextLine());
		
		System.out.println("A teglalap terulete: "+teglalapEgyikOldala*teglalapMasikOldala);
		
		System.out.println("A teglalap kerulete: "+(teglalapEgyikOldala+teglalapMasikOldala)*2);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final double PI = 3.1416;
		System.out.println("Kerem adja meg a kor sugarat: ");
		
		double korSugara = Double.parseDouble(br.readLine());
		
		System.out.println("A kor terulete: "+korSugara*korSugara*PI );
		System.out.println("A kor kerulete: "+2*korSugara*PI);
		
		System.out.format("A kor terulete: %.3f es kerulete: %.2f",+(korSugara*korSugara*PI),(2*korSugara*PI));
		
		@SuppressWarnings("unused")
		float ezisTortszam = 3.14f; // ki kell tenni a float jelolojet 'f', mert alapbol double a tortszam tipusa
		
		sc.close();
		
	}

}
