import javax.swing.JOptionPane;

public class App {
    static AppMethods methods = new AppMethods();
    static String input;

    // kumpulan method untuk menampilkan menu
    // sengaja dibuat untuk mengatasi umpan balik tombol cancel
    public static boolean judulMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        input = JOptionPane.showInputDialog(null, "Masukan VCD anda: ", "Menu Judul", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            if(methods.getSize() == 0){
                JOptionPane.showMessageDialog(null, "Minimal ada 1 data!", "Perhatian", JOptionPane.WARNING_MESSAGE);
                isPass = false;
            }
            isPass = false;
        }else if(!isCancel){
            methods.addJudul(input);
            isPass = true;
        }else{
            methods.addJudul(input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean aktorMenu(){
        boolean isPass = false;
        input = JOptionPane.showInputDialog(null, "Masukan aktor-aktornya: ", "Menu aktor", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else{
            methods.addAktor(input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean sutradaraMenu(){
        boolean isPass = false;
        input = JOptionPane.showInputDialog(null, "Masukan Sutradaranya: ", "Menu Sutradara", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else{
            methods.addSutradara(input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean publisherMenu(){
        boolean isPass = false;
        input = JOptionPane.showInputDialog(null, "Masukan Publishernya: ", "Menu Publisher", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else{
            methods.addPublisher(input);
            isPass = true;
        }
        return isPass;
    }
    
    public static boolean ratingMenu(){
        boolean isPass = false;
        input = String.valueOf(JOptionPane.showOptionDialog(null, "Pilih rating VCD: ", "Rating Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, methods.kategoriList, methods.kategoriList[0]));
        if(input == null){
            isPass = false;
        }else{
            methods.addRating(Integer.parseInt(input));
            isPass = true;
        }
        return isPass;
    }

    public static boolean stokMenu(){
        boolean isPass = false;
        while(true){
            input = JOptionPane.showInputDialog(null, "Masukan stok VCD: ", "Menu Stok", JOptionPane.QUESTION_MESSAGE);
            try{
                if(input == null){
                    isPass = false;
                }else{
                    methods.addStok(Integer.parseInt(input));
                    isPass = true;
                }
                return isPass;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input invalid!", "Check Menu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int indexEdit = 0;
        boolean menuPass = false;

        while(true){
            indexEdit = methods.getSize();
            while(true){
                menuPass = judulMenu();
                if(menuPass){
                    menuPass = aktorMenu();
                }else{
                    break;
                }if (menuPass){
                    menuPass = sutradaraMenu();
                }if (menuPass){
                    menuPass = publisherMenu();
                }if (menuPass){
                    menuPass = ratingMenu();
                }if (menuPass){
                    menuPass = stokMenu();
                }if (menuPass){
                    break;
                }
            }
            break;
        }
    }
}
