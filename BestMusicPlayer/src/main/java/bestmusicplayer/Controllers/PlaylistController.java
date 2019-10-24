/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer.Controllers;

import bestmusicplayer.Playlist;
import bestmusicplayer.User;
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
import java.util.Iterator; 
import java.util.Map; 

/**
 *
 * @author Juan
 */
public class PlaylistController {
    
    boolean playlistCreated = false;
     
    JSONObject playlistDetails = new JSONObject();
    JSONObject playlistObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray playlistList = new JSONArray();
    ArrayList<String> playLists = new ArrayList<>();

    Gson gson = new Gson();
    GsonBuilder builder = new GsonBuilder();
    
    public void reader(String fileToRead){
        try
        {
            BufferedReader br = new BufferedReader(  
            new FileReader(fileToRead));
            System.out.print("\nReading the file...\n");
            playlistList = gson.fromJson(br, JSONArray.class);
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
    
    public boolean createPlaylist(User user, String playlistName, String playlistDescription, ArrayList<String> songs)
    {
        if(!playlistName.isEmpty())
        {
            System.out.print("playlist name isn't empty, check passed");
            
            reader("playlists.json");
            
            Playlist playlist = new Playlist(user, playlistName, playlistDescription, songs);

            playlistList.add(playlist);
 
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
    
    public ArrayList<String> getPlaylist(User user) throws Exception
    {   
        reader("playlists.json");

        Iterator itr  = playlistList.iterator();
        Iterator<Map.Entry> itr1;
        
        while(itr.hasNext())
        {
            itr1 = ((Map) itr.next()).entrySet().iterator();
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next();
                if(pair.getKey().equals("playListName"))
                {
//                    System.out.println("found name: " + pair.getValue());
                    playLists.add((String)pair.getValue());
                } 
            }

        }

        return playLists;
    }
    
    
}
