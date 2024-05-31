
import java.util.ArrayList;

public class data_senin{
    private ArrayList<String> nama;
    private ArrayList<Integer> stock, price;

    // Konstruktor biar gak null Arraynya
    public data_senin(){
        nama = new ArrayList<>();
        stock = new ArrayList<>();
        price = new ArrayList<>();
    }

    // setter
    public void addItem(String setNama){
        nama.add(setNama);
    }
    public void addStock(int setStock){
        stock.add(setStock);
    }
    public void addPrice(int setPrice){
        price.add(setPrice);
    }

    // untuk mendapatkan index
    public int itemAmount(){
        return nama.size();
    }

    // getter
    public String getName(int index){
        return nama.get(index);
    }
    public int getStock(int index){ 
        return stock.get(index);
    }
    public int getPrice(int index){
        return price.get(index);
    }
}
