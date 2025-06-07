public class film extends MediaBiblioteczne {
    private String rezyser;
    private int czasTrwania;

    // Konstruktor
    public film(String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }


    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Reżyser: " + rezyser + ", Czas trwania: " + czasTrwania + " minut");
    }
    public void ocenDlugosc() {
        if (czasTrwania > 150) {
            System.out.println("To długi film (" + czasTrwania + " minut)");
        } else {
            System.out.println("To standardowy film (" + czasTrwania + " minut)");
        }
    }
}