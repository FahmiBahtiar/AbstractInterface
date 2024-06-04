public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Jono Sutanto", "Semarang", 8234123);

        Mobil sedan = new Sedan("Toyota Camry");
        Mobil minibus = new Minibus("Toyota Hiace");
        Mobil bus = new Bus("Bus Subur jaya");

        karyawan1.tambahHargaMobil(sedan,20000);
        karyawan1.tambahHargaMobil(bus, 40000);
        karyawan1.tambahHargaMobil(minibus, 50000);

        Pembeli PembeliIndividu = new PembeliIndividu("Joko Tole", "Jakarta", 02233444);
        Pembeli PembeliBorongan = new PembeliBorongan("Yanto Geming", "Pekanbaru", 01223444);

        PembeliIndividu.beliMobil(sedan, 2);
        double totalPembayaranPembeliIndividu = sedan.getharga()*2;
        karyawan1.hitungKomisi(totalPembayaranPembeliIndividu);

        PembeliBorongan.beliMobil(minibus, 3);
        double totalPembayaranPembeliBorongan = minibus.getharga()*3;
        karyawan1.hitungKomisi(totalPembayaranPembeliBorongan);


        karyawan1.viewBuyerData(PembeliIndividu);
        karyawan1.viewBuyerData(PembeliBorongan);

        System.out.println("Total komisi karyawan : " + karyawan1.getKaryawanKomisi());
    }
}