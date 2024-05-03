public class Tools extends DataMahasiswa{

    public int getSize(){
        return this.NIM.size();
    }
    public boolean isEmpty(){
        if(this.NIM.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // setter
    public void addNIM(String input){
        this.NIM.add(input);
    }
    public void addNama(String input){
        this.nama.add(input);
    }
    public void addAlamat(String input){
        this.alamat.add(input);
    }
    public void addJurusan(String input){
        this.jurusan.add(input);
    }

    //getter
    public String getNIM(int index){
        return this.NIM.get(index);

    }
    public String getNama(int index){
        return this.nama.get(index);
    }
    public String getAlamat(int index){
        return this.alamat.get(index);
    }
    public String getJurusan(int index){
        return this.jurusan.get(index);
    }
}
