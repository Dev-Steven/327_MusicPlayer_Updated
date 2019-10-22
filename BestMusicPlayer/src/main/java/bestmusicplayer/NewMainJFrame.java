/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestmusicplayer;

import bestmusicplayer.Controllers.UserController;
import bestmusicplayer.Views.*;
import bestmusicplayer.Controllers.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;


/**
 *
 * @author Juan
 */
public class NewMainJFrame extends javax.swing.JFrame {

    User user = new User("","");
    String email = user.email;
    String password = user._password;
    String search = "";
    String songToAdd = "";
    ArrayList<String> playLists = new ArrayList<String>();
    ArrayList<String> songs = new ArrayList<String>();
    
    
    String createEmail = "";
    String createPassword = "";
    String createConfirmPassword = "";
    
    String createPlaylistName = "";
    String createPlaylistDescription = "";
   
    
    Mp3 player;    
    String songFile;
    
    UserController userCon = new UserController();
    PlaylistController playCon = new PlaylistController();

    /**
     * Creates new form NewMainJFrame
     */
    public NewMainJFrame() {
        initComponents();
        songFile = "imperial.mp3";
        player = new Mp3(songFile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        main = new javax.swing.JPanel();
        loginView = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        createPageButton = new javax.swing.JButton();
        mainView = new javax.swing.JPanel();
        PlayButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        viewCreatePlaylistButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        songListPane = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        searchResult = new javax.swing.JScrollPane();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addToPlaylist = new javax.swing.JButton();
        createAccountView = new javax.swing.JPanel();
        createTitle = new javax.swing.JLabel();
        createEmailLabel = new javax.swing.JLabel();
        createPasswordLabel = new javax.swing.JLabel();
        createConfirmLabel = new javax.swing.JLabel();
        createEmailField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        createPasswordField = new javax.swing.JPasswordField();
        createConfirmPasswordField = new javax.swing.JPasswordField();
        createPlaylistView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        createPlaylistTitle = new javax.swing.JLabel();
        createPlaylistNameLabel = new javax.swing.JLabel();
        createPlaylistNameField = new javax.swing.JTextField();
        createPlaylistDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        createPlaylistDescriptionTextArea = new javax.swing.JTextArea();
        createPlaylistButton = new javax.swing.JButton();
        playListSelectable = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        DeletePlaylist = new javax.swing.JButton();
        EditPlaylist = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        loginView.setBackground(new java.awt.Color(51, 255, 102));

        loginTitle.setText("Spotify Login");

        emailLabel.setText("Email:");

        passwordLabel.setText("Password:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        createPageButton.setText("Create Account");
        createPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginViewLayout = new javax.swing.GroupLayout(loginView);
        loginView.setLayout(loginViewLayout);
        loginViewLayout.setHorizontalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginViewLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginViewLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(43, 43, 43)
                        .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginTitle)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createPageButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        loginViewLayout.setVerticalGroup(
            loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginViewLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(loginTitle)
                .addGap(63, 63, 63)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createPageButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        main.add(loginView, "card2");

        PlayButton.setText("Play");
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayButtonMouseClicked(evt);
            }
        });
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        StopButton.setText("Stop");
        StopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopButtonMouseClicked(evt);
            }
        });

        viewCreatePlaylistButton.setText("Create a Playlist");
        viewCreatePlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCreatePlaylistButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("All Songs");

        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addToPlaylist.setText("Add to Playlist");
        addToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToPlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchButton)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addToPlaylist)
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(searchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToPlaylist)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainViewLayout = new javax.swing.GroupLayout(mainView);
        mainView.setLayout(mainViewLayout);
        mainViewLayout.setHorizontalGroup(
            mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainViewLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(songListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(mainViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewCreatePlaylistButton)
                .addGroup(mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainViewLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))))
        );
        mainViewLayout.setVerticalGroup(
            mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainViewLayout.createSequentialGroup()
                        .addComponent(viewCreatePlaylistButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainViewLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(songListPane)
                        .addGap(47, 47, 47)))
                .addGroup(mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainViewLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(StopButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addComponent(PlayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        main.add(mainView, "card3");

        createTitle.setText("Create Account");

        createEmailLabel.setText("Email:");

        createPasswordLabel.setText("Password:");

        createConfirmLabel.setText("Confirm Password:");

        createEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmailFieldActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAccountViewLayout = new javax.swing.GroupLayout(createAccountView);
        createAccountView.setLayout(createAccountViewLayout);
        createAccountViewLayout.setHorizontalGroup(
            createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountViewLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createPasswordLabel)
                    .addComponent(createEmailLabel)
                    .addComponent(createConfirmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(createPasswordField)
                    .addComponent(createConfirmPasswordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountViewLayout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountViewLayout.createSequentialGroup()
                        .addComponent(createTitle)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAccountViewLayout.createSequentialGroup()
                        .addComponent(createButton)
                        .addGap(240, 240, 240))))
        );
        createAccountViewLayout.setVerticalGroup(
            createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAccountViewLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(createTitle)
                .addGap(60, 60, 60)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createEmailLabel)
                    .addComponent(createEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPasswordLabel)
                    .addComponent(createPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAccountViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createConfirmLabel)
                    .addComponent(createConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        main.add(createAccountView, "card4");

        createPlaylistTitle.setText("Create a Playlist");

        createPlaylistNameLabel.setText("Playlist Name:");

        createPlaylistNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistNameFieldActionPerformed(evt);
            }
        });

        createPlaylistDescriptionLabel.setText("Description:");

        createPlaylistDescriptionTextArea.setColumns(20);
        createPlaylistDescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(createPlaylistDescriptionTextArea);

        createPlaylistButton.setText("Create");
        createPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createPlaylistTitle)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(createPlaylistNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(createPlaylistNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(createPlaylistDescriptionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(createPlaylistButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(createPlaylistTitle)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPlaylistNameLabel)
                    .addComponent(createPlaylistNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPlaylistDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createPlaylistButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel2.setText("Your playlists");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        DeletePlaylist.setText("Delete");
        DeletePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePlaylistActionPerformed(evt);
            }
        });

        EditPlaylist.setText("Edit");
        EditPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPlaylistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playListSelectableLayout = new javax.swing.GroupLayout(playListSelectable);
        playListSelectable.setLayout(playListSelectableLayout);
        playListSelectableLayout.setHorizontalGroup(
            playListSelectableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playListSelectableLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(playListSelectableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(playListSelectableLayout.createSequentialGroup()
                .addComponent(DeletePlaylist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playListSelectableLayout.setVerticalGroup(
            playListSelectableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playListSelectableLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(playListSelectableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletePlaylist)
                    .addComponent(EditPlaylist)))
        );

        javax.swing.GroupLayout createPlaylistViewLayout = new javax.swing.GroupLayout(createPlaylistView);
        createPlaylistView.setLayout(createPlaylistViewLayout);
        createPlaylistViewLayout.setHorizontalGroup(
            createPlaylistViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPlaylistViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playListSelectable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(145, 145, 145)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        createPlaylistViewLayout.setVerticalGroup(
            createPlaylistViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPlaylistViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPlaylistViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playListSelectable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        main.add(createPlaylistView, "card5");

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        email = emailField.getText();
        password = String.valueOf(passwordField.getPassword());

        if(userCon.logging_in(email, password, main, mainView, songListPane))
        {
            MainView.view_homePage(main, mainView);
            user = new User(email, password);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void PlayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseClicked
        player.mp3play();
    }//GEN-LAST:event_PlayButtonMouseClicked

    private void StopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopButtonMouseClicked
        player.stop();
    }//GEN-LAST:event_StopButtonMouseClicked

    private void createPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPageButtonActionPerformed
        CreateAccountView.view_create(main, createAccountView);
    }//GEN-LAST:event_createPageButtonActionPerformed

    private void createEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createEmailFieldActionPerformed

    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        createEmail = createEmailField.getText();
        createPassword = String.valueOf(createPasswordField.getPassword());
        createConfirmPassword = String.valueOf(createConfirmPasswordField.getPassword());
        
        try
        {
            if(userCon.createAccount(createEmail, createPassword, createConfirmPassword)) 
            {
                System.out.print("logging in");

                MainView.view_homePage(main, mainView);

                user = new User (createEmail, createPassword);
            }
            else
            {
                System.out.print("not successful");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void viewCreatePlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCreatePlaylistButtonActionPerformed
        //  This button will take user to create a playlist page when clicked
      
            PlayListView.view_createPlaylist(main, createPlaylistView);
            
    }//GEN-LAST:event_viewCreatePlaylistButtonActionPerformed

    private void createPlaylistNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createPlaylistNameFieldActionPerformed

    private void createPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistButtonActionPerformed
        createPlaylistName = createPlaylistNameField.getText();
        createPlaylistDescription = createPlaylistDescriptionTextArea.getText();

        if(playCon.createPlaylist(user, createPlaylistName, createPlaylistDescription, songs))
        {
            MainView.view_homePage(main, mainView);
        }
        else
        {
            System.out.print("Could not create playlist");
        }
    }//GEN-LAST:event_createPlaylistButtonActionPerformed

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Hello");
    }//GEN-LAST:event_PlayButtonActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        search = searchBar.getText();
        
        songToAdd = userCon.searchSong(search, searchResult);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToPlaylistActionPerformed
        userCon.selectSong(songToAdd);
    }//GEN-LAST:event_addToPlaylistActionPerformed

    private void DeletePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletePlaylistActionPerformed

    private void EditPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPlaylistActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //jComboBox2 = (JComboBox<String>)evt.getSource();
        //String petName = (String)cb.getSelectedItem();
        //updateLabel(petName);
        //jComboBox2.addItem("Test");
        //jComboBox2.addItem("2");
        String selectedPlayList = (String) jComboBox2.getSelectedItem();
        //jComboBox2.getSelectedItem();
        System.out.println("Your seleted playlist is: " + selectedPlayList);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletePlaylist;
    private javax.swing.JButton EditPlaylist;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton StopButton;
    private javax.swing.JButton addToPlaylist;
    private javax.swing.JPanel createAccountView;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel createConfirmLabel;
    private javax.swing.JPasswordField createConfirmPasswordField;
    private javax.swing.JTextField createEmailField;
    private javax.swing.JLabel createEmailLabel;
    private javax.swing.JButton createPageButton;
    private javax.swing.JPasswordField createPasswordField;
    private javax.swing.JLabel createPasswordLabel;
    private javax.swing.JButton createPlaylistButton;
    private javax.swing.JLabel createPlaylistDescriptionLabel;
    private javax.swing.JTextArea createPlaylistDescriptionTextArea;
    private javax.swing.JTextField createPlaylistNameField;
    private javax.swing.JLabel createPlaylistNameLabel;
    private javax.swing.JLabel createPlaylistTitle;
    private javax.swing.JPanel createPlaylistView;
    private javax.swing.JLabel createTitle;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPanel loginView;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mainView;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel playListSelectable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane searchResult;
    private javax.swing.JScrollPane songListPane;
    private javax.swing.JButton viewCreatePlaylistButton;
    // End of variables declaration//GEN-END:variables
}
