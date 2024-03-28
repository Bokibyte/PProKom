import java.util.ArrayList;

public class data_rabu {
    private ArrayList<String> nama;
    private ArrayList<Integer> stock, price;

    public void addItem(String nama){
        this.nama.add(nama);
    }
    public void addStock(int stock){
        this.stock.add(stock);
    }
    public void addPrice(int price){
        this.price.add(price);
    }
    public int itemAmount(){
        return this.nama.size();
    }
    public String getName(int index){
        return this.nama.get(index);
    }
    public int getStock(int index){
        return this.stock.get(index);
    }
    public int getPrice(int index){
        return this.price.get(index);
    }
}
