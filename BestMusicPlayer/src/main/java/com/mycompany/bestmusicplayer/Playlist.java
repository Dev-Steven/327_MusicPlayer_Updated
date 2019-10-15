/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bestmusicplayer;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Playlist {
    
    public String owner;
    public String playListName;
    public ArrayList<JsonPojo> songList;
    
    public void createPlaylist(String name) {playListName = name;}
    
    public void deletePlaylist() {owner = null;}
    
    public void addSong(JsonPojo song) 
    {
    //  To do
    }
    
    public void removeSong(JsonPojo song) 
    {
    //  To do
    }
}
