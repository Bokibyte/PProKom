import java.util.Scanner;
import java.util.ArrayList;

public class mainToko {
    public static void setterMenu(){
        data_senin senin = new data_senin();
        data_selasa selasa = new data_selasa();
        data_rabu rabu = new data_rabu();
        Scanner sc = new Scanner(System.in);
        int setterInput = 0;
        System.out.println("1. tambah item\n2. Total harga");
        System.out.print("Masukan nomor menu: ");
        setterInput = sc.nextInt();
        if(setterInput==1){
            setterInput = 0;
            System.out.println("Hari:\n1. Senin\n2. Selasa\n3. Rabu");
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
                
            }
        }
    }
    public static void main(String[]args){
        data_senin senin = new data_senin();
        data_selasa selasa = new data_selasa();
        data_rabu rabu = new data_rabu();
        Scanner sc = new Scanner(System.in);
        setterMenu();
        
    }
}
