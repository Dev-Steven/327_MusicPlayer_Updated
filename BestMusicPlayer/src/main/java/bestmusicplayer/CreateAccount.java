/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CreateAccount {
    
    boolean accountCreated = false;
    JSONObject accountDetails = new JSONObject();
    JSONObject accountObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray accountList = new JSONArray();
    JsonArray gsonList = new JsonArray();
    
    Gson gson = new Gson();
    GsonBuilder builder = new GsonBuilder();
    
    public void reader(String fileToRead, JSONArray theList){
        try
        {
            BufferedReader br = new BufferedReader(  
            new FileReader(fileToRead));
            System.out.print("\nReading the file...\n");
            theList = gson.fromJson(br, JSONArray.class);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void writer(String fileToWrite, JSONArray theList){
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
    
    public boolean creating_account(String email, String password, String confirmPassword) throws FileNotFoundException
    {    
        if(!email.isEmpty() && !password.isEmpty() && password.equals(confirmPassword) )
        {
            System.out.print("all fields pass check");
            
            //  Read the file
            //  When I try to call this function the file does not get read when starting a new session
            //  reader("accounts.json", accountList);
            try
            {
                BufferedReader br = new BufferedReader(  
                new FileReader("accounts.json"));
                System.out.print("\nReading the file...\n");
                accountList = gson.fromJson(br, JSONArray.class);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            //  Creating a user object
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
    
}
