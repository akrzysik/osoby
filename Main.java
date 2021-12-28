import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Osoba jas = new Uczen("Jan", "Kowalski", "5b", 4);
    Osoba grzes = new Uczen("Grzegorz", "Braun", "5b", 4);

		Osoba adam = new Nauczyciel("Adam", "Nowak", "matematyka", 2000);
		Osoba ktos = new Osoba("Gal", "Anonim");
		Osoba janusz = new Dyrektor("Janusz", "Woźniak", "historia", 5000, "SP 145 w Krakowie");
		
    ArrayList<Osoba> uczniowie = new ArrayList<Osoba>();
    uczniowie.add(jas);
    uczniowie.add(grzes);

    ArrayList<Osoba> nauczyciele = new ArrayList<Osoba>();
    nauczyciele.add(adam);
    nauczyciele.add(janusz);

    System.out.println("Nauczyciele");
    System.out.println();
    for(Osoba o : nauczyciele) {
			o.opis();
      System.out.println();
		}

    System.out.println("Uczniowie");
    System.out.println();
    for(Osoba o : uczniowie) {
			o.opis();
      System.out.println();
		}


	}
}

/* Zadania:
 *  1. Dodaj kolejna klase np. Dyrektor oraz uzyj jej w podobny sposob,
 *  jak mialo to miejsce z klasami Uczen oraz Nauczyciel.
 *  2. Utworz 2 listy: nauczycieli i uczniow, podobnie jak mialo to miejsce w przykladzie
 *  z figurami.
 *  3. Uzyj w programie tych list do przechowywania obiektow.
*/

