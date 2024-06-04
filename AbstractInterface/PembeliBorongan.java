public class PembeliBorongan extends Pembeli {
    public PembeliBorongan(String nama, String alamat, int phone){
        super(nama, alamat, phone);
    }

    @Override
    public String getTipePembeli() {
        return "Borongan";
    }

    public void beliMobil(Mobil mobil, int quantity){
        double totalPembayaran = mobil.getharga()* quantity;
    }
    
}
