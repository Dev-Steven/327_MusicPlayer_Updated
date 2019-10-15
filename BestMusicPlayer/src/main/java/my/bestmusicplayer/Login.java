package my.bestmusicplayer;


import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stevenchung
 */
// this function will be called from the NewMainJFrame class.
// it will just grab the data from the Login form once the button is pressed
public class Login {
    String email = "";
    String password = "";
    
    public void view_homePage(javax.swing.JPanel main, javax.swing.JPanel homePage)
    {
        main.removeAll();
        main.add(homePage);
        main.repaint();
        main.revalidate();
    }
    
    public void logging_in(String email, String password, javax.swing.JPanel main, javax.swing.JPanel test)
    {
        if(email.equals("email") && password.equals("password"))
        {
            // Alerts user
            JOptionPane.showMessageDialog(null, "Login Successful");
            
            //  use email and password to search for the correct information
            //  on the JSON file then grab proper data
            
            //  first account
            
            // Using card layout, switches panels when Login successful
            main.removeAll();
            main.add(test);
            main.repaint();
            main.revalidate();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Failure");
        }
    }
}
