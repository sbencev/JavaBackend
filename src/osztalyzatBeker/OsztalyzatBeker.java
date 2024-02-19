package osztalyzatBeker;

import java.util.Scanner;

public class OsztalyzatBeker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg az osztalyzatot: ");

		int osztalyzat = Integer.parseInt(sc.nextLine());

		switch (osztalyzat) {

		case 1:
			System.out.println("elegtelen");
			break;
		case 2:
			System.out.println("elegseges");
			break;
		case 3:
			System.out.println("kozepes");
			break;
		case 4:
			System.out.println("jo");
			break;
		case 5:
			System.out.println("jeles");
			break;
		default:
			System.out.println("Nem megfelelo osztalyzat");
			break;
		}

		System.out.println("Adja meg a het hanyadik napja van (1-7)");

		int hanyadikNap = Integer.parseInt(sc.nextLine());

		switch (hanyadikNap) {

		case 1:
		case 2:
			System.out.println("Het eleje van");
			break;
		case 3:
		case 4:
			System.out.println("Het kozepe van");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("Hetvege");
			break;
		}

		// Ctrl-Shift-F formazza a forraskodot
		System.out.println("Irja be szovegesen a het melyik napja van ");
		String egyNapjaAHetnek = sc.nextLine();

		switch (egyNapjaAHetnek) {
		case "hetfo":
			System.out.println("A het elso napja");
			break;
		case "kedd":
			System.out.println("A het masodik napja");
			break;
		}
		sc.close();
	}

}
