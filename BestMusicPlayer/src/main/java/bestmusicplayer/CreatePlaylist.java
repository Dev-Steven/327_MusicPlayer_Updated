/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
    
    public boolean create_playlist(User user, String playlistName, String playlistDescription)

    {
        if(!playlistName.isEmpty())
        {
            System.out.print("playlist name isn't empty, check passed");
            


            Playlist playlist = new Playlist(user, playlistName, playlistDescription);
            //playlistDetails.put("Name: " + playlistName, "Description: " + playlistDescription);>>>>>>> f6334f54aea92e1929c3d66ceb9c00e5fd78b594:BestMusicPlayer/src/main/java/bestmusicplayer/CreatePlaylist.java

            //  adding the playlist details to the account object
            
            //playlistObject.put("playlist", playlistDetails);

            //  making a JSON array
            
            //  adding accountObject to array
            playlistList.add(playlist);

         

            //  writing to JSON file, 
            //  the true parameter makes it so the file is not overwritten
            try (FileWriter file = new FileWriter("playlists.json"))
            {
                gson = builder.setPrettyPrinting().create();
                //  might have to add check to see if file exists
                
                //  need to figure out how to add to already existing array
                //  not create a new one every time
                System.out.print("\nwriting to playlists.json");
                gson.toJson(playlistList, JSONArray.class, file);
                //file.write(playlistList.toJSONString());
                file.flush();   
            }
            catch(IOException e)
            {
              e.printStackTrace();
            }
            
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
