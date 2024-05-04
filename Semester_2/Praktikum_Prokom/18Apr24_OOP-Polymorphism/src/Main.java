public class Main {
    public static void OperasiBilanganCetak(OperasiBilangan[] oB){
        
        for(int i = 0; i < oB.length; i++){
            oB[i].tampil();
        }
    }
    public static void main(String[] args) throws Exception {
        OperasiBilangan[] oB = {new OperasiPenjumlahan(),
                                new OperasiPengurangan(),
                                new OperasiPerkalian(),
                                new OperasiPembagian()};
        OperasiBilanganCetak(oB);
    }
}
