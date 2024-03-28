import java.util.Scanner;

public class mainToko {
    public static data_senin senin = new data_senin();
    public static data_selasa selasa = new data_selasa();
    public static data_rabu rabu = new data_rabu();

    public static void addFirstItem(){
        senin.addItem("Pensil");
        senin.addPrice(1000);
        senin.addItem("Penggaris");
        senin.addPrice(5000);
        senin.addItem("Penghapus");
        senin.addPrice(3000);
        senin.addItem("Binder");
        senin.addPrice(10000);
        senin.addItem("Double Folio");
        senin.addPrice(500);
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
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int totalPrice = 0;

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
    }
}
