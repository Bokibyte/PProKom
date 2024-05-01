import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws Exception {
        
        AppUI AppGUI = new AppUI();

        SwingUtilities.invokeLater(() -> {
            AppGUI.menu();
        });
    }
}
