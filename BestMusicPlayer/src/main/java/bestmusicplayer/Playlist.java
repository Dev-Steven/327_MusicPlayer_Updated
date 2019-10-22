/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Playlist {
    
    public String owner;
    public String playListName;
    public String playListDescription;
    public ArrayList<String> songList;
    
    public Playlist(User user, String name, String description, ArrayList<String> songs) 
    {
        this.owner = user.email;
        this.playListName = name;
        this.playListDescription = description;
        this.songList = songs;
    }
    
    public void deletePlaylist() {owner = null;}
    
    public void addSong(String song) 
    {
        songList.add(song);
    }
    
//    public void addSong(JsonPojo song) 
//    {
//    //  To do
//    }
    
    public void removeSong(JsonPojo song) 
    {
    //  To do
    }
}
