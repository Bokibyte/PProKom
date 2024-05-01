import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;


public class AppUI{
    JFrame frame;
    JPanel panel;
    String option;

    public AppUI(){
        frame = new JFrame();
        panel = new JPanel();
    }

    public String menu(){
        frame.setTitle("Menu");

        JButton toEntry = new JButton("Masukan Data");
        JButton toShow = new JButton("Tampilkan Data");

        panel.setSize(500, 100);
        panel.setLayout(new GridLayout());
        panel.add(toEntry);
        panel.add(toShow);
        
        frame.add(panel);
        frame.setSize(500, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toEntry.addActionListener(e -> {
            option = "EntryMenu";
            frame.dispose();
        });
        toShow.addActionListener(e -> {
            option = "ShowMenu";
            frame.dispose();
        });
        return option;
    }

    public void menuAdd(){
        
    }
    
    public void menuShow(){
        
    }
}
