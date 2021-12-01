package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

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

		Collections.sort(wishList);
//		System.out.println("ecco la tua lista " + wishList);

		System.out.print("Inserisci il nome: ");
		String nome = scanner.nextLine();
		System.out.println("Inserici l'indirizzo: ");
		String indirizzo = scanner.nextLine();
		LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, wishList);
		try {
			System.out.println(lettera.invia());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}

}
