public class  ksiazka extends MediaBiblioteczne {
    private String autor;
    private int liczbaStron;

    // Konstruktor
    public ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }


    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Autor: " + autor + ", Liczba stron: " + liczbaStron);
    }

    public void ocenDlugosc() {
        if (liczbaStron > 500) {
            System.out.println("To długa książka (" + liczbaStron + " stron)");
        } else {
            System.out.println("To standardowa książka (" + liczbaStron + " stron)");
        }
    }
}

