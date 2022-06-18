import java.util.ArrayList;
public class Employee extends User {
    ArrayList<String> histori_penerimaan = new ArrayList<String>();

    Employee(char[] nama_pegawai, char[] kode_pegawai, String alamat) {
        super(nama_pegawai, kode_pegawai, alamat);
    }
    public ArrayList<String> getHistoriPenerimaan() {
        return this.histori_penerimaan;
    }

    public void terima(String kode_penerimaan) {
        this.histori_penerimaan.add(kode_penerimaan);
    }
    public String toString() {
        return "Employee: {" + super.toString() + "}"; 
    }
    
}
