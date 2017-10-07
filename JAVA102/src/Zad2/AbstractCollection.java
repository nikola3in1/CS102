package Zad2;

/**
 * Interface AbstractCollection nudi osnovne metode za manipulaciju kolekcijama.
 * Potrebno je da klase koje ga implementiraju imaju genericki niz kao atribut u
 * kom ce se skladistiti elementi kolekcije.
 */
public interface AbstractCollection {
    /**
     * Metoda koja dodaje novi element niza na kraj kolekcije.
     */
    public <T> void add(T newItem);
    /**
     * Metoda koja vraca element niza koji se nalazi na prosledjenom index-u u
     * kolekciji.
     *
     * @parametar index - predstavlja redni broj elementa koji metoda treba da
     * vrati (krece se od 0-tog index-a)
     */
    public <T> T get(int index);
    /**
     * Metoda koja uklanja element niza koji se nalazi na prosledjenom index-u u
     * kolekciji. Ukoliko element na tom indeksu ne postoji metoda treba da vrati null.
     *
     * @parametar index - predstavlja redni broj elementa koji metoda treba da
     * ukloni (krece se od 0-tog index-a)
     */
    public void remove(int index);
    /**
     * Metoda koja pravi nasumican raspored elemenata u kolekciji.
     */
    public void shuffle();
    /**
     * Metoda koja uklanja sve elemente iz kolekcije (sve vrednosti postavlja na
     * null)
     */
    public void clear();
}