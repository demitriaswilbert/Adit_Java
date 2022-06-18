public class User {
    char[] nama;
    char[] kode;
    String alamat;

    User(char[] nama, char[] kode, String alamat) {
        this.setNama(nama);
        this.setKode(kode);
        this.setAlamat(alamat);
    }
    public void setNama(char[] nama) {
        this.nama = new char[nama.length];
        System.arraycopy(nama, 0, this.nama, 0, nama.length);
    }
    public void setKode(char[] kode) {
        this.kode = new char[kode.length];
        System.arraycopy(kode, 0, this.kode, 0, kode.length);
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public char[] getNama() {
        return this.nama;
    }
    public char[] getKode() {
        return this.kode;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public String toString() {
        return "Nama: " + new String(this.nama) + ", Kode: " + new String(this.kode) + ", Alamat: " + this.alamat;
    }
}
