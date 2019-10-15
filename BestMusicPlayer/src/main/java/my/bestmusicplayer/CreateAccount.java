/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bestmusicplayer;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author stevenchung
 */
public class CreateAccount {
    
//  When I add the following line it prevents the program from running!
//  NewMainJFrame MainObj = new NewMainJFrame();
    boolean accountCreated = false;
    JSONObject accountDetails = new JSONObject();
    JSONObject accountObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray accountList = new JSONArray();
    
    public void view_create(javax.swing.JPanel main, javax.swing.JPanel createPage)
    {
        main.removeAll();
        main.add(createPage);
        main.repaint();
        main.revalidate();
    }
    
    public boolean creating_account(String email, String password, String confirmPassword)
    {
        
        if(!email.isEmpty() && !password.isEmpty() && password.equals(confirmPassword) )
        {
            System.out.print("all fields pass check");
            
            
            accountDetails.put("email: " + email, "password: " + password);

            //  adding the account details to the account object
            
            accountObject.put("account", accountDetails);

            //  making a JSON array
            
            //  adding accountObject to array
            accountList.add(accountObject);
            
         

            //  writing to JSON file, 
            //  the true parameter makes it so the file is not overwritten
            try (FileWriter file = new FileWriter("accounts.json", true))
            {
                //  might have to add check to see if file exists
                
                //  need to figure out how to add to already existing array
                //  not create a new one every time
                System.out.print("writing to accounts.json");
                file.write(accountList.toJSONString());
                file.flush();   
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
            
            accountCreated = true;
            return accountCreated;
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "All fields required or passwords don't match!");
            return accountCreated;
        }
    }
    
}
