import java.util.ArrayList;

public class AppMethods extends DataVCD {
    
    // setter
    public void addJudul(String newJudul){
        this.judulList.add(newJudul);
    }
    public void addAktor(String addAktor){
        this.aktorList.add(addAktor);
    }
    public void addSutradara(String addSutradara){
        this.sutradaraList.add(addSutradara);
    }
    public void addPublisher(String addPublisher){
        this.sutradaraList.add(addPublisher);
    }
    public void addStok(int addStok){
        this.stokList.add(addStok);
    }

    // getter
    public int getSize(){
        int index = judulList.size();
        return index;
    }
    public String getJudul(int index){
        String judul = this.judulList.get(index);
        return judul;
    }
    public String getAktor(int index){
        String aktor = this.aktorList.get(index);
        return aktor;
    }
    public String getSutradara(int index){
        String sutradara = this.sutradaraList.get(index);
        return sutradara;
    }
    public String getPublisher(int index){
        String publisher = this.publisherList.get(index);
        return publisher;
    }
    public int getStok(int index){
        int stokList = this.stokList.get(index);
        return stokList;
    }
}
