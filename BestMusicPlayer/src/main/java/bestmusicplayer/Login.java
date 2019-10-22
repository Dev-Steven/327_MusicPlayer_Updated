package bestmusicplayer;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*; 

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
    
    JSONArray accountList = new JSONArray();
    
    Gson gson = new Gson();
    GsonBuilder builder = new GsonBuilder();
    
    Object obj = new Object();
    DefaultListModel listModel;
    JList list;
    
    boolean success = false;
    
    public void logging_in(String email, String password, javax.swing.JPanel main, javax.swing.JPanel test, javax.swing.JScrollPane songListPane) 
    {
        
//        System.out.println("Entered Email: " + email);
//        System.out.println("Entered Password: " + password);
        
        //  reading file
        try
            {
                BufferedReader br = new BufferedReader(  
                new FileReader("accounts.json"));
//                System.out.print("\nReading the file...\n");
                accountList = gson.fromJson(br, JSONArray.class);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        
        // parsing
        
        for (int i = 0; i < accountList.size(); i++) {
            Object account = accountList.get(i);
            JSONObject object = new Gson().fromJson(new Gson().toJson(((LinkedTreeMap<String, Object>) account)), JSONObject.class);
            
            String getEmail = (String)object.get("email");
//            System.out.println("Email: " + getEmail);
            String getPassword = (String)object.get("_password");
//            System.out.println("Password: " + getPassword);
//            
            if(email.equals(getEmail) && password.equals(getPassword))
            {
//                System.out.println("Niiiicee!");
                success = true;
                
                main.removeAll();
                main.add(test);
                main.repaint();
                main.revalidate();
                
                Gson gson2 = new Gson();
                BufferedReader br = null;
                try {
    //                /Users/stevenchung/Documents/cecs_327/MusicPlayer/src/my/musicplayer/music.json
                br = new BufferedReader(new FileReader("music.json"));
                JsonPojo[] array = gson2.fromJson(br, JsonPojo[].class);

    //            DefaultListModel listModel; 
                listModel = new DefaultListModel();

    //            ArrayList<String> songs = new ArrayList<String>();
                for(JsonPojo jObj : array) {   
                   listModel.addElement(jObj.song.title + " - " + jObj.artist.name);
                }
                list = new JList(listModel);
                songListPane.setViewportView(list);
                } 

                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
        }
        if(!success)
        {
            JOptionPane.showMessageDialog(null, "Login Failure");
        }
    }
}
