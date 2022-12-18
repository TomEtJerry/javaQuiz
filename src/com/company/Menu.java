package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;

public class Menu implements ActionListener {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();

    int HEIGHT = (int) screenSize.getHeight();
    int WIDTH = (int) screenSize.getWidth();

    String nickName;

    JFrame frame= new JFrame(); //cadre graphique

    JButton boutonA =new JButton(); //bouton pour jouer

    JLabel logo = new JLabel();
    
    Color paint = new Color(102, 102, 255);

    Menu(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(WIDTH,HEIGHT); //taille du cadre
        //frame.getContentPane().setBackground(new Color(65, 153, 187)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre
        frame.getContentPane().setBackground(paint);


        logo.setBounds(0, 0, WIDTH, HEIGHT);
        Icon FMS = new ImageIcon(new ImageIcon("javaQuiz\\quizLogo.jpg").getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        logo.setIcon(FMS); 

        // add the text field and button for the name
        JTextField nameField = new JTextField("Entrer un nom");
        nameField.setBounds(WIDTH/2-250, HEIGHT/4, 500, 100);
        
    
        JButton boutonA = new JButton("Quiz Java");
        boutonA.setBounds(WIDTH/2-250, HEIGHT/2+150, 240, 100);
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
        
        JButton boutonB = new JButton("Quiz Popculture");
        boutonB.setBounds(WIDTH/2+10, HEIGHT/2+150, 240, 100);
        boutonB.setBackground(Color.CYAN);
        boutonB.addActionListener(new ActionListener() {
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
        
        frame.add(nameField);
        frame.add(boutonA);
        frame.add(boutonB);
        frame.add(logo);
        frame.setVisible(true);
    }
    @Override//pour ne pas avoir d'erreur dans l'implémentation d'Actionlistener
    public void actionPerformed(ActionEvent e) {
    }
}
