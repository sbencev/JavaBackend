package rekurzio;

public class LottoRekurziv {

	public static void main(String[] args) {

		System.out.println(lottoVariacioRekurzivan(1, 90, 1, 5));
		System.out.println(lottoVariacioRekurzivan(1, 45, 1, 6));
		System.out.println(lottoVariacioRekurzivan(1, 35, 1, 7));

	}

	private static long lottoVariacioRekurzivan(int aktualisErtek, int maxErtek, int aktualisSzam, int maxHuzhatoSzam) {

		long mindosszesen = 0;
		while (aktualisErtek <= (maxErtek - maxHuzhatoSzam) + aktualisSzam) {

			if (aktualisSzam < maxHuzhatoSzam) {
				mindosszesen += lottoVariacioRekurzivan(aktualisErtek + 1, maxErtek, aktualisSzam + 1, maxHuzhatoSzam);
			}
			else {
				mindosszesen++;
			}
			aktualisErtek++;
		}
		return mindosszesen;
	}

}
