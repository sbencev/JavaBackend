package azonositoGen;

import java.util.Scanner;

public class AzonositoGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String vezetekNev;
		String keresztNev;
		String azonosito;
		String teljesNev;
		int eSzamlalo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Kerem adja meg a vezeteknevet: ");
		vezetekNev = sc.nextLine();

		System.out.println("Kerem adja meg a keresztnevet: ");
		keresztNev = sc.nextLine();

		azonosito = vezetekNev.substring(0,Math.min(3, vezetekNev.length()));

		azonosito = azonosito + keresztNev.substring(0,Math.min(3, vezetekNev.length()));

		azonosito = azonosito.toLowerCase();
		
		teljesNev = vezetekNev +" "+ keresztNev;

		for (int i = 0; i < teljesNev.length(); i++) {

			if (Character.toLowerCase(teljesNev.charAt(i)) == 'e') {

				eSzamlalo++;
			}
		}
		
		azonosito += Integer.toString(eSzamlalo);

		System.out.println(teljesNev);
		
		System.out.println(azonosito);
		
		sc.close();
	}

}
