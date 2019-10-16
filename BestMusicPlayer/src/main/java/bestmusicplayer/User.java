/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

/**
 *
 * @author Juan
 */
public class User {
    
    public String email;
    public String _password;
    
    public User (String username, String password)
    {
        this.email = username;
        this._password = password;
    }
    
    public void setUser(String name) {email = name;}
    
    public void setPassword(String password) {_password = password;}
    
    public String getUser() {return email;}
    
    public String getPassword() {return _password;}
}
