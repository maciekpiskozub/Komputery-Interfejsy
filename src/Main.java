import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Komputer> komputery = new ArrayList<>();
        KomputerWindows dell = new KomputerWindows("12345", "Windows 11");
        KomputerWindows lenovo = new KomputerWindows("54321", "Ryzen 7");
        KomputerMac mac = new KomputerMac("56789", "os17");
        KomputerMac macboook = new KomputerMac("98765", "os16");

        komputery.add(dell);
        komputery.add(lenovo);
        komputery.add(mac);
        komputery.add(macboook);

        for(Komputer k: komputery) {
            System.out.println(k.getClass().getName());
            k.uruchom();
            k.zepsujSie();
            System.out.println("-----------------------");
        }

        Collections.sort(komputery);
        System.out.println(komputery);



    }
}