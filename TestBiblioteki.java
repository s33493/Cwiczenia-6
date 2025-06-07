public class TestBiblioteki {
    public static void main(String[] args) {

        ksiazka ksiazka1 = new ksiazka("Władca Pierścieni", 1954, "J.R.R. Tolkien", 1008);
        ksiazka ksiazka2 = new ksiazka("Zbrodnia i kara", 1866, "Fiodor Dostojewski", 672);
        film film1 = new film("Matrix", 1999, "Lana i Lilly Wachowski", 136);
        film film2 = new film("Przeminęło z wiatrem", 1939, "Victor Fleming", 238);


        MediaBiblioteczne[] katalog = new MediaBiblioteczne[4];
        katalog[0] = ksiazka1;
        katalog[1] = ksiazka2;
        katalog[2] = film1;
        katalog[3] = film2;


        System.out.println("=== Przegląd katalogu ===");
        for (MediaBiblioteczne medium : katalog) {
            medium.wyswietlInfo();


            if (medium instanceof ksiazka) {
                ((ksiazka) medium).ocenDlugosc();
            } else if (medium instanceof film) {
                ((film) medium).ocenDlugosc();
            }

            System.out.println("----------------------");
        }


        System.out.println("\n=== Operacje na mediach ===");
        ksiazka1.wypozycz();
        ksiazka2.wypozycz();
        ksiazka1.zwroc();
    }
}