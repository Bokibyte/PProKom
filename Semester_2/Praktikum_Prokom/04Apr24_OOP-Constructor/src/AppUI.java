import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AppUI{
    String option;
    private Tools tool = new Tools();

    public String getOption(){
        return this.option;
    }

    public void menu(){
        Object[] button = {"Masukan Data", "Tampilkan Data"};
        int n = JOptionPane.showOptionDialog(null, "Masukan atau Tampilkan Data", "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, button, null);
        if(n==0){
            this.option = "toEntry";
        }if(n==1){
            this.option = "toShow";
        }
    }

    public void menuEntry(){
        JPanel panel = new JPanel();

        JPanel NIMPanel = new JPanel();
        JLabel lblNIM = new JLabel("NIM   ");
        JTextField tfNIM = new JTextField(25);
        lblNIM.setLabelFor(tfNIM);
        NIMPanel.setLayout(new BorderLayout());
        NIMPanel.add(lblNIM, BorderLayout.WEST);
        NIMPanel.add(tfNIM, BorderLayout.EAST);

        JPanel NamaPanel = new JPanel();
        JLabel lblNama = new JLabel("Nama   ");
        JTextField tfNama = new JTextField(25);
        lblNama.setLabelFor(tfNama);
        NamaPanel.setLayout(new BorderLayout());
        NamaPanel.add(lblNama, BorderLayout.WEST);
        NamaPanel.add(tfNama, BorderLayout.EAST);

        JPanel alamatPanel = new JPanel();
        JLabel lblAlamat = new JLabel("Alamat   ");
        JTextArea taAlamat = new JTextArea(4, 25);
        JScrollPane spAlamat = new JScrollPane(taAlamat);
        taAlamat.setLineWrap(true);
        lblAlamat.setLabelFor(spAlamat);
        alamatPanel.setLayout(new BorderLayout());
        alamatPanel.add(lblAlamat, BorderLayout.WEST);
        alamatPanel.add(spAlamat, BorderLayout.EAST);

        JPanel jurusanPanel = new JPanel();
        JLabel lblJurusan = new JLabel("Jurusan   ");
        String[] jurusan = {"MTEMATIKA", "BIOLOGI", "KIMIA", "FISIKA", "TEKNIK INFORMATIKA", "TEKNIK ARSITEKTUR"};
        JComboBox jcbJurusan = new JComboBox<>(jurusan);
        lblJurusan.setLabelFor(jcbJurusan);
        jurusanPanel.setLayout(new BorderLayout());
        jurusanPanel.add(lblJurusan, BorderLayout.WEST);
        jurusanPanel.add(jcbJurusan, BorderLayout.EAST);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(NIMPanel);
        panel.add(NamaPanel);
        panel.add(alamatPanel);
        panel.add(jurusanPanel);
        Object[] option = {"Kirim", "Batal"};
        int n = JOptionPane.showOptionDialog(null, panel, "Form Data", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, option, 0);

        if(n==0){
            String checknim = tfNIM.getText();
            boolean isDigit = true;
            for(int i = 0; i < checknim.length(); i++){
                if(checknim.charAt(i) < '0' || checknim.charAt(i) > '9'){
                    isDigit = false;
                    break;
                }
            }
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
            this.option = "exit";
        }
    }
    
    public void menuShow(){
        
    }
}
