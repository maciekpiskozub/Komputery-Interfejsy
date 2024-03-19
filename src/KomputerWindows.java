public class KomputerWindows implements Komputer {

    private String model;
    private String wersjaSystemu;

    public KomputerWindows(String model, String wersjaSystemu) {
        this.model = model;
        this.wersjaSystemu = wersjaSystemu;
    }

    @Override
    public void uruchom() {
        System.out.println("Wlaczam sie");

    }

    @Override
    public void zepsujSie() {
        System.out.println("Autodestrukcja za 3..... 2....... 1....... JEB");

    }


}
