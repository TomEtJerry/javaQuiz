package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.util.Objects;


public class Menu implements ActionListener {
    static final int HEIGHT = 1080;
    static final int WIDTH = 1920;

    JFrame frame= new JFrame(); //cadre graphique

    JButton boutonPrincipal =new JButton(); //bouton pour jouer


    JLabel logo = new JLabel();
    JLabel g1 = new JLabel();
    JLabel g2 = new JLabel();
    JLabel g3 = new JLabel();
    JLabel g4 = new JLabel();
    JLabel g5 = new JLabel();
    JLabel g6 = new JLabel();
    JLabel g7 = new JLabel();
    JLabel g8 = new JLabel();


    Menu(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(WIDTH,HEIGHT); //taille du cadre
        frame.getContentPane().setBackground(new Color(65, 153, 187)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre

        String lepath = "";

        logo.setBounds(430, 100, 300, 300);
        Icon FMS = new ImageIcon(new ImageIcon(lepath + "icon.PNG").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        logo.setIcon(FMS);

        
        


        boutonPrincipal.setBounds(500, 600, 500, 100);
        boutonPrincipal.setText("Appuyer sur A pour démarrer");
        //boutonPrincipal.addActionListener(e -> {frame.dispose(); Quiz q = new MiniJeu1();});
        boutonPrincipal.addActionListener(buttonPressed);
        boutonPrincipal.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,0), "A_pressed");
        boutonPrincipal.getActionMap().put("A_pressed", buttonPressed);

        frame.add(boutonPrincipal);
        frame.add(logo);frame.add(g1); frame.add(g2);frame.add(g3);frame.add(g4);frame.add(g5);frame.add(g6);frame.add(g7);frame.add(g8);
        frame.setVisible(true);


        }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
    AbstractAction buttonPressed = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) { //pour les clics de souris, existe deja
            System.out.println(e.getActionCommand());

            //quel bouton est cliqué:
            if(e.getSource()==boutonPrincipal){frame.dispose(); Quiz q = new MiniJeu1();}

        }
    };
}
