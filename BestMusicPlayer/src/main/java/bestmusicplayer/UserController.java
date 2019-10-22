/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.internal.LinkedTreeMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Juan
 */
public class UserController {
    
    boolean accountCreated = false;
    JSONObject accountDetails = new JSONObject();
    JSONObject accountObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray accountList = new JSONArray();
    JsonArray gsonList = new JsonArray();
    
    Gson gson = new Gson();
    GsonBuilder builder = new GsonBuilder();
    
    boolean success = false;
    
    public void reader(String fileToRead){
        try
        {
            BufferedReader br = new BufferedReader(  
            new FileReader(fileToRead));
            System.out.print("\nReading the file...\n");
            accountList = gson.fromJson(br, JSONArray.class);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    private void writer(String fileToWrite, JSONArray theList){
        try (FileWriter file = new FileWriter(fileToWrite))
            {
                gson = builder.setPrettyPrinting().create();
                System.out.print("\nwriting to accounts.json");
                gson.toJson(theList, JSONArray.class, file);
                //file.write(playlistList.toJSONString());
                file.flush();   
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
    }
    
    public boolean createAccount(String email, String password, String confirmPassword) throws FileNotFoundException
    {    
        if(!email.isEmpty() && !password.isEmpty() && password.equals(confirmPassword) )
        {
            System.out.print("all fields pass check");
            
            //  Read the file
            //  When I try to call this function the file does not get read when starting a new session
            //  reader("accounts.json", accountList);
            reader("accounts.json");

            User user = new User(email,password);
            
            //  Adding object to list
            accountList.add(user);
            
            //  writing to JSON file, 
            writer("accounts.json",accountList);
            
            accountCreated = true;
            return accountCreated;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "All fields required or passwords don't match!");
            return accountCreated;
        }
    }
    
    public boolean logging_in(String email, String password, javax.swing.JPanel main, javax.swing.JPanel test) 
    {
        System.out.println("Entered Email: " + email);
        System.out.println("Entered Password: " + password);
        
        //  reading file
        reader("accounts.json");
        
        // parsing
        
        for (int i = 0; i < accountList.size(); i++) {
            Object account = accountList.get(i);
            JSONObject object = new Gson().fromJson(new Gson().toJson(((LinkedTreeMap<String, Object>) account)), JSONObject.class);
            
            String getEmail = (String)object.get("email");
            System.out.println("Email: " + getEmail);
            String getPassword = (String)object.get("_password");
            System.out.println("Password: " + getPassword);
            
            if(email.equals(getEmail) && password.equals(getPassword))
            {
                System.out.println("Niiiicee!");
                success = true;
                
                main.removeAll();
                main.add(test);
                main.repaint();
                main.revalidate();
                
                return success;
            }
            
        }
        if(!success)
        {
            JOptionPane.showMessageDialog(null, "Login Failure");
            return success;
        }
        return success;
    }
}