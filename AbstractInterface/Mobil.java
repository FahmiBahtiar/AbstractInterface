public abstract class Mobil {
    String model;
    double harga;

    public Mobil(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public double getharga() {
        return harga;
    }
    

    public void setharga(double harga) {
        this.harga = harga;
    }
    
}
