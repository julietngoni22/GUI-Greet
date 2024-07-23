/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secure.all.co.za;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Geeks_PC54
 */
public class Greet  extends JFrame{
    //JPANE1
    private JPanel namePanel;
    private JPanel surnamPanel;
    private JPanel nameAsurnamePanel;
    private JPanel greetingAreaPanel;
    private JPanel btnPanel;
    private JPanel mainPanel;
    private JPanel headingpn1;
  
    //LABELS
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
   
    
    //textField
    private JTextField nameTextField;
    private JTextField surnameTextField;
    
    //testarea
    private JTextArea greetingsTextArea;
    
    //buttons
    private JButton greetButton;
    private JButton clearButton;
    private JButton exitButton;
            
    
    
    public Greet(){
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greeting!!!!");
        setBackground(Color.yellow);
        setAlwaysOnTop(true);
        setSize(750, 750);
        setBackground(Color.yellow);
        
        namePanel = new JPanel(new FlowLayout());
        surnamPanel = new JPanel(new FlowLayout());
        
        nameAsurnamePanel = new JPanel(new GridLayout(2,2));
        
        greetingAreaPanel = new JPanel( new FlowLayout());
        greetingAreaPanel.setBorder(new TitledBorder(new LineBorder(Color.green, 1), "Greetings"));
        
        btnPanel = new JPanel(new FlowLayout());
        mainPanel = new JPanel(new BorderLayout());
        headingpn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingpn1.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create the labels
        headingLabel = new JLabel("GreetingsApp");
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");
     
        
        //creating text field
        nameTextField = new JTextField(20);
        surnameTextField =new JTextField(20);
       
        //CREATE THE AREA
        greetingsTextArea = new JTextArea(40,50);
        greetingsTextArea.setEditable(false);
        greetingsTextArea.setText("Hello\tJuliet\tNgoni");
        //CREATE THE BUTTONS
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        //add name label textfield to the name panel
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
         //add surname label textfield to the name panel
        surnamPanel.add(surnameLabel);
        surnamPanel.add(surnameTextField);
        
         //add name and surname label textfield to the name panel.
         nameAsurnamePanel.add(namePanel);
         nameAsurnamePanel.add(surnamPanel);
        
         //add greetings area to its panel
         greetingAreaPanel.add(greetingsTextArea);
         
         //add buttons to their panel
         btnPanel.add(greetButton);
         btnPanel.add(clearButton);
         btnPanel.add(exitButton);
         
         //add all the panels to the main panel
         mainPanel.add(nameAsurnamePanel, BorderLayout.NORTH);
         mainPanel.add(nameAsurnamePanel, BorderLayout.NORTH);
         mainPanel.add(greetingAreaPanel, BorderLayout.CENTER);
         mainPanel.add(btnPanel, BorderLayout.SOUTH);
         
         //add the main panel to the frames panel
         add(headingpn1, BorderLayout.NORTH);
         add(mainPanel, BorderLayout.CENTER);
         //making the frame to be visible
         setVisible(true);
        
    }
}
