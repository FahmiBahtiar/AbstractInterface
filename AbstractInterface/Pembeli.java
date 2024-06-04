public abstract class Pembeli extends Person {

    public Pembeli(String nama, String alamat, int phone) {
        super(nama, alamat, phone);
    }

    public abstract String getTipePembeli();
    
    public abstract void beliMobil(Mobil mobil, int quantity);

}
