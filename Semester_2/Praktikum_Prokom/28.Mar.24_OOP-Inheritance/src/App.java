import javax.swing.JOptionPane;

public class App {

    public static void addMenu(){
        AppMethods methods = new AppMethods();
        String input = "";
        boolean passCheck = false;

        input = JOptionPane.showInputDialog(null, "Masukan VCD anda: ", "Menu Judul", JOptionPane.QUESTION_MESSAGE);
        methods.addJudul(input);
        input = JOptionPane.showInputDialog(null, "Masukan aktor-aktornya: ", "Menu aktor", JOptionPane.QUESTION_MESSAGE);
        methods.addAktor(input);
        input = JOptionPane.showInputDialog(null, "Masukan Sutradaranya: ", "Menu Sutradara", JOptionPane.QUESTION_MESSAGE);
        methods.addSutradara(input);
        input = JOptionPane.showInputDialog(null, "Masukan Publishernya: ", "Menu Publisher", JOptionPane.QUESTION_MESSAGE);
        methods.addPublisher(input);
        input = String.valueOf(JOptionPane.showOptionDialog(null, "Pilih rating VCD: ", "Rating Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, methods.kategoriList, methods.kategoriList[0]));
        methods.addRating(Integer.parseInt(input));

        while(!passCheck){
            try{
                input = JOptionPane.showInputDialog(null, "Masukan stok VCD anda: ", "Menu Stok", JOptionPane.QUESTION_MESSAGE);
                methods.addStok(Integer.parseInt(input));
                if(Integer.parseInt(input) != JOptionPane.CLOSED_OPTION){
                    methods.addStok(0);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input bukan integer!", "Checking Menu", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
    }

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 5; i++){
            addMenu();
        }

        
    }
}
