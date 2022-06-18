import java.util.Arrays;
public class ReceivingItem {
    char[] kode;
    Item barang;
    int kuantiti_terima;
    long harga_satuan;
    long total;

    ReceivingItem(char[] kode_receiving_item, Item barang, int kuantiti_terima, long harga_satuan, long total) {
        this.setKode(kode_receiving_item);
        this.barang = barang;
        this.kuantiti_terima = kuantiti_terima;
        this.harga_satuan = harga_satuan;
        this.total = total;
        updateStok(barang.kode, kuantiti_terima);
    }

    public Item getDetailItem(){
        return this.barang;
    }

    public void updateStok (char[] kode_item, int kuantiti){
        if(Arrays.equals(this.barang.kode, kode_item)) {
            if(this.barang.stok >= kuantiti){
                this.barang.stok -= kuantiti;                
            }
        }
    }
    public char[] getKode() {
        return this.kode;
    }

    public void setKode(char[] kode) {
        this.kode = new char[kode.length];
        System.arraycopy(kode, 0, this.kode, 0, kode.length);
    }

    public Item getBarang() {
        return this.barang;
    }

    public void setBarang(Item barang) {
        this.barang = barang;
    }

    public int getKuantiti_terima() {
        return this.kuantiti_terima;
    }

    public void setKuantiti_terima(int kuantiti_terima) {
        this.kuantiti_terima = kuantiti_terima;
    }

    public long getHarga_satuan() {
        return this.harga_satuan;
    }

    public void setHarga_satuan(long harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

}