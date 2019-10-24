/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class serverCom {
    
    //Must be run first to work
    public static void main(String args[]) throws IOException
    {
        int test;
        ServerSocket s1 = new ServerSocket(6000);
        //Accepts incoming requests
        Socket ss = s1.accept();
        //
        Scanner input = new Scanner(ss.getInputStream());
        test = input.nextInt();
        
        PrintStream print = new PrintStream(ss.getOutputStream());
        print.println(test);
        
    }
    
}
