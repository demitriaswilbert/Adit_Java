import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Employee> a_employees = new ArrayList<Employee>();
    static ArrayList<Item> a_item = new ArrayList<Item>();
    static ArrayList<Supplier> a_supplier = new ArrayList<Supplier>();

    public static void addEmployee() {

        System.out.print("Nama   : ");
        char[] nama = sc.next().toCharArray();
        System.out.print("Kode   : ");
        char[] kode = sc.next().toCharArray();
        System.out.print("Alamat : ");
        String alamat = sc.next();

        a_employees.add(new Employee(nama, kode, alamat));
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
    public static void main(String[] args) throws Exception {
        // System.out.println(sc.delimiter());

        while(true) {
            System.out.print("\033[2J\033[H");
            System.out.println("Jumlah Employee : " + a_employees.size());
            System.out.println("Jumlah Item     : " + a_item.size());
            System.out.println("Jumlah Supplier : " + a_supplier.size());
            System.out.println("1. Add Employee    2. Add Item    3. Add Supplier");
            System.out.println("4. Print Employee  5. Print Item  6. Print Supplier");
            System.out.println("7. Select Employee 8. Select Item 9. Select Supplier");

            int choice = sc.nextInt();
            switch(choice) {
                case 1: { addEmployee(); break; }
                case 2: { addItem(); break; }
                case 3: { addSupplier(); break; }
                
                case 4: { 
                    for(int i = 0; i < a_employees.size(); i++) {
                        Employee employee = a_employees.get(i);
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
            }
        }
    }
}
