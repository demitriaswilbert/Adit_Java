import java.util.Date;

public class Receiving {
    char[] kode_receiving;
    Supplier supplier;
    Date tanggal;
    String pembayaran;
    Employee penerima;

    Receiving(char[] kode_receiving, Supplier supplier, Date tanggal, String pembayaran, Employee employee) {
        this.kode_receiving = new char[kode_receiving.length];
        System.arraycopy(kode_receiving, 0, this.kode_receiving, 0, kode_receiving.length);
        this.supplier = supplier;
        this.tanggal = tanggal;
        this.pembayaran = pembayaran;
        this.penerima = employee;
    }
    void cetakBuktiTerimaBarang() {
        System.out.println (
            "Bukti Terima Barang: \n" + 
            "Kode Terima : " + this.kode_receiving.toString() + "\n" +
            "Supplier    : " + this.supplier.toString() + "\n" +
            "Tanggal     : " + this.tanggal.toString() + "\n" + 
            "Pembayaran  : " + this.pembayaran + "\n" + 
            "Penerima    : " + this.penerima.toString()
        );
    }
}
