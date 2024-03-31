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
            methods.setJudul(editIndex, input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean aktorMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        input = JOptionPane.showInputDialog(null, "Masukan aktor-aktornya: ", "Menu aktor", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else if(!isCancel){
            methods.addAktor(input);
            isPass = true;
        }else{
            methods.setAktor(editIndex, input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean sutradaraMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        input = JOptionPane.showInputDialog(null, "Masukan Sutradaranya: ", "Menu Sutradara", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else if(!isCancel){
            methods.addSutradara(input);
            isPass = true;
        }else{
            methods.setSutradara(editIndex, input);
            isPass = true;
        }
        return isPass;
    }

    public static boolean publisherMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        input = JOptionPane.showInputDialog(null, "Masukan Publishernya: ", "Menu Publisher", JOptionPane.QUESTION_MESSAGE);
        if(input == null){
            isPass = false;
        }else if(!isCancel){
            methods.addPublisher(input);
            isPass = true;
        }else{
            methods.setPublisher(editIndex, input);
            isPass = true;
        }
        return isPass;
    }
    
    public static boolean ratingMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        input = String.valueOf(JOptionPane.showOptionDialog(null, "Pilih rating VCD: ", "Rating Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, methods.kategoriList, methods.kategoriList[0]));
        if(input == null){
            isPass = false;
        }else if(!isCancel){
            methods.addRating(Integer.parseInt(input));
            isPass = true;
        }else{
            methods.setRating(editIndex, editIndex);
            isPass = true;
        }
        return isPass;
    }

    public static boolean stokMenu(int editIndex){
        boolean isPass = false;
        boolean isCancel = false;
        while(true){
            input = JOptionPane.showInputDialog(null, "Masukan stok VCD: ", "Menu Stok", JOptionPane.QUESTION_MESSAGE);
            try{
                if(input == null){
                    isPass = false;
                }else if(!isCancel){
                    methods.addStok(Integer.parseInt(input));
                    isPass = true;
                }else{
                    methods.setStok(editIndex, Integer.parseInt(input));
                    isPass = true;
                }
                return isPass;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input invalid!", "Check Menu", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void runMenu(){
        int indexEdit = 0;
        boolean menuPass = false;
        while(true){
            indexEdit = methods.getSize();
            while(true){
                menuPass = judulMenu(indexEdit);System.out.println(methods.judulList);
                if(menuPass){
                    menuPass = aktorMenu(indexEdit);System.out.println(methods.aktorList);
                }else{
                    break;
                }if (menuPass){
                    menuPass = sutradaraMenu(indexEdit);System.out.println(methods.sutradaraList);
                }if (menuPass){
                    menuPass = publisherMenu(indexEdit);System.out.println(methods.publisherList);
                }if (menuPass){
                    menuPass = ratingMenu(indexEdit);System.out.println(methods.ratingList);
                }if (menuPass){
                    menuPass = stokMenu(indexEdit);System.out.println(methods.ratingList);
                }if (menuPass){
                    break;
                    
                }
            }
            break;
        }
    }

    public static void main(String[] args) throws Exception {
        runMenu();
        
    }
}
