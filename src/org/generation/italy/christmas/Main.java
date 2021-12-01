package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> wishList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		boolean operazioneIncorso = false;
		String sceltaUtenteNegativa = "n";
		String sceltaUtentePositiva = "s";
		String sceltaUtente;

		do {
			System.out.println("Aggiungi elemento alla lista dei desideri:");
			wishList.add(scanner.nextLine());
			System.out.println("La tua lista contiene " + wishList.size() + " desideri/o.");
			System.out.println("Continuare? (s/n)");
			sceltaUtente = scanner.nextLine().toLowerCase();
			if (sceltaUtente.equals(sceltaUtenteNegativa)) {
				operazioneIncorso = true;
			} else if (sceltaUtente.equals(sceltaUtentePositiva)) {

			} else {
				System.out.println("Attenzione, inserire un valore valido.");
			}

		} while (operazioneIncorso == false);

		System.out.println("Ecco la tua lista:");

		for (int i = 0; i < wishList.size(); i++) {
			System.out.println(wishList.get(i));
		}

		scanner.close();
	}

}
