package formazottKiiratasLokalizacio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class FormazottKiiratas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final double PI = 3.1416;
		System.out.println("Kerem adja meg a kor sugarat: ");
		
		// bevitelnel tizedesvesszo elfogadtatasa:
		double korSugara = Double.parseDouble(br.readLine().replace(',','.'));
		
		//double korSugara = Double.parseDouble(br.readLine());
		
		System.out.println("A kor terulete: "+korSugara*korSugara*PI );
		System.out.println("A kor kerulete: "+2*korSugara*PI);
		
		System.out.format("A kor terulete: %.3f es kerulete: %.2f",+(korSugara*korSugara*PI),(2*korSugara*PI));
		
		System.out.format(Locale.ROOT,"A kor terulete: %.3f%n",(PI*korSugara*korSugara));
		System.out.format(Locale.ROOT,"A kor kerulete: %.2f%n",(PI*korSugara*2));
		
	}

}
