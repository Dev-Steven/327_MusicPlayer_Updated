/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bestmusicplayer;

import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.player.*;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Juan
 */
public class Mp3 {
    
    private Player _mp3Player;
    private JsonPojo _songDetails;
            
    public void setMP3play(String file) {
        try {
             InputStream is = new CECS327InputStream(file);
             _mp3Player = new Player(is);
	     }
	catch (JavaLayerException exception) 
            {
	       exception.printStackTrace();
	    }
        catch (IOException exception)
            {
             exception.printStackTrace();
            }
    }
    
    void mp3play() {
        try {
             _mp3Player.play();
	     }
	catch (JavaLayerException exception) 
            {
	       exception.printStackTrace();
	    }
    }
    
    void pause () 
    {
    
    }
    
    void stop ()
    {
        _mp3Player.close();
    }
}
