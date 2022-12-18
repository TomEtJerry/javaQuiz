package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class Menu implements ActionListener {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();

    int HEIGHT = (int) screenSize.getHeight();
    int WIDTH = (int) screenSize.getWidth();

    String nickName;

    JFrame frame= new JFrame(); //cadre graphique

    JButton boutonPrincipal =new JButton(); //bouton pour jouer

    JLabel logo = new JLabel();

    

    Menu(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(WIDTH,HEIGHT); //taille du cadre
        //frame.getContentPane().setBackground(new Color(65, 153, 187)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre
    
        // add the text field and button for the name
        JTextField nameField = new JTextField();
        nameField.setBounds(WIDTH/2-250, HEIGHT/4, 500, 100);
        frame.add(nameField);
    
        JButton boutonA = new JButton("JOUER");
        boutonA.setBounds(WIDTH/2-250, HEIGHT/2+150, 500, 100);
        boutonA.setBackground(Color.CYAN);
        boutonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Merci d'entrer votre nom.", "Erreur", JOptionPane.ERROR_MESSAGE);
                } else {
                    nickName = name;
                    frame.dispose();
                    System.out.println("Je sais que vous êtes " + name);
                    Quiz q = new MiniJeu1(name);
                }
            }
        });
        frame.add(boutonA);
    
        logo.setBounds(0, 0, WIDTH, HEIGHT);
        Icon FMS = new ImageIcon(new ImageIcon("quizLogo.jpg").getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        logo.setIcon(FMS);  
    
        
        frame.add(logo);
        frame.setVisible(true);
    }
    @Override//pour ne pas avoir d'erreur dans l'implémentation d'Actionlistener
    public void actionPerformed(ActionEvent e) {
    }
}
