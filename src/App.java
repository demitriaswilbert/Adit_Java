import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Employee> a_employee = new ArrayList<Employee>();
    static ArrayList<Item> a_item = new ArrayList<Item>();
    static ArrayList<Supplier> a_supplier = new ArrayList<Supplier>();

    public static void addEmployee() {

        System.out.print("Nama   : ");
        char[] nama = sc.next().toCharArray();
        System.out.print("Kode   : ");
        char[] kode = sc.next().toCharArray();
        System.out.print("Alamat : ");
        String alamat = sc.next();

        a_employee.add(new Employee(nama, kode, alamat));
    }
    public static void addItem() {

        System.out.print("Nama     : ");
        char[] nama = sc.next().toCharArray();
        System.out.print("Kode     : ");
        String kode = sc.next();
        System.out.print("Kategori : ");
        String kategori = sc.next();
        System.out.print("Stok     : ");
        int stok = sc.nextInt();

        a_item.add(new Item(nama, kode, kategori, stok));
    }
    public static void addSupplier() {

        System.out.print("Nama    : ");
        char[] nama = sc.next().toCharArray();
        System.out.print("Kode    : ");
        char[] kode = sc.next().toCharArray();
        System.out.print("Alamat  : ");
        String alamat = sc.next();
        System.out.print("No. Tlp : ");
        char[] no_tlp = sc.next().toCharArray();

        a_supplier.add(new Supplier(nama, kode, alamat, no_tlp));
    }
    public static void selectEmployee() {
        System.out.print("Kode : ");
        char[] kode = sc.next().toCharArray();
        Employee employee = null;
        for(int i = 0; i < a_employee.size(); i++) {
            Employee tmp = a_employee.get(i);
            if(Arrays.equals(tmp.getKode(), kode)) {
                employee = tmp;
                break;
            }
        }
        if(employee != null) {
            employeeMenu(employee);
        } else {
            System.out.println("Employee " + new String(kode) + " Not found!");
            sc.next();
        }
    }
    public static void employeeMenu(Employee employee) {
        boolean run = true;
        while(run) {
            System.out.print("\033[2J\033[H");
            System.out.println("Selected Employee: ");
            System.out.println(employee);

            System.out.println("1. Ganti Nama    2. Ganti Kode");
            System.out.println("3. Ganti Alamat  4. Tampilkan Histori Penerimaan");
            System.out.println("5. Kembali");
            
            System.out.print("Pilihan > ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: { 
                    System.out.print("Nama: ");
                    char[] nama = sc.next().toCharArray();
                    employee.setNama(nama);
                    break;
                }
                case 2: { 
                    System.out.print("Kode: ");
                    char[] kode = sc.next().toCharArray();
                    employee.setKode(kode);
                    break;
                }
                case 3: { 
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    employee.setAlamat(alamat);
                    break;
                }
                case 4: { 
                    System.out.println("Histori Penerimaan: ");
                    for(int i = 0; i < employee.getHistoriPenerimaan().size(); i++) {
                        System.out.println(employee.getHistoriPenerimaan().get(i));
                    }
                    sc.next();
                    break;
                }
                case 5: {
                    run = false;
                    break;
                }
            }
        }
    }
    public static void selectItem() {
        System.out.print("Kode : ");
        char[] kode = sc.next().toCharArray();
        Item item = null;
        for(int i = 0; i < a_item.size(); i++) {
            Item tmp = a_item.get(i);
            if(Arrays.equals(tmp.getKode(), kode)) {
                item = tmp;
                break;
            }
        }
        if(item != null) {
            itemMenu(item);
        } else {
            System.out.println("Item " + new String(kode) + " Not found!");
            sc.next();
        }
    }
    public static void itemMenu(Item item) {
        boolean run = true;
        while(run) {
            System.out.print("\033[2J\033[H");
            System.out.println("Selected Item: ");
            System.out.println(item);

            System.out.println("1. Ganti Nama      2. Ganti Kode");
            System.out.println("3. Ganti Kategori  4. Ganti Stok");
            System.out.println("5. Kembali");
            
            System.out.print("Pilihan > ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: { 
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    item.setNama(nama);
                    break;
                }
                case 2: { 
                    System.out.print("Kode: ");
                    char[] kode = sc.next().toCharArray();
                    item.setKode(kode);
                    break;
                }
                case 3: { 
                    System.out.print("Kategori: ");
                    String kategori = sc.next();
                    item.setKategori(kategori);
                    break;
                }
                case 4: { 
                    System.out.print("Stok: ");
                    int stok = sc.nextInt();
                    item.setStok(stok);
                    break;
                }
                case 5: {
                    run = false;
                    break;
                }
            }
        }
    }
    public static void selectSupplier() {
        System.out.print("Kode : ");
        char[] kode = sc.next().toCharArray();
        Supplier supplier = null;
        for(int i = 0; i < a_supplier.size(); i++) {
            Supplier tmp = a_supplier.get(i);
            if(Arrays.equals(tmp.getKode(), kode)) {
                supplier = tmp;
                break;
            }
        }
        if(supplier != null) {
            supplierMenu(supplier);
        } else {
            System.out.println("Supplier " + new String(kode) + " Not found!");
            sc.next();
        }
    }
    public static void supplierMenu(Supplier supplier) {
        boolean run = true;
        while(run) {
            System.out.print("\033[2J\033[H");
            System.out.println("Selected Supplier: ");
            System.out.println(supplier);

            System.out.println("1. Ganti Nama      2. Ganti Kode");
            System.out.println("3. Ganti Alamat    4. Ganti No. Telp");
            System.out.println("5. Kembali");
            
            System.out.print("Pilihan > ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: { 
                    System.out.print("Nama: ");
                    char[] nama = sc.next().toCharArray();
                    supplier.setNama(nama);
                    break;
                }
                case 2: { 
                    System.out.print("Kode: ");
                    char[] kode = sc.next().toCharArray();
                    supplier.setKode(kode);
                    break;
                }
                case 3: { 
                    System.out.print("Alamat: ");
                    String kategori = sc.next();
                    supplier.setAlamat(kategori);
                    break;
                }
                case 4: { 
                    System.out.print("No. Telp: ");
                    char[] kode = sc.next().toCharArray();
                    supplier.setNoTlp(kode);
                    break;
                }
                case 5: {
                    run = false;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        // System.out.println(sc.delimiter());

        while(true) {
            System.out.print("\033[2J\033[H");
            System.out.println("Jumlah Employee : " + a_employee.size());
            System.out.println("Jumlah Item     : " + a_item.size());
            System.out.println("Jumlah Supplier : " + a_supplier.size());
            System.out.println("1. Add Employee    2. Add Item    3. Add Supplier");
            System.out.println("4. Print Employee  5. Print Item  6. Print Supplier");
            System.out.println("7. Select Employee 8. Select Item 9. Select Supplier");

            System.out.print("Pilihan > ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: { addEmployee(); break; }
                case 2: { addItem(); break; }
                case 3: { addSupplier(); break; }
                
                case 4: { 
                    for(int i = 0; i < a_employee.size(); i++) {
                        Employee employee = a_employee.get(i);
                        System.out.println(employee);
                    }
                    sc.next();
                    break;
                }
                case 5: { 
                    for(int i = 0; i < a_item.size(); i++) {
                        Item item = a_item.get(i);
                        System.out.println(item);
                    }
                    sc.next();
                    break;
                }
                case 6: { 
                    for(int i = 0; i < a_supplier.size(); i++) {
                        Supplier supplier = a_supplier.get(i);
                        System.out.println(supplier);
                    }
                    sc.next();
                    break;
                }
                case 7: { 
                    selectEmployee();
                    break;
                }
                case 8: { 
                    selectItem();
                    break;
                }
                case 9: { 
                    selectSupplier();
                    break;
                }
            }
        }
    }
}
