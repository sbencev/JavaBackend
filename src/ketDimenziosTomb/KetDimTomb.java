package ketDimenziosTomb;

public class KetDimTomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ketdimenziosTomb = new int[5][3];

		int sorszam = 1;

		for (int i = 0; i < ketdimenziosTomb.length; i++) {
			for (int j = 0; j < ketdimenziosTomb[i].length; j++) {

				ketdimenziosTomb[i][j] = sorszam;
				sorszam++;
				
				/* a ciklusváltozókból is kiszámolható sorszámozás:
					* ahány soron túl vagyunk (i), annyiszor az oszlopok száma
					* plusz az aktuális sor aktuális oszlopszáma nj+l)l
					ketdimenziosTomb [i] [j]
					= (i*ketdimenziosTomb[i] . length+j+l);
				*/
				// ketdimenziosTomb[i][j]= (i*ketdimenziosTomb[i].length+j+1);

			}
		}

		System.out.println("A matrix osszes elemenek kilistazasa: ");
		for (int i = 0; i < ketdimenziosTomb.length; i++) {
			for (int j = 0; j < ketdimenziosTomb[i].length; j++) {

				System.out.print(ketdimenziosTomb[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println();

		for (int[] elem : ketdimenziosTomb) {
			for (int elem2 : elem) {
				System.out.print(elem2 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("A matrix osszes elemenek kilistazasa utolsotol elsoig: ");
		for (int i = ketdimenziosTomb.length-1; i >= 0; i--) {
			for (int j = ketdimenziosTomb[i].length-1; j >= 0; j--) {
				System.out.print(ketdimenziosTomb[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}
