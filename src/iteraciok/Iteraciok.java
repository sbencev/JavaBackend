package iteraciok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iteraciok {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//a;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//b;
		
		System.out.println();
		
		int i = 100;
		while (i % 16 != 0) {
			System.out.println(i);
			i += 3;
		}
		
		//c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int szam;
		do {
			System.out.println("Irjon be egy egesz szamot: ");
			szam = Integer.parseInt(br.readLine());
		} while (szam %2 != 0);
		
		br.close();

	}

}
