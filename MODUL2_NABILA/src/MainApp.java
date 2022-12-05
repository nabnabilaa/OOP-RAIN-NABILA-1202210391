public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir ta = new TransportasiAir(4, 20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        System.out.println("");

        Sampan sp = new Sampan(20, 50000, 2);
        sp.informasi();
        sp.berlayar();
        sp.berlabuh();
        sp.berlabuh(2);
        System.out.println("");

        Kapal kp = new Kapal(50, 100000, "Diesel");
        kp.informasi();
        kp.berlayar();
        kp.berlayar(20);
        kp.berlabuh();
        System.out.println("");
    }
}