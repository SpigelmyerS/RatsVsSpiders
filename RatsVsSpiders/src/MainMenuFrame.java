
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

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
    private JLabel startLabel;
    private JLabel quitLabel;
    private JTextField RatsVSpidersField;
    
    public MainMenuFrame() {
        this.createComponents();
        this.createPanel();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void createComponents() {
        this.createButtons();
        this.createTextField();
    }

    private void createButtons() {
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
        ActionListener startListener = new StartQuitListener("start");
        startButton.addActionListener(startListener);
        quitButton = new JButton("Quit");
        ActionListener quitListener = new StartQuitListener("Quit");
        quitButton.addActionListener(quitListener);

    }

    private void createTextField() {
        final int FIELD_WIDTH = 10;
        RatsVSpidersField = new JTextField(FIELD_WIDTH);
        RatsVSpidersField.setText("RATS VS SPIDERS!");
        RatsVSpidersField.setEditable(false);
    }

    private void createPanel() {
        JPanel panel = new JPanel();
        panel.add(this.RatsVSpidersField);
        panel.add(this.startButton);
        panel.add(this.quitButton);
        this.add(panel);
    }
}
