import java.util.Scanner;
import java.util.Random;

public class mainToko {
    public static data_senin senin = new data_senin();
    public static data_selasa selasa = new data_selasa();
    public static data_rabu rabu = new data_rabu();

    // Memasukan data awal ke masing-masing hari
    public static void addFirstItem(){

        // Pakai random agar sedikit realis
        Random random = new Random();
        int stock = random.nextInt(81)+20;

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
        selasa.addPrice(206388000);
        selasa.addStock(stock);
        selasa.addItem("GM6 Lynx");
        selasa.addPrice(185257000);
        selasa.addStock(stock);
        selasa.addItem("Denel NTW-20 Anti Material RIfle");
        selasa.addPrice(104774340);
        selasa.addStock(stock);
        selasa.addItem("P90");
        selasa.addPrice(23795475);
        selasa.addStock(stock);

        rabu.addItem("Nasi Goreng");
        rabu.addPrice(20000);
        selasa.addStock(stock);
        rabu.addItem("Sate Sapi Kobe");
        rabu.addPrice(50000);
        selasa.addStock(stock);
        rabu.addItem("Pempek + Kuah");
        rabu.addPrice(18000);
        selasa.addStock(stock);
        rabu.addItem("Mie Sapi");
        rabu.addPrice(25000);
        selasa.addStock(stock);
        rabu.addItem("Indomie Spesial");
        rabu.addPrice(150000);
        selasa.addStock(stock);
    }

    public static void setterMenu(){
        Scanner sc = new Scanner(System.in);
        int setterInput = 0;
        System.out.println("Tambah data pada hari:\n1. Senin\n2. Selasa\n3. Rabu");
        System.out.print("Masukan nomor menu: ");
        setterInput = sc.nextInt();
        if(setterInput==1){
            System.out.print("Masukan nama item: ");
            senin.addItem(sc.next());
            System.out.print("Masukan stok item: ");
            senin.addStock(sc.nextInt());
            System.out.print("Masukan harga item: ");
            senin.addPrice(sc.nextInt());
        }else if(setterInput==2){
            System.out.print("Masukan nama item: ");
            selasa.addItem(sc.next());
            System.out.print("Masukan stok item: ");
            selasa.addStock(sc.nextInt());
            System.out.print("Masukan harga item: ");
            selasa.addPrice(sc.nextInt());
        }else if(setterInput==3){
            System.out.print("Masukan nama item: ");
            rabu.addItem(sc.next());
            System.out.print("Masukan stok item: ");
            rabu.addStock(sc.nextInt());
            System.out.print("Masukan harga item: ");
            rabu.addPrice(sc.nextInt());
        }else{
            System.out.println("input salah.");
        }   
        sc.close();
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int totalPrice = 0;

        // Menu setter
        setterMenu();
        
        System.out.println("Tampilkan toko pada hari?\n1. Senin\2. Selasa\3. Rabu");
        System.out.print("Masukan input: ");
        input = sc.nextInt();
        if(input==1){
            for(int i = 0; i < senin.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item = "+senin.getName(i));
                System.out.println("Stok : "+senin.getStock(i));
                System.out.println("Harga satuan : "+senin.getPrice(i));
                System.out.println("Harga bolpoin : "+(senin.getStock(i)*senin.getPrice(i)));
                totalPrice += (senin.getPrice(i)*senin.getStock(i));
            }
            System.out.println("Uang yang diterima jika semua item terjual: Rp"+totalPrice);

        }else if(input==2){
            for(int i = 0; i < selasa.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item = "+selasa.getName(i));
                System.out.println("Stok : "+selasa.getStock(i));
                System.out.println("Harga satuan : "+selasa.getPrice(i));
                System.out.println("Harga bolpoin : "+(selasa.getStock(i)*selasa.getPrice(i)));
                totalPrice += (selasa.getPrice(i)*selasa.getStock(i));
            }
            System.out.println("Uang yang diterima jika semua item terjual: Rp"+totalPrice);

        }else if(input==3){
            for(int i = 0; i < rabu.itemAmount(); i++){
                System.out.println();
                System.out.println("Nama item = "+rabu.getName(i));
                System.out.println("Stok : "+rabu.getStock(i));
                System.out.println("Harga satuan : "+rabu.getPrice(i));
                System.out.println("Harga bolpoin : "+(rabu.getStock(i)*rabu.getPrice(i)));
                totalPrice += (rabu.getPrice(i)*rabu.getStock(i));
            }
            System.out.println("Uang yang diterima jika semua item terjual: Rp"+totalPrice);
        }else{
            System.out.println("Input invalid.");
        }
        sc.close();
    }
}
