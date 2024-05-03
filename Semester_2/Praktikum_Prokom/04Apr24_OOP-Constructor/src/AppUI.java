import javax.swing.*;
import java.awt.*;


// Opsional
public class AppUI{

    // Membuat variabel instance untuk opsi yang dikeluarkan setiap GUI
    String option;

    // Membuat objek untuk kelas Tools yang berisi method
    private Tools tool = new Tools();

    // Method mengambil variabel option
    // Merupakan hasil opsi keluaran method GUI dibawah
    public String getOption(){
        return this.option;
    }

    // Method menu awal
    // Berisi opsi untuk ke menu memasukan data, menampilkan data, dan keluar
    public void menu(){
        Object[] button = {"Masukan Data", "Tampilkan Data"};
        int n = JOptionPane.showOptionDialog(null, "Masukan atau Tampilkan Data", "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, button, null);

        // variabel n mengembalikan nilai integer sesuai index variabel button diatas\
        // variabel n mengembalikan -1 jika menekan button x (close window)
        if(n==0){
            this.option = "toEntry";
        }if(n==1){
            this.option = "toShow";
        }if(n==-1){
            this.option = "exit";
        }
    }

    // Method menu memasukan data
    public void menuEntry(){
        // Membuat JPanel dasar
        JPanel panel = new JPanel();

        // Dibawah ini merupakan bagian JPanel
        // berisi komponen JLabel, JTextField, JTextArea, JComboBox dan JScrollPane
        // JLabel untuk label, JTextField untuk kolom isi, JTextArea untuk kolom alamat
        // JComboBox untuk pilihan beropsi, JScrollPane untuk menampung banyak komponen agar bisa di scroll
        // BorderLayout merupakan opsi layout (banyak layout lain tapi baiknya lihat di javapoint atau orcale)

        // Bagian NIM
        JPanel NIMPanel = new JPanel();
        JLabel lblNIM = new JLabel("NIM   ");
        JTextField tfNIM = new JTextField(25);
        lblNIM.setLabelFor(tfNIM);
        NIMPanel.setLayout(new BorderLayout());
        NIMPanel.add(lblNIM, BorderLayout.WEST);
        NIMPanel.add(tfNIM, BorderLayout.EAST);

        // Bagian Nama
        JPanel NamaPanel = new JPanel();
        JLabel lblNama = new JLabel("Nama   ");
        JTextField tfNama = new JTextField(25);
        lblNama.setLabelFor(tfNama);
        NamaPanel.setLayout(new BorderLayout());
        NamaPanel.add(lblNama, BorderLayout.WEST);
        NamaPanel.add(tfNama, BorderLayout.EAST);

        // Bagian Alamat
        JPanel alamatPanel = new JPanel();
        JLabel lblAlamat = new JLabel("Alamat   ");
        JTextArea taAlamat = new JTextArea(4, 25);
        JScrollPane spAlamat = new JScrollPane(taAlamat);
        taAlamat.setLineWrap(true);
        lblAlamat.setLabelFor(spAlamat);
        alamatPanel.setLayout(new BorderLayout());
        alamatPanel.add(lblAlamat, BorderLayout.WEST);
        alamatPanel.add(spAlamat, BorderLayout.EAST);

        // Bagian Jurusan
        JPanel jurusanPanel = new JPanel();
        JLabel lblJurusan = new JLabel("Jurusan   ");
        String[] jurusan = {"MATEMATIKA", "BIOLOGI", "KIMIA", "FISIKA", "TEKNIK INFORMATIKA", "TEKNIK ARSITEKTUR"};
        JComboBox<String> jcbJurusan = new JComboBox<>(jurusan);
        lblJurusan.setLabelFor(jcbJurusan);
        jurusanPanel.setLayout(new BorderLayout());
        jurusanPanel.add(lblJurusan, BorderLayout.WEST);
        jurusanPanel.add(jcbJurusan, BorderLayout.EAST);

        // Memasukan bagian bagian panel ke panel dasar
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(NIMPanel);
        panel.add(NamaPanel);
        panel.add(alamatPanel);
        panel.add(jurusanPanel);
        Object[] option = {"Kirim", "Batal"};
        int n = JOptionPane.showOptionDialog(null, panel, "Form Data", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, 0);

        // Pengkondisian sesuai hasil variabel n
        if(n==0){

            // Melakukan cek apakah NIM angka atau bukan
            String checknim = tfNIM.getText();
            boolean isDigit = true;
            for(int i = 0; i < checknim.length(); i++){
                if(checknim.charAt(i) < '0' || checknim.charAt(i) > '9'){
                    isDigit = false;
                    break;
                }
            }

            // Pengkondisian apakah NIM angka atau bukan
            // Hasil akan menggantikan variabel option yang akan digunakan untuk operasi selanjutnya
            if(isDigit){
                tool.addNIM(tfNIM.getText());
                tool.addNama(tfNama.getText());
                tool.addAlamat(taAlamat.getText());
                tool.addJurusan((String) jcbJurusan.getSelectedItem());
                this.option = "next";

                JOptionPane.showMessageDialog(null, "Data Ditambahkan", "Info", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "NIM Tidak Valid", "Check", JOptionPane.WARNING_MESSAGE);
                this.option = "next";
            }
        }else{
            this.option = "close";
        }
    }
    
    // Method menampilkan data yang sudah dimasukan
    public void menuShow(){

        // Pengkondisian jika data kosong atau tidak
        if(!tool.isEmpty()){
            JPanel panel = new JPanel();
            JTextArea jtList = new JTextArea(30, 50);
            JScrollPane scList = new JScrollPane();
            
            // Mencetak template dengan data sesuai index hingga akhir data
            // Lalu dimasukan ke jtList
            for(int i = 0; i < tool.getSize(); i++){
                String template =
                    "\n "+(i+1)+").\tNIM\t: "+tool.getNIM(i)+
                    "\n\tNama\t: "+tool.getNama(i)+
                    "\n\tAlamat\t: "+tool.getAlamat(i)+
                    "\n\tJurusan\t: "+tool.getJurusan(i)+"\n";
                jtList.append(template);
            }

            // Mengaktifkan line warp dan menonaktifkan edit lalu ditambah ke scList
            jtList.setLineWrap(false);
            jtList.setEditable(false);
            scList.add(jtList);

            // Setting ukuran panel dasar
            panel.setSize(500, 800);

            // Memasukan bagian lain ke panel dasar
            panel.add(scList);
    
            // Setting opsi tutup
            String[] option = {"Tutup"};
            JOptionPane.showOptionDialog(null, panel, "Data List", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, 0);
            
        }else{

            // Jika data kosong
            JOptionPane.showMessageDialog(null, "Data Kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
}