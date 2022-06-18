public class Supplier extends User {
    char[] no_tlp;
    Supplier(char[] nama_supplier, char[] kode_supplier, String alamat, char[] no_tlp) {
        super(nama_supplier, kode_supplier, alamat);
        this.setNoTlp(no_tlp);
    }
    public char[] getNoTlp() {
        return this.no_tlp;
    }

    public void setNoTlp(char[] no_tlp) {
        this.no_tlp = new char[no_tlp.length];
        System.arraycopy(no_tlp, 0, this.no_tlp, 0, no_tlp.length);
    }

    public String toString() {
        return "Supplier: {" + super.toString() + ", No. Tlp: " + new String(this.no_tlp) + "}"; 
    }

}
