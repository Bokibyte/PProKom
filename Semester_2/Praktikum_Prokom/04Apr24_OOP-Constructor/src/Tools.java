public class Tools extends DataMahasiswa{

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
    public void getNIM(int index){
        this.NIM.get(index);
    }
    public void getNama(int index){
        this.nama.get(index);
    }
    public void getAlamat(int index){
        this.alamat.get(index);
    }
    public void getJurusan(int index){
        this.jurusan.get(index);
    }
}
