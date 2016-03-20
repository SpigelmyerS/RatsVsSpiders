import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.font.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.*;
import sun.audio.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jason
 */
public class MainMenuFrame extends JFrame {
    
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private JButton startButton;
    private JButton quitButton;
    // deleted button labels since they were unused in the code
    private JButton spiderbutton;
    private JTextField RatsVSpidersField;
    Font font2 = new Font("Comic Sans MS",Font.BOLD,50);
    // removed code for spider image on the main menu since we didn't use it and it was just taking up
    // space in the class. Also removed the unused methods that were involved with the image
    
    // because I had made a similar GUI previously I knew that I shouldn't have the constructor do much
    // more than simply call the other methods in the class that actually build the gui
    public MainMenuFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    // create components is another simple method I started using due to old projects that had long lists
    // of methods in the constructor. Create componets allows it to be more concise and do less
    private void createComponents() {
        this.createButtons();
        this.createTextField();
    }
    // I knew from past programs that it is easier to have each method only build one component
    private void createButtons() {
        // I added a subclass here because it made sense to have the button method also create the action
        // listeners 
        class StartQuitListener implements ActionListener {
  
            private String action;
            public StartQuitListener(String action) {
                this.action = action.toLowerCase();
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action.equals("start")) {
                   Frame f1 = new Frame();
                   dispose();       
                }
                if (action.equals("quit")) {
                    System.exit(0);
                }
            }
        }
        startButton = new JButton("Start");
        startButton.setFont(font2);
        startButton.setForeground(Color.RED);
        ActionListener startListener = new StartQuitListener("start");
        startButton.addActionListener(startListener);
        quitButton = new JButton("Quit");
        quitButton.setFont(font2);
        quitButton.setForeground(Color.RED);
        ActionListener quitListener = new StartQuitListener("Quit");
        quitButton.addActionListener(quitListener);
    }
    // I used a text field here simply because it was easier to customize it to look how I wanted 
    // but a label could have also been used
    private void createTextField() {
        final int FIELD_WIDTH = 40;
        Font font1 = new Font("SansSerif",Font.BOLD, 80);
        RatsVSpidersField = new JTextField(FIELD_WIDTH);
        RatsVSpidersField.setText("RATS vs SPIDERS!");
        RatsVSpidersField.setLocation(50,50);
        RatsVSpidersField.setFont(font1);
        RatsVSpidersField.setForeground(Color.BLUE);
        RatsVSpidersField.setHorizontalAlignment(JTextField.CENTER);
        RatsVSpidersField.setEditable(false);
    }
    
    private void createPanel() {
        music();
        JPanel panel = new JPanel(); 
        panel.add(this.RatsVSpidersField);
        panel.add(this.startButton);
        panel.add(this.quitButton);
        this.add(panel);
    }
    // Suzzanah made this part of the method because I hadn't done anything with music files before
    // but I did help edit it to try and make it work as we wanted it to.
    public void music(){
        AudioPlayer Play = AudioPlayer.player; 
        AudioStream audplay;
        AudioData auddata;
        ContinuousAudioDataStream loop = null;
        try{
            InputStream test = new FileInputStream("src/images/jp harmonica_1.wav");
            audplay = new AudioStream(test);
            AudioPlayer.player.start(audplay);
        }
        catch(FileNotFoundException e){
           
        }
        catch(IOException error){
            
        }
        
        }
            
}
