/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CreatePlaylist {
    
    boolean playlistCreated = false;
    JSONObject playlistDetails = new JSONObject();
    JSONObject playlistObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray playlistList = new JSONArray();
    

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
            System.out.print("\nwriting to playlists.json");
            gson.toJson(theList, JSONArray.class, file);
            //file.write(playlistList.toJSONString());
            file.flush();   
        }
        catch(IOException e)
        {
          e.printStackTrace();
        }
    }
    
    public boolean create_playlist(User user, String playlistName, String playlistDescription)

    {
        if(!playlistName.isEmpty())
        {
            System.out.print("playlist name isn't empty, check passed");
            
            //  reading the file
            //  When I try to call this function the file does not get read when starting a new session
            //  reader("playlists.json", playlistList);
            try
            {
                BufferedReader br = new BufferedReader(  
                new FileReader("playlists.json"));
                System.out.print("\nReading the file...\n");
                playlistList = gson.fromJson(br, JSONArray.class);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
           
            //  Creating a playlist object
            Playlist playlist = new Playlist(user, playlistName, playlistDescription);
            
            //  Adding object to the list
            playlistList.add(playlist);

            //  writing to JSON file, 
            writer("playlists.json", playlistList);
            
            playlistCreated = true;
            return playlistCreated;
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Name field required!");
            return playlistCreated;
        }
    }
}
