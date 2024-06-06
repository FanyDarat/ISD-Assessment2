public class Paket implements Comparable<Paket> {
    int id;
    String nama;
    int tanggal;
    String tipe;
    String alamat;

    public Paket(int id, String nama, int tanggal, String tipe, String alamat) {
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
        this.tipe = tipe;
        this.alamat = alamat;
    }

    public int durasi() {
        switch (tipe) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            default:
                return 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTanggal() {
        return this.tanggal;
    }

    public String getTipe() {
        return this.tipe;
    }

    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public String toString() {
        return "ID Paket: " + this.id + " Nama Pelanggan: " + this.nama + " Alamat Pelanggan: " + this.alamat;
    }

    public int compareTo(Paket other) {
        int durasi = this.durasi() + this.tanggal;
        int durasiLain = other.durasi() + other.tanggal;

        if (durasi < durasiLain) {
            return -1;
        } else if (durasi > durasiLain) {
            return 1;
        } else {
            return 0;
        }
    }

}