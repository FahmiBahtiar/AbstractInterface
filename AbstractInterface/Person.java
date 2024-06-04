public abstract class Person {
    String nama;
    String alamat;
    int phone;

    public Person(String nama, String alamat, int phone) {
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
    }

    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }

    public int getPhone() {
        return phone;
    }
    
}
