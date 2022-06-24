package DuplicateWordsCSV;

import java.io.File; // rappresenta il file
import java.io.FileNotFoundException; // rappresenta l'errore di file non trovato
import java.util.HashSet;
import java.util.Scanner; // rappresenta il "lettore" del file
import java.util.Set;

public class FileReader {

	public class ReadFromFile {

		public static void main(String[] args) {
			try {
				String dir = "C:\\Users\\Simone\\Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Esercitazioni 24-06\\src\\DuplicateWordsCSV\\FileCSV.csv";
				File file = new File(dir);// definisci percorso del file
				Scanner fileReader = new Scanner(file); // apri il file

//				ArrayList<String> lines = new ArrayList<String>();
				Set<String> lines = new HashSet<String>();

				while (fileReader.hasNextLine()) { // fino a che ci sono righe da leggere
					String line = fileReader.nextLine(); // leggi riga
					lines.add(line); //Inserisco ogni singola linea in un array vuoto precedentemente dichiarato
					System.out.println(line);// stampa riga
				}
				System.out.println("");
				System.out.print("-- Array di linee Senza duplicati: -- \n");
				System.out.println(lines.toString());

				System.out.println("");
				System.out.print("-- Nuove linee: -- \n");
				for (String stringline : lines) {
					System.out.println(stringline);
				}

				fileReader.close(); // chiudi il file
			} catch (FileNotFoundException e) { // in caso di errore
				System.out.println("Cannot find file."); // stampa l'errore
				e.printStackTrace();
			}
		}

	}
}