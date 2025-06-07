public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepne;


    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepne = true;
    }


    public void wypozycz() {
        if (dostepne) {
            dostepne = false;
            System.out.println("Wypożyczono: " + tytul);
        } else {
            System.out.println("Medium " + tytul + " jest już wypożyczone");
        }
    }


    public void zwroc() {
        if (!dostepne) {
            dostepne = true;
            System.out.println("Zwrócono: " + tytul);
        } else {
            System.out.println("Medium " + tytul + " nie było wypożyczone");
        }
    }


    public void wyswietlInfo() {
        String status = dostepne ? "dostępne" : "wypożyczone";
        System.out.println("Tytuł: " + tytul + ", Rok wydania: " + rokWydania + ", Status: " + status);
    }
}

