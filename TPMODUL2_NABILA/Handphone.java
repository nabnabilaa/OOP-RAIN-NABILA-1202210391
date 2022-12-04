public class Handphone extends Perangkat {
    protected boolean fingerprint;
    protected String teks;

    public Handphone(String drive, int ram, Double processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint=fingerprint;
    }

    @Override
    public void informasi(){
        if(fingerprint==true){
            teks="Terdapat fingerprint";
        }
        else{
            teks="Tidak terdapat fingerprint";
        }
        System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan prosesor secepat " + processor + ". Selain itu handphone ini "+ teks + ".");
    }

    public void telfon(int hp){
        System.out.println("Handphone berhasil menyambungkan telefon ke nomer " + hp);
    }
    public void kirim_sms(int hp){
        System.out.println("Handphone berhasil mengirim SMS ke Nomer " + hp);    
    }
    public void kirim_sms(int hp1, int hp2){
        System.out.println("Handphone berhasil mengirim SMS ke Nomer " + hp1 + " dan ke nomer " + hp2);
    }
}