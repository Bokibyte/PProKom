import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class App {
    // inisialisasi kelas method agar bisa dipakai
    // biasanya bisa pakai interface + implements kalo cuma "pinjem alat"
    private static AppMethods methods = new AppMethods();

    // sengaja dibuat untuk mengatasi umpan balik tombol cancel
    // jika return null, maka menu input sebelumnya akan kembali
    // biasanya terjadi jika memilih opsi cancel atau close button

    // method untuk mengecek apakah menu sudah diinput
    // dan mengembalikan poin jika menu sudah diinput
    public static int count(boolean isPass, int passCount){
        int count = passCount;
        if(isPass){
            count++;
        }else{
            count++;
        }
        return count;
    }

    // method untuk menampilkan menu
    public static void setMenu(){

        // var meneteksi jika pengguna menginputkan sesuatu
        boolean isPass = false;

        // var menghitung jumlah masukan
        int checkPass = 0;

        // mengambil index ke x untuk mengedit data baru
        int indexAt = methods.getSize();

        // membuat data baru yang akan di set
        methods.addData();
        
        // membuat pengulangan untuk loop menu agar bisa menampilkan kembali menu
        // loop berhenti saat 6 menu sudah dimasukan input
        // if else dibawaah digunakan untuk menskip menu input yang sudah diisi sebelumnya
        while(checkPass < 6){
            if(checkPass == 0){
                isPass = methods.JOPJudul(indexAt);
                if(isPass){
                    checkPass++;
                }else{

                    // jika jumlah data hanya 1 maka akan mencegah untuk tidak input
                    // jika jumlah data lebih dari 1 maka akan menghapus "plain data"
                    // jadi, jika kita cancel terus maka data yang tadi ingin dimasukan tidak akan dimasukan
                    // alternatif cara ini dengan konsep temp. karena sudah terlanjur ini yauda deh hehe
                    if(methods.judulList.size() == 1){
                        JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }else{
                        methods.removeData(indexAt);
                    }
                }
            }
            if(checkPass == 1){
                isPass = methods.JOPAktor(indexAt);
                checkPass = count(isPass, checkPass);
            }
            if(checkPass == 2){
                isPass = methods.JOPSutradara(indexAt);
                checkPass = count(isPass, checkPass);
            }
            if(checkPass == 3){
                isPass = methods.JOPPublisher(indexAt);
                checkPass = count(isPass, checkPass);
            }
            if(checkPass == 4){
                isPass = methods.JOPRating(indexAt);
                checkPass = count(isPass, checkPass);
            }
            if(checkPass == 5){
                isPass = methods.JOPStok(indexAt);
                checkPass = count(isPass, checkPass);
            }
        }
    }

    // method untuk menampilkan data
    // menerima parameter berupa int sebagai index data
    public static void showData(int index){
        System.out.print("========================================================");
        System.out.println("\r==| Movie ke-"+(index+1)+" |");
        System.out.println();
        System.out.println(" Judul \t\t: "+methods.getJudul(index));
        System.out.println(" Aktor \t\t: "+methods.getAktor(index));
        System.out.println(" Sutradara \t: "+methods.getSutradara(index));
        System.out.println(" Publisher \t: "+methods.getPublisher(index));
        System.out.println(" Rating \t: "+methods.getRating(index));
        System.out.println(" Stok \t\t: "+methods.getStok(index));
        System.out.println("\n========================================================");
    }

    
    public static void main(String[] args) throws Exception {

        // fungsi ini berguna suapaya misahin thread main ke thread EDI
        // kalo ga di pisahin nanti bakal ada bug, ga stabil biasanya #cmiiw
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){

                // var loop diisi dengan jumlah data pertama yang ingin dimasukan
                int loop = 2;
                for(int i = 0; i < loop; i++){
                    setMenu();
                }

                // loop untuk menampilkan data
                System.out.println("<| Rental VCD |>");
                for(int i = 0; i < methods.getSize(); i++){
                    showData(i);
                }
            }
        });
    }
}

// Selesai ~~ robust lv 5
