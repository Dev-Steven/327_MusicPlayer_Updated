/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class clientCom {
    
    //Run after server
    public static void main(String args[]) throws IOException
    {
        int temp;
        Socket s = new Socket("127.0.0.1", 6000);
        //Receives from server
        Scanner input = new Scanner(s.getInputStream());
        //Sends to Server
        PrintStream print = new PrintStream(s.getOutputStream());
        print.println(6000);
        temp = input.nextInt();
        System.out.println(temp);
    }
}
