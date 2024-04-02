import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {
    private static AppMethods methods = new AppMethods();

    // kumpulan method untuk menampilkan menu
    // sengaja dibuat untuk mengatasi umpan balik tombol cancel

    public static void setMenu(){
        boolean isPass = false;
        int checkPass = 0;
        int indexAt = methods.getSize();
        methods.addData();
        System.out.println("size = "+methods.getSize());
        
        while(true){
            System.out.println(methods.judulList);
            if(checkPass == 0){
                System.out.println(checkPass);
                isPass = methods.JOPJudul(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    if(methods.judulList.size() == 1){
                        JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }else{
                        methods.removeData(indexAt);
                    }
                }System.out.println(methods.judulList);
            }
            if(checkPass == 1){
                System.out.println(checkPass);
                isPass = methods.JOPAktor(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }System.out.println(methods.aktorList);
            }
            if(checkPass == 2){
                System.out.println(checkPass);
                isPass = methods.JOPSutradara(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }System.out.println(methods.sutradaraList);
            }
            if(checkPass == 3){
                System.out.println(checkPass);
                isPass = methods.JOPPublisher(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }System.out.println(methods.publisherList);
            }
            if(checkPass == 4){
                System.out.println(checkPass);
                isPass = methods.JOPRating(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }System.out.println(methods.ratingList);
            }
            if(checkPass == 5){
                System.out.println(checkPass);
                isPass = methods.JOPStok(indexAt);
                if(isPass){
                    break;
                }else{
                    checkPass--;
                }System.out.println(methods.stokList);
            }
        }
    }

    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                for(int i = 0; i < 4; i++){
                    // membuat data baru yang akan di set
                    // jika data judul lebih dari 0 maka data baru akan dihapus
                    // jika data judul 0 maka akan memaksa untuk memasukan data awal dulu
                    setMenu();
                }
            }
        });
    }
}
