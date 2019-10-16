/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer.Views;

public class PlayListView 
{
    public static void view_createPlaylist(javax.swing.JPanel main, javax.swing.JPanel createPlaylist)
    {
        main.removeAll();
        main.add(createPlaylist);
        main.repaint();
        main.revalidate();
    }
}
