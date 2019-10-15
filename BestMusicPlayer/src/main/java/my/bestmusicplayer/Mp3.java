/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.bestmusicplayer;

import java.io.IOException;
import java.io.InputStream;
import javazoom.jl.player.*;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.decoder.JavaLayerException;
import java.util.concurrent.Semaphore;


/**
 *
 * @author Juan
 */
public class Mp3 {
    
    public AdvancedPlayer mp3Player;
    public String songName;
    //private JsonPojo _songDetails;
    
    public Mp3(String file)
    {
       try {
             songName = file;
             InputStream is = new CECS327InputStream(file);
             mp3Player = new AdvancedPlayer(is);
             //mp3Player.setPlayBackListener();
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
    
    public AdvancedPlayer getPlayer()
    {
        return mp3Player;
    }
    
    /*public void setMP3play(String file) {
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
    }*/
    
    public void mp3play() {
        try {
             this.mp3Player.play();
	     }
	catch (JavaLayerException exception) 
            {
	       exception.printStackTrace();
	    }
    }
    
    public void pause () 
    {
        //this._mp3Player.wait();
    }
    
    public void stop ()
    {
        this.mp3Player.close();
    }
}
