import java.util.ArrayList;

public class DataVCD {
    protected ArrayList<String> judulList, aktorList, sutradaraList, publisherList, ratingList;
    protected ArrayList<Integer> stokList;
    protected String[] kategoriList;

    public DataVCD(){
        judulList = new ArrayList<>();
        aktorList = new ArrayList<>();
        sutradaraList = new ArrayList<>();
        publisherList = new ArrayList<>();
        ratingList = new ArrayList<>();
        stokList = new ArrayList<>();
        kategoriList = new String[4];
        kategoriList[0] = "SU";
        kategoriList[1] = "A";
        kategoriList[2] = "R";
        kategoriList[3] = "D";
    }
}
