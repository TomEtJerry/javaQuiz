package com.company;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Touche extends JFrame implements KeyListener{
    protected JLabel nom;
    protected Joueur [] joueurs;

    Touche(){
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        //this.setLayout(null);
        this.addKeyListener(this);
        joueurs=new Joueur[4];
        joueurs[0]=new Joueur();joueurs[1]=new Joueur();joueurs[2]=new Joueur();joueurs[3]=new Joueur();


        nom = new JLabel();
        nom.setBounds(0, 0, 100, 100);
        //nom.setBackground(Color.red);
        //nom.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(nom);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': joueurs[0].choix='A';
                break;
            case 'z': joueurs[0].choix='B';
                break;
            case 'e': joueurs[0].choix='C';
                break;
            case 'r': joueurs[0].choix='D';
                break;


            case 'q': joueurs[1].choix='A';
                break;
            case 's': joueurs[1].choix='B';
                break;
            case 'd': joueurs[1].choix='C';
                break;
            case 'f': joueurs[1].choix='D';
                break;


            case 'u': joueurs[2].choix='A';
                break;
            case 'i': joueurs[2].choix='B';
                break;
            case 'o': joueurs[2].choix='C';
                break;
            case 'p': joueurs[2].choix='D';
                break;


            case 'j': joueurs[3].choix='A';
                break;
            case 'k': joueurs[3].choix='B';
                break;
            case 'l': joueurs[3].choix='C';
                break;
            case 'm': joueurs[3].choix='D';
                break;
        }
        //a reinjecter dans mini jeu 3:
        /*for(int i=0;i<3;i++) {
            if (touche.joueurs[i].choix == reponses[position]) { //si A etait la réponse
                touche.joueurs[0].score += (50 + (secondes * 10));
                touche.joueurs[1].score += (50 + (secondes * 10));
                touche.joueurs[2].score += (50 + (secondes * 10));
                touche.joueurs[3].score += (50 + (secondes * 10));
            }
        }
         */
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}

