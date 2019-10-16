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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juan
 */
public class JsonArrayHandler {
    
    public static User[] createUserArray (String file) throws IOException
    {
        Gson gson = new Gson();
        BufferedReader br = null;
        User[] array;
        br = new BufferedReader(new FileReader(file));
        array = gson.fromJson(br, User[].class);

            //           JsonPojo firstEl = array[0];
            //           System.out.println("first element release: " + firstEl.release.name);
            //           System.out.println("first element artist: " + firstEl.artist);

        for(User obj : array) 
        {
            System.out.println(obj);
                //listModel.addElement(obj.song.title + " - " + obj.artist.name);
        }
        return array;
    }
    
    public static Playlist[] createPlaylistArray (String file) throws IOException
    {
        Gson gson = new Gson();
        BufferedReader br = null;
        Playlist[] array;
        br = new BufferedReader(new FileReader(file));
        array = gson.fromJson(br, Playlist[].class);

            //           JsonPojo firstEl = array[0];
            //           System.out.println("first element release: " + firstEl.release.name);
            //           System.out.println("first element artist: " + firstEl.artist);

        for(Playlist obj : array) 
        {
            System.out.println(obj);
                //listModel.addElement(obj.song.title + " - " + obj.artist.name);
        }
        return array;
    }
}
