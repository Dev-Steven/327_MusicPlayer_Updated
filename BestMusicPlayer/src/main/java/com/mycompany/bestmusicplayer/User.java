/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bestmusicplayer;

/**
 *
 * @author Juan
 */
public class User {
    
    public String username;
    private String _password;
    
    
    public void setUser(String name) {username = name;}
    
    public void setPassword(String password) {_password = password;}
    
    public String getUser() {return username;}
    
    public String getPassword() {return _password;}
}
