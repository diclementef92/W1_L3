package esercizi;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String frase;

		System.out.println("Scrivi frase: [esc per uscire]");
		frase = scanner.nextLine();
		while (!frase.toLowerCase().equals("esc")) {
			System.out.println("il numero di caratteri e' " + (stringaPariDispari(frase) ? "pari" : "dispari"));
			System.out.println("Scrivi frase: [esc per uscire]");
			frase = scanner.nextLine();
		}

		System.out.println("scrivi anno: ");
		int anno = scanner.nextInt();
		System.out.println((annoBisestile(anno) ? " bisestile" : " non bisestile"));

	}

	// return true se il numero di caratteri è pari, false altrimenti
	static boolean stringaPariDispari(String stringa) {
		return stringa.length() % 2 == 0;
	}

	static boolean annoBisestile(int anno) {
		if (anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0)) {
			return true;
		}
		return false;
	}

}
