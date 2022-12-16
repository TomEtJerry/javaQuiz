package com.company;

import javax.lang.model.element.Element;
import javax.sound.midi.VoiceStatus;
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

    JFrame frame= new JFrame(); //cadre graphique

    JButton boutonPrincipal =new JButton(); //bouton pour jouer

    JLabel logo = new JLabel();

    Menu(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(WIDTH,HEIGHT); //taille du cadre
        //frame.getContentPane().setBackground(new Color(65, 153, 187)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre



        logo.setBounds(0, 0, WIDTH, HEIGHT);
        Icon FMS = new ImageIcon(new ImageIcon("quizLogo.jpg").getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT));
        logo.setIcon(FMS);  


        boutonPrincipal.setBounds(WIDTH/2-250, HEIGHT/2+150, 500, 100);
        boutonPrincipal.setText("Cliquer pour démarrer");
        boutonPrincipal.addActionListener(buttonPressed);
        boutonPrincipal.setBackground(Color.CYAN);

        JTextField textField = new JTextField();
        textField.setBounds(WIDTH/2-250, HEIGHT/4, 500, 100);
        textField.setText("nom d'utilisateur");
        textField.setFont(new Font("Serif", Font.BOLD, 30));
        String text = textField.getText();

        frame.add(textField);
        frame.add(boutonPrincipal);
        frame.add(logo);
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
