import javax.swing.JOptionPane;

public class App {
    static AppMethods methods = new AppMethods();
    static String input;

    public static void judulMenu(){
        input = JOptionPane.showInputDialog(null, "Masukan VCD anda: ", "Menu Judul", JOptionPane.PLAIN_MESSAGE);
        methods.addJudul(input);
    }
    public static void aktorMenu(){
        input = JOptionPane.showInputDialog(null, "Masukan aktor-aktornya: ", "Menu aktor", JOptionPane.QUESTION_MESSAGE);
        methods.addAktor(input);
    }
    public static void sutradaraMenu(){
        input = JOptionPane.showInputDialog(null, "Masukan Sutradaranya: ", "Menu Sutradara", JOptionPane.QUESTION_MESSAGE);
        methods.addSutradara(input);
    }
    public static void publisherMenu(){
        input = JOptionPane.showInputDialog(null, "Masukan Publishernya: ", "Menu Publisher", JOptionPane.QUESTION_MESSAGE);
        methods.addPublisher(input);
    }
    public static void ratingMenu(){
        input = String.valueOf(JOptionPane.showOptionDialog(null, "Pilih rating VCD: ", "Rating Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, methods.kategoriList, methods.kategoriList[0]));
        methods.addRating(Integer.parseInt(input));
    }
    public static void stokMenu(){
        while(true){
            input = JOptionPane.showInputDialog(null, "Masukan stok VCD: ", "Menu Stok", JOptionPane.QUESTION_MESSAGE);
            try{
                methods.addStok(Integer.parseInt(input));
                break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input invalid!", "Check Menu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) throws Exception {

    }
}
