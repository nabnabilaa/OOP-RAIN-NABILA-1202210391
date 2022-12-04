public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String teks;
    public Laptop(String drive, int ram, Double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
@Override
public void informasi() {
    if(webcam==true){
        teks=" terdapat Webcam";
    }
    else{
        teks="tidak terdapat Webcam";
    }
    System.out.println("Laptop ini memiliki tipe drive" + drive + " dengan ram sebanyak "
    + ram +" GB dan processor secepat "+ processor +" GHZ. selain itu laptop ini juga"+ teks);
}
public void buka_game(String nama_game){
    System.out.println("Laptop berhasil membuka game"+ nama_game);
}
public void kirim_email(String nama_email){
    System.out.println("Laptop  ini berhasil mengirimkan e-mail ke"+ nama_email);
}
public void kirim_email_lagi(String email1, String email2){
    System.out.println("Laptop ini berhasil mengirimkan e-mail ke"+ email1+" dan ke"+ email2);
}

}