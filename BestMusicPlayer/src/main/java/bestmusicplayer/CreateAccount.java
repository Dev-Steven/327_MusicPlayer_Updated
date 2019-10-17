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
    
//  When I add the following line it prevents the program from running!
//  NewMainJFrame MainObj = new NewMainJFrame();
    boolean accountCreated = false;
    JSONObject accountDetails = new JSONObject();
    JSONObject accountObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray accountList = new JSONArray();
    JsonArray gsonList = new JsonArray();
    
    Gson gson = new Gson();
    GsonBuilder builder = new GsonBuilder();
    
    public void reader(String fileToRead){
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
    }
    
    public boolean creating_account(String email, String password, String confirmPassword) throws FileNotFoundException
    {    
        if(!email.isEmpty() && !password.isEmpty() && password.equals(confirmPassword) )
        {
            System.out.print("all fields pass check");
            
            //  Read the file
            
            
            
            User user = new User(email,password);
            
            //  Adding newly created user to the array accountList
            accountList.add(user);
            
            //  writing to JSON file, 
            //  the true parameter makes it so the file is not overwritten
            try (FileWriter file = new FileWriter("accounts.json"))
            {
                gson = builder.setPrettyPrinting().create();
                //  might have to add check to see if file exists
                
                //  need to figure out how to add to already existing array
                //  not create a new one every time
                System.out.print("\nwriting to accounts.json");
                gson.toJson(accountList, JSONArray.class, file);
                //file.write(playlistList.toJSONString());
                file.flush();   
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
            
            accountCreated = true;
            return accountCreated;
        }
            
            
            //  Older stuff below this point

//            gson = builder.setPrettyPrinting().create();
//
//            //  writing to JSON file, 
//            //  the true parameter makes it so the file is not overwritten
//            try (FileWriter file = new FileWriter("accounts.json"))
//            {
//                //  might have to add check to see if file exists
//                //Adds to array
//                User[] userList = JsonArrayHandler.createUserArray("accounts.json");
//                for(User obj : userList) 
//                {
//                    gsonList.add(gson.toJson(obj));
//                }
//                accountList.add(gson.toJson(user, User.class));
//
//                System.out.print("writing to accounts.json");
//
//                gson.toJson(gsonList, file);
//                gson.toJson(userList, User[].class, file);
//                //gson.toJson(user, User.class, file);
//                file.flush();   
//            }
//            catch(IOException e)
//            {
//              e.printStackTrace();
//            }
//            
//            accountCreated = true;
//            return accountCreated;
//            
//        }
        else
        {
            JOptionPane.showMessageDialog(null, "All fields required or passwords don't match!");
            return accountCreated;
        }
    }
    
}
