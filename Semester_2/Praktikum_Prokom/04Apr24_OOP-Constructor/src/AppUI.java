import javax.swing.JFrame;
import javax.swing.JPanel;


public class AppUI{
    JFrame frame;
    JPanel panel;

    public void menu(){
        frame.setTitle("Menu");
        frame.pack();

        panel.setSize(500, 600);
        
        frame.add(panel);
    }

    public void menuAdd(){
        frame.setTitle("Tambah Data");
        frame.pack();

        panel.setSize(500, 600);
        
        frame.add(panel);
    }
    
    public void menuShow(){
        frame.setTitle("Tampilkan Data");
        frame.pack();

        panel.setSize(500, 600);
        
        frame.add(panel);
    }
}
