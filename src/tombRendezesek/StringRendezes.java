package tombRendezesek;

import java.text.Collator;

public class StringRendezes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] varosok = { "Budapest", "Debrecen", "Szeged", "Miskolc", "Pécs", "Győr", "Nyíregyháza", "Kecskemét",
				"Székesfehérvár", "Szombathely" };

		minimumkivalasztasosRendezes(varosok);

		for (String varos : varosok) {
			System.out.println(varos);
		}

	}

	private static void minimumkivalasztasosRendezes(String[] varosok) {

		Collator col = Collator.getInstance();
		int minIndex;
		for (int i = 0; i < varosok.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < varosok.length; j++) {
				if (col.compare(varosok[minIndex], varosok[j]) > 0) {
					minIndex = j;
				}
			}
			String tarolo = varosok[i];
			varosok[i] = varosok[minIndex];
			varosok[minIndex] = tarolo;
		}

	}

}
