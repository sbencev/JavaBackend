package adatbekeresKiiras;

import java.util.Scanner;

/*
 Kérje be a felhasználó vezetéknevét, majd új sorban a keresztnevét.
Írja ki a képernyőre egy sorban a felhasználó teljes nevét.
Használjon vezérlőkaraktereket a ki íratás során.
 */

public class AdatbekeresKiiras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kerem adja meg a vezeteknevet: ");
		String vezetekNev = sc.nextLine();
		
		System.out.println("Kerem adja meg a keresztnevet: ");
		String keresztNev = sc.nextLine();
		
		System.out.println("Az on teljes neve: "+vezetekNev+" "+keresztNev);
		
		sc.close();
		
	}
	
}
