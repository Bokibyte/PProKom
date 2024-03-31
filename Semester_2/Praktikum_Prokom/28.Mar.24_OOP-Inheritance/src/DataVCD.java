import java.util.ArrayList;

public class DataVCD {
    private ArrayList<String> judul, aktor, sutradara, publisher;
    private ArrayList<Integer> stok;
    private String[] kategori;

    public DataVCD(){
        judul = new ArrayList<>();
        aktor = new ArrayList<>();
        sutradara = new ArrayList<>();
        publisher = new ArrayList<>();
        kategori = new String[3];
        kategori[0] = "SU";
        kategori[1] = "A";
        kategori[2] = "R";
        kategori[3] = "D";
    }
}
