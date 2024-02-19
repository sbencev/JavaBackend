package fajlKezeles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Nevsor {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		char valasztottMenupont;
		String[] nevsor = new String[10];

		do {
			kepernyoTorles();
			System.out.println("Valasszon az alabbi menupontok kozul: ");
			System.out.println("1. Adatok bekerese konzolrol");
			System.out.println("2. Adatok beolvasasa fajlbol");
			System.out.println("3. Nevsor listazasa");
			System.out.println("4. Adatok kiirasa fajlba");
			System.out.println("5. Kilepes");
			valasztottMenupont = sc.nextLine().charAt(0);

			switch (valasztottMenupont) {
			case '1':
				manualisBekeres(nevsor);
				break;
			case '2':
				fajlBeolvasas(nevsor, "nevsor.txt");
				break;
			case '3':
				nevsorLista(nevsor);
				break;
			case '4':
				adatKiiras(nevsor, "nevsor.txt");
				break;
			}
		} while (valasztottMenupont != '5');

		sc.close();

	}

	private static void kepernyoTorles() throws InterruptedException, IOException {
		
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		
	}

	private static void adatKiiras(String[] nevsor, String fajlnev) throws IOException {
		
		FileOutputStream fs = new FileOutputStream(fajlnev,true); // fs --> adatfolyam
		OutputStreamWriter out = new OutputStreamWriter(fs,"UTF-8"); // out --> irofolyam
		
		for(String nev : nevsor){
			out.write(nev+"\n");
		}
		
		out.close();
		fs.close();
		
	}

	private static void nevsorLista(String[] nevsor) {

		for (String nev : nevsor) {
			System.out.println(nev);
		}

	}

	private static void fajlBeolvasas(String[] nevsor, String fajlnev) throws IOException {

		File f = new File(fajlnev);
		if (f.exists() && !f.isDirectory()) {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"));
			int sorok = 0;
			while (br.ready() && sorok < nevsor.length) {
				nevsor[sorok] = br.readLine();
				sorok++;
				br.close();
			}
		} else {
			System.out.println("Nincs ilyen nevu fajl");
		}
		
	}

	private static void manualisBekeres(String[] nevsor) {

		for (int i = 0; i < nevsor.length; i++) {
			System.out.println("Kerem a " + (i + 1) + ". nevet: ");
			nevsor[i] = sc.nextLine();
		}

	}

}
