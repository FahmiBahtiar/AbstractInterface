public class PembeliIndividu extends Pembeli{
    public PembeliIndividu(String nama, String alamat, int phone){
        super(nama, alamat, phone);
    }

    @Override
    public String getTipePembeli() {
       return "Individu";
    }

    public void beliMobil(Mobil mobil, int quantity){
        double totalPembayaran = mobil.getharga() * quantity;
    }
    
}
