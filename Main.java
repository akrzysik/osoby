public class Main {

	public static void main(String[] args) {
		Osoba jas = new Uczen("Jan", "Kowalski", "5b", 4);
		Osoba adam = new Nauczyciel("Adam", "Nowak", "matematyka", 2000);
		Osoba ktos = new Osoba("Gal", "Anonim");
		Osoba janusz = new Dyrektor("Janusz", "Woźniak", "historia", 5000, "SP 145 w Krakowie");
		jas.opis();
		System.out.println();
		adam.opis();
		System.out.println();
		ktos.opis();
		System.out.println();
    janusz.opis();
		System.out.println();
	}
}

/* Zadania:
 *  1. Dodaj kolejna klase np. Dyrektor oraz uzyj jej w podobny sposob,
 *  jak mialo to miejsce z klasami Uczen oraz Nauczyciel.
 *  2. Utworz 2 listy: nauczycieli i uczniow, podobnie jak mialo to miejsce w przykladzie
 *  z figurami.
 *  3. Uzyj w programie tych list do przechowywania obiektow.
*/

