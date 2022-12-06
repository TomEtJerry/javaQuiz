package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.util.Objects;

public class Menu implements ActionListener {
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
        frame.setSize(1920,1080); //taille du cadre
        frame.getContentPane().setBackground(new Color(65, 153, 187)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre

        String lepath = "C:\\Users\\ilyes\\Downloads\\ProjetTransverseL22\\PRJTransverse\\src\\com\\company\\GIF\\";

        logo.setBounds(430, 100, 300, 300);
        Icon FMS = new ImageIcon(new ImageIcon(lepath + "FMS.PNG").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        logo.setIcon(FMS);

        g1.setBounds(0, 0, 300, 300);
        Icon imag = new ImageIcon(new ImageIcon(lepath + "cochon.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g1.setIcon(imag);
        g2.setBounds(300, 0, 300, 300);
        Icon imag2 = new ImageIcon(new ImageIcon(lepath + "crapeau.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g2.setIcon(imag2);
        g3.setBounds(600, 0, 300, 300);
        Icon imag3 = new ImageIcon(new ImageIcon(lepath + "chat.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g3.setIcon(imag3);
        g4.setBounds(900, 0, 300, 300);
        Icon imag4 = new ImageIcon(new ImageIcon(lepath + "cheval.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g4.setIcon(imag4);
        g5.setBounds(0, 300, 300, 300);
        Icon imag5 = new ImageIcon(new ImageIcon(lepath + "chien.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g5.setIcon(imag5);
        g6.setBounds(300, 300, 300, 300);
        Icon imag6 = new ImageIcon(new ImageIcon(lepath + "Football.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g6.setIcon(imag6);
        g7.setBounds(600, 300, 300, 300);
        Icon imag7 = new ImageIcon(new ImageIcon(lepath + "elephant.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g7.setIcon(imag7);
        g8.setBounds(900, 300, 300, 300);
        Icon imag8 = new ImageIcon(new ImageIcon(lepath + "escargot.gif").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        g8.setIcon(imag8);
        


        boutonPrincipal.setBounds(300, 500, 500, 100);
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
