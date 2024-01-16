package gui;

import button.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// compared to photoshop, graphics design is painful!!!
public class GUI extends JFrame implements ActionListener {

    private final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();


    private boolean audioPlaying = false;
    private final PlayButton playButton; //play button
    private final NextSongButton skipSong; //skip song button
    private final PreviousSongButton previousSong; //previous song button
    private final JLabel songName; //song name text
    private final JLabel artist;  //artist text
    private final Skip15SecsButton skip15Secs; //skip 15 seconds button
    private final Rewind15SecsButton rewind15Secs; //rewind 15 seconds button
   // private final JLabel cover; //song cover
    private int trackNumber = 0;
    private boolean songPassed = false;
  //  private final Player player = new Player();
    private SearchComboBox searchComboBox;

    public GUI() {

        SearchTextBox searchTextBox = new SearchTextBox();

        searchComboBox = new SearchComboBox();
        searchComboBox.addActionListener(this);


        //play button
        playButton = new PlayButton(); //initialize playButton
        playButton.addActionListener(this); //creates an action listener for play button

        //skip song button
        skipSong = new NextSongButton(); //initialize skip song button
        skipSong.addActionListener(this); //action lister for skip song button


        //previous song button
        previousSong = new PreviousSongButton(); //initialize previous son button
        previousSong.addActionListener(this); //action listener for previous song button

        skip15Secs = new Skip15SecsButton(); //initialize skip 15 secs button
        skip15Secs.addActionListener(this); //adds action lister to skip15secs button


        rewind15Secs = new Rewind15SecsButton(); //rewind 15 secs button
        rewind15Secs.addActionListener(this); //adds action listener to rewind15secs button

        //song name text
        songName = new JLabel(" ", JLabel.CENTER); //label for song name, centres it on the screen
        songName.setBounds(-50, 300, 500, 60); //set bounds, x, y, height, and width
        songName.setFont(new Font("Verdana", Font.PLAIN, 15)); //sets the font and size
      //  songName.setText(playList.get(trackNumber).getTitle()); //will set the song name to the specific song

        //artist name text
        artist = new JLabel(" ", JLabel.CENTER); // label for artist name
        artist.setBounds(-50, 325, 500, 60); //sets bounds, x,y , width, and height
        artist.setFont(new Font("Verdana", Font.PLAIN, 13)); //sets font and size
       // artist.setText(playList.get(trackNumber).getArtist()); //sets the artist name

        //playlist text
        JLabel playListText = new JLabel(" ", JLabel.CENTER);
        playListText.setBounds(-50, 60, 500, 60); //sets bounds, x,y , width, and height
        playListText.setFont(new Font("Verdana", Font.PLAIN, 14)); //sets font and size
        playListText.setText("Playlist #1");

     //   ImageIcon coverPic = new ImageIcon(playList.get(trackNumber).getCover());
      //  cover = new JLabel(coverPic);
      //  cover.setBounds(100, 115, 200, 200);
       // Color darkBlue = new Color(1, 79, 108);
       // cover.setBorder(BorderFactory.createLineBorder(darkBlue,4));
        //trying to use a higher quality photo but anything higher than 200x200 doesnt show (I change height and width accordingly)

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //will close jframe if exited

        int height = 600;
        int width = 400;
        this.setSize(width, height); //size of frame
        this.add(searchComboBox);
        this.add(searchTextBox);
       // this.add(cover);
        this.add(playButton); //add play button to frame
        this.add(previousSong); //adds previousong button to frame
        this.add(skipSong); //adds skipsong button to frame
        this.add(songName); //adds song name to frame
        this.add(artist); //adds artist to frame
        this.add(skip15Secs); //adds skip15sec button to frame
        this.add(rewind15Secs); //adds rewind15secs button to frame
        this.add(playListText);

        add(new BackgroundGradient());
        this.setVisible(true); //frame visible set to true

        setIconImage(new ImageIcon("ButtonIcons/playIcon.png").getImage());

        setLocation(getCentreCoordinates()[0],getCentreCoordinates()[1]);

    }




    private int[] getCentreCoordinates() {
        int xCentred = (int) ((dimension.getWidth() - getWidth()) / 2);
        int yCentred = (int) ((dimension.getHeight() - getHeight()) / 2);
        return new int[]{xCentred,yCentred};
    }



    private void playButtonAction() {

        if (!audioPlaying) {
             //calls play music method, passes the wavfil

            // PLAY SONG
        } else {


        }

    }

    public void changeSong() {


        //CHANGE PNG
    }
    private void skip15Seconds(boolean forwards) {

    }

    @Override
    public void actionPerformed(ActionEvent e){



        if(e.getSource() == playButton){
            //if playbutton is pressed
            playButtonAction();
        }
        else if (e.getSource() == skip15Secs){
            skip15Seconds(true);
        }
        else if (e.getSource() == rewind15Secs){
            skip15Seconds(false);
        }

        else if (e.getSource() == previousSong && trackNumber > 0)
        //if previous song button is pressed <<
        {
            trackNumber -= 1;
            changeSong();
        } else if (e.getSource() == searchComboBox) {
            trackNumber = searchComboBox.getSelectedIndex();
            changeSong();
        }


    }
}