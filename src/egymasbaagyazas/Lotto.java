package egymasbaagyazas;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long osszesSzelveny = 0;
		int legkisebbNagyobb70 = 0;
		int egymasMelletti = 0;
		for (int i = 1; i <= 86; i++) {
			for (int j = i+1; j <= 87; j++) {
				for (int k = j+1; k <= 88; k++) {
					for (int m = k+1; m <= 89; m++) {
						for (int n = m+1; n <= 90; n++) {
							osszesSzelveny++;
							if (i > 70) {
								legkisebbNagyobb70++;
							}
							if(i+4==n) {
								egymasMelletti++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(osszesSzelveny);
		System.out.println(legkisebbNagyobb70);
		System.out.println(egymasMelletti);

	}

}
