package Zadatak20;

/**
 * Zadatak 20
 Napisati klasu Apoteka koja sadrži naziv apoteke, adresu i niz proizvoda koje ima. Klasa Proizvod sadrži
 naziv i cenu. Napisati izvedene klase PrivatnaApoteka i DržavnaApoteka.
 Metod izracunajCenu treba da se izvršava polimorfno, tako da ukoliko je apoteka privatna cena se uvecava
 za 20%, dok ukoliko je apoteka državna cena se umanjuje za 5%.
 Napomena: Za svaku od klasa u ovom zadatku treba da ima getere, setere, toString metod kao i
 konstruktore, prazan, konstruktor polja i konstruktor kopije. Testirati rad klasa iz Main klase.
 */
public class Zadatak20 {
    public static void main(String[] args){
        Proizvod pr = new Proizvod("lek",100);
        DrzavnaApoteka da = new DrzavnaApoteka("drzavna","DrzavnaApoteka",pr);
        PrivatnaApoteka pa = new PrivatnaApoteka("privatna", "PrivatnaApoteka",pr);
        System.out.println(da.toString());
        System.out.println(pa.toString());
    }
}
