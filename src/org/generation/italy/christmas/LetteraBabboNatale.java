package org.generation.italy.christmas;

import java.util.List;

public class LetteraBabboNatale {

	// Attributi
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;

	// Costruttore
	public LetteraBabboNatale(String nome, String indirizzo, List<String> wishList) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = wishList;
	}

	// Metodi
	public String invia() throws Exception {
		if (listaDesideri.size() <= 5) {
			return nome + ", " + indirizzo + ", " + listaDesideri;
		} else {
			throw new Exception();
		}
	}

}
