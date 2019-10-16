/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer.Views;

public class MainView 
{
    public static void view_homePage(javax.swing.JPanel main, javax.swing.JPanel homePage)
    {
        main.removeAll();
        main.add(homePage);
        main.repaint();
        main.revalidate();
    }
}
