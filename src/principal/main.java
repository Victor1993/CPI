package principal;

import clases.DataConnection;
import javax.swing.UIManager;

public class main {

    public static void main(String[] args) {
        try{            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            DataConnection.getInstance();
            jfLogin miLogin = new jfLogin();
            miLogin.setLocationRelativeTo(null);
            miLogin.setVisible(true);
	}catch(Exception e){
            e.printStackTrace();
	}        
    }
    
}
