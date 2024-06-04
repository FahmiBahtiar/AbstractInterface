public class Karyawan extends Person implements Komisi {
    double karyawanKomisi;

    public Karyawan(String nama, String alamat, int phone) {
        super(nama, alamat, phone);

    }

    public void tambahHargaMobil(Mobil mobil, double harga) {
        mobil.setharga(harga);

    }

    public void viewBuyerData(Pembeli pembeli) {
        System.out.println("Nama Pembeli : " + pembeli.getNama());
        System.out.println("Tipe Pembeli : " + pembeli.getTipePembeli());
        System.out.println("Alamat Pembeli : " + pembeli.getAlamat());
        System.out.println("Nomor Telepon Pembeli : " + pembeli.getPhone());
    }

    public void hitungKomisi(double totalPembayaran) {
        this.karyawanKomisi += 0.10 * totalPembayaran;
    }

    public double getKaryawanKomisi() {
        return karyawanKomisi;
    }
}