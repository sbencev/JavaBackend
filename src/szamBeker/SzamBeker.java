package szamBeker;

import java.util.Scanner;

public class SzamBeker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Kerek egy egesz szamot: ");
		
		int szam = Integer.parseInt(sc.nextLine());
		
		if (szam < 10 && szam > -10) {
			
			System.out.println("A szam egyjegyu");
			
		}
		else {
			
			System.out.println("A szam nem egyjegyu");

		}
		sc.close();
		
	}

}
