/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bestmusicplayer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
    
    public void read_file(String fileToRead)
    {
        
        try (FileReader reader = new FileReader(fileToRead))
        {
                //Read JSON file
                Object obj = jsonParser.parse(reader);

                playlistList = (JSONArray) obj;
                System.out.println("Read file and information found: " + playlistList);
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public boolean create_playlist(String playlistName, String playlistDescription)
    {
        if(!playlistName.isEmpty())
        {
            System.out.print("playlist name isn't empty, check passed");
            
            //  read rile
            //  copy all contents to array
            //  then proceeed
            read_file("playlists.json");
            
            playlistDetails.put("Description", playlistDescription);
            playlistDetails.put("Name",  playlistName);
            

            //  adding the playlist details to the account object
            
            playlistObject.put("playlist", playlistDetails);

            //  making a JSON array
            
            System.out.print("playlistObject: " + playlistObject);
            System.out.print("playlistList (before adding object): " + playlistList);
            
            //  adding playlistObject to array
            playlistList.add(playlistObject);
            System.out.print("playlistList (after adding object): " + playlistList);
            
            
         

            //  writing to JSON file, 
            //  the true parameter makes it so the file is not overwritten
            try (FileWriter file = new FileWriter("playlists.json"))
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
