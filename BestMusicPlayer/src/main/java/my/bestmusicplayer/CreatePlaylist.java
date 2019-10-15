/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bestmusicplayer;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author stevenchung
 */
public class CreatePlaylist {
    
    boolean playlistCreated = false;
    JSONObject playlistDetails = new JSONObject();
    JSONObject playlistObject = new JSONObject();
    JSONParser jsonParser = new JSONParser();
    JSONArray playlistList = new JSONArray();
    
    public void view_createPlaylist(javax.swing.JPanel main, javax.swing.JPanel createPlaylist)
    {
        main.removeAll();
        main.add(createPlaylist);
        main.repaint();
        main.revalidate();
    }
    
    public boolean create_playlist(String playlistName, String playlistDescription)
    {
        if(!playlistName.isEmpty())
        {
            System.out.print("playlist name isn't empty, check passed");
            
            
            playlistDetails.put("Name: " + playlistName, "Description: " + playlistDescription);

            //  adding the account details to the account object
            
            playlistObject.put("playlist", playlistDetails);

            //  making a JSON array
            
            //  adding accountObject to array
            playlistList.add(playlistObject);
            
         

            //  writing to JSON file, 
            //  the true parameter makes it so the file is not overwritten
            try (FileWriter file = new FileWriter("playlists.json", true))
            {
                //  might have to add check to see if file exists
                
                //  need to figure out how to add to already existing array
                //  not create a new one every time
                System.out.print("\nwriting to playlists.json");
                file.write(playlistList.toJSONString());
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
