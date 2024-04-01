import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {

    // kumpulan method untuk menampilkan menu
    // sengaja dibuat untuk mengatasi umpan balik tombol cancel

    public static void setMenu(){
        AppMethods methods = new AppMethods();
        boolean isPass = false;
        int checkPass = 0;

        // membuat data baru yang akan di set
        // jika data judul lebih dari 0 maka data baru akan dihapus
        // jika data judul 0 maka akan memaksa untuk memasukan data awal dulu
        methods.addData();
        int indexAt = methods.getSize()-1;
        while(checkPass != 6){
            System.out.println(methods.judulList +"  "+methods.getSize());
            if(checkPass == 0){System.out.println(checkPass);
               isPass = methods.JOPJudul(indexAt);
               if(isPass){
                checkPass++;
               }else{
                if(methods.judulList.size() == 1){
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }else{
                    methods.removeData(indexAt);
                }
               }
            }
            if(checkPass == 1){System.out.println(checkPass);
                isPass = methods.JOPAktor(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }
            }
            if(checkPass == 2){System.out.println(checkPass);
                isPass = methods.JOPSutradara(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }
            }
            if(checkPass == 3){System.out.println(checkPass);
                isPass = methods.JOPPublisher(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }
            }
            if(checkPass == 4){System.out.println(checkPass);
                isPass = methods.JOPRating(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }
            }
            if(checkPass == 5){System.out.println(checkPass);
                isPass = methods.JOPStok(indexAt);
                if(isPass){
                    checkPass++;
                }else{
                    checkPass--;
                }
            }
        }
    }

    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                for(int i = 0; i < 4; i++){
                    setMenu();
                   
                }
            }
        });
    }
}
