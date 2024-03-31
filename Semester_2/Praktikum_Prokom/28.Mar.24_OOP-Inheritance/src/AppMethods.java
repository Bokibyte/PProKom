import java.util.ArrayList;

public class AppMethods extends DataVCD {
    
    // adder
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
    public void addRating(int option){
        this.ratingList.add(this.kategoriList[option]);
    }
    public void addStok(int addStok){
        this.stokList.add(addStok);
    }


    // setter
    public void setJudul(int editIndex, String newJudul){
        this.judulList.set(editIndex, newJudul);
    }
    public void setAktor(int editIndex, String addAktor){
        this.aktorList.set(editIndex, addAktor);
    }
    public void setSutradara(int editIndex, String addSutradara){
        this.sutradaraList.set(editIndex, addSutradara);
    }
    public void setPublisher(int editIndex, String addPublisher){
        this.sutradaraList.set(editIndex, addPublisher);
    }
    public void setRating(int editIndex, int option){
        this.ratingList.set(editIndex, this.kategoriList[option]);
    }
    public void setStok(int editIndex, int addStok){
        this.stokList.set(editIndex, addStok);
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
    public String getRating(int index){
        String rating = this.ratingList.get(index);
        return rating;
    }
    public int getStok(int index){
        int stokList = this.stokList.get(index);
        return stokList;
    }
}
