public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat prk = new Perangkat ("apaya",16, 5.00);
        prk.informasi();
        System.out.println("");

        Laptop lp = new Laptop(" SUMSANG",  128, 3.5, true);
        lp.informasi();
        lp.buka_game(" Candy Crush");
        lp.kirim_email(" akunnabila@gmail.com");
        lp.kirim_email_lagi(" akunnabila1@gmail.com", " akunnabila2@gmail.com");
        System.out.println("");

        Handphone hp = new Handphone(" OPPO", 8, 3.6, true);
        hp.informasi();
        hp.telfon(628885169);
        hp.kirim_sms(62748268, 62020402);
        hp.kirim_sms(62110303, 62190909);
        System.out.println("");
    }
}