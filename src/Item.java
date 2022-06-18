public class Item {
    char[] kode;
    String nama;
    String kategori;
    int stok;

    Item(char[] kode, String nama, String kategori, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String toString() {
        return "Item: {Kode: " + new String(kode) + ", Nama: " + nama + ", Kategori: " + kategori + ", Stok: " + stok + "}";
    }

    public char[] getKode() {
        return this.kode;
    }

    public void setKode(char[] kode) {
        this.kode = new char[kode.length];
        System.arraycopy(kode, 0, this.kode, 0, kode.length);
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    

}
