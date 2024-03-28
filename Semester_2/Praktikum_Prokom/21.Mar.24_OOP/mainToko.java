import java.util.Scanner;
import java.util.Random;

public class mainToko {
    static data_senin senin = new data_senin();
    static data_selasa selasa = new data_selasa();
    static data_rabu rabu = new data_rabu();

    // Memasukan data awal ke masing-masing hari
    public static void addFirstItem(){

        // Pakai random agar sedikit realis
        Random random = new Random();
        int stock = 0;
        stock += random.nextInt(81)+20;

        senin.addItem("Pensil");
        senin.addPrice(1000);
        senin.addStock(20);
        senin.addItem("Penggaris");
        senin.addPrice(5000);
        senin.addStock(20);
        senin.addItem("Penghapus");
        senin.addPrice(3000);
        senin.addStock(20);
        senin.addItem("Binder");
        senin.addPrice(10000);
        senin.addStock(20);
        senin.addItem("Double Folio");
        senin.addPrice(500);
        senin.addStock(20);
        
        selasa.addItem("AK-47");
        selasa.addPrice(8500000);
        selasa.addStock(stock);
        selasa.addItem("M60");
        selasa.addPrice(20638800);
        selasa.addStock(stock);
        selasa.addItem("GM6 Lynx");
        selasa.addPrice(18525700);
        selasa.addStock(stock);
        selasa.addItem("Denel NTW-20 Anti Material RIfle");
        selasa.addPrice(10477434);
        selasa.addStock(stock);
        selasa.addItem("P90");
        selasa.addPrice(2379545);
        selasa.addStock(stock);

        rabu.addItem("Nasi Goreng");
        rabu.addPrice(20000);
        rabu.addStock(stock);
        rabu.addItem("Sate Sapi Kobe");
        rabu.addPrice(50000);
        rabu.addStock(stock);
        rabu.addItem("Pempek + Kuah");
        rabu.addPrice(18000);
        rabu.addStock(stock);
        rabu.addItem("Mie Sapi");
        rabu.addPrice(25000);
        rabu.addStock(stock);
        rabu.addItem("Indomie Spesial");
        rabu.addPrice(150000);
        rabu.addStock(stock);
    }

    public static void setterMenu(Scanner sc){
        Scanner scSetter = sc;
        int setterInput = 0;
        boolean exit = false;

        while(!exit){
            System.out.println("Tambah data pada hari:\n1. Senin\n2. Selasa\n3. Rabu\n99. Keluar Menu");
            System.out.print("Masukan nomor menu: ");
            setterInput = scSetter.nextInt();
            System.out.println();
            if(setterInput==1){
                System.out.print("Masukan nama item: ");
                senin.addItem(scSetter.next());
                System.out.print("Masukan stok item: ");
                senin.addStock(scSetter.nextInt());
                System.out.print("Masukan harga item: ");
                senin.addPrice(scSetter.nextInt());
                System.out.println();
            }else if(setterInput==2){
                System.out.print("Masukan nama item: ");
                selasa.addItem(scSetter.next());
                System.out.print("Masukan stok item: ");
                selasa.addStock(scSetter.nextInt());
                System.out.print("Masukan harga item: ");
                selasa.addPrice(scSetter.nextInt());
                System.out.println();
            }else if(setterInput==3){
                System.out.print("Masukan nama item: ");
                rabu.addItem(scSetter.next());
                System.out.print("Masukan stok item: ");
                rabu.addStock(scSetter.nextInt());
                System.out.print("Masukan harga item: ");
                rabu.addPrice(scSetter.nextInt());
                System.out.println();
            }else if(setterInput==99){
                exit = true;
            }else{
                System.out.println("input salah.");
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        long totalPrice = 0;

        // Tambah data awal
        addFirstItem();

        // Menu setter
        // Menggunakan 1 scanner agar System.in tidak close
        setterMenu(sc);
        
        System.out.println("Tampilkan toko pada hari?\n1. Senin\n2. Selasa\n3. Rabu");
        System.out.print("Masukan input: ");
        input = sc.nextInt();

        if(input==1){
            for(int i = 0; i < senin.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item \t: "+senin.getName(i));
                System.out.println("Stok \t\t: "+senin.getStock(i));
                System.out.println("Harga satuan \t: Rp"+senin.getPrice(i));
                System.out.println("Harga item \t: Rp"+(senin.getStock(i)*senin.getPrice(i)));
                totalPrice += (senin.getPrice(i)*senin.getStock(i));
            }
            System.out.println("\nUang yang diterima jika semua item terjual: Rp"+totalPrice);
            System.out.println();

        }else if(input==2){
            for(int i = 0; i < selasa.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item \t: "+selasa.getName(i));
                System.out.println("Stok \t\t: "+selasa.getStock(i));
                System.out.println("Harga satuan \t: Rp"+selasa.getPrice(i));
                System.out.println("Harga item \t: Rp"+(selasa.getStock(i)*selasa.getPrice(i)));
                totalPrice += (selasa.getPrice(i)*selasa.getStock(i));
            }
            System.out.println("\nUang yang diterima jika semua item terjual: Rp"+totalPrice);
            System.out.println();

        }else if(input==3){
            for(int i = 0; i < rabu.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item \t: "+rabu.getName(i));
                System.out.println("Stok \t\t: "+rabu.getStock(i));
                System.out.println("Harga satuan \t: Rp"+rabu.getPrice(i));
                System.out.println("Harga item \t: Rp"+(rabu.getStock(i)*rabu.getPrice(i)));
                totalPrice += (rabu.getPrice(i)*rabu.getStock(i));
            }
            System.out.println("\nUang yang diterima jika semua item terjual: Rp"+totalPrice);
            System.out.println();

        }else{
            System.out.println("Input invalid.");
        }
        sc.close();
    }
}
