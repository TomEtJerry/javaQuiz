package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MiniJeu1 extends Quiz{
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension screenSize = toolkit.getScreenSize();

    String nickName;

    int HEIGHT = (int) screenSize.getHeight();
    int WIDTH = (int) screenSize.getWidth();

    protected Joueur [] joueurs; //tableau de joueurs: 0,1,2,3
    protected int nbAleatoire;
    protected String[] tabChoix;

    Timer timer= new Timer(1000, new ActionListener() { //1000=1s
        @Override
        public void actionPerformed(ActionEvent e) {
            secondes--;
            secondes_restantes.setText(String.valueOf(secondes));
            if(secondes<=0){
                affichage_rep();
            }
        }
    });

    MiniJeu1(){}

    MiniJeu1(String name){
        rep_correctes=0;
        nb_quest= 5;
        secondes=10;
        position=0;
        tabChoix=new String[4];

        nickName = name;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(WIDTH,HEIGHT); //taille du cadre
        frame.getContentPane().setBackground(new Color(153,255,204)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre

        textField.setBounds(0,0,WIDTH,50);
        textField.setBackground(new Color(255,204,153));
        textField.setForeground(new Color(102,0,51)); //couleur texte
        textField.setFont(new Font("Century Schoolbook",Font.BOLD,30)); //reglages police
        textField.setBorder(BorderFactory.createBevelBorder(1));  //mettre des bords
        textField.setHorizontalAlignment(JTextField.CENTER); //centrer
        textField.setEditable(false); //l'utilisateur peut pas changer les tailles

        textArea.setBounds(0,50,1920,75);
        textArea.setLineWrap(true); //passe ligne suivante si texte trop grand
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(255,255,102));
        textArea.setForeground(new Color(255,153,153)); //couleur texte
        textArea.setFont(new Font("MV Boli",Font.BOLD,50)); //reglages police
        textArea.setBorder(BorderFactory.createBevelBorder(1));  //mettre des bords
        textArea.setEditable(false); //l'utilisateur peut pas changer les tailles

        nck.setBounds(WIDTH/10, WIDTH/20, HEIGHT,WIDTH/12);
        nck.setBackground(new Color(255,153,153));
        nck.setForeground(new Color(0,153,76));
        nck.setFont(new Font("MV Boli",Font.PLAIN,30));
        nck.setText("Joueur : "+ name);

        bouton1.setBounds(HEIGHT/10, HEIGHT/10*2, WIDTH/12, WIDTH/12);
        bouton1.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton1.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton1.addActionListener(buttonPressed);
        bouton1.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,0), "A_pressed");
        bouton1.getActionMap().put("A_pressed", buttonPressed);

        bouton2.setBounds(HEIGHT/10, HEIGHT/10*4, WIDTH/12, WIDTH/12);
        bouton2.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton2.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton2.addActionListener(buttonPressed);
        bouton2.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z,0), "Z_pressed");
        bouton2.getActionMap().put("Z_pressed", buttonPressed);

        bouton3.setBounds(HEIGHT/10, HEIGHT/10*6, WIDTH/12, WIDTH/12);
        bouton3.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton3.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton3.addActionListener(buttonPressed);
        bouton3.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E,0), "E_pressed");
        bouton3.getActionMap().put("E_pressed", buttonPressed);

        bouton4.setBounds(HEIGHT/10, HEIGHT/10*8, WIDTH/12, WIDTH/12);
        bouton4.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton4.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton4.addActionListener(buttonPressed);
        bouton4.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R,0), "R_pressed");
        bouton4.getActionMap().put("R_pressed", buttonPressed);

        boutonMenu.setBounds(HEIGHT/10, HEIGHT/10*4, WIDTH/10*2, WIDTH/10);
        boutonMenu.setFont(new Font("MV BOLI",Font.ITALIC,35));
        boutonMenu.setFocusable(false); //pas faire surbriller le bouton qd on clique
        boutonMenu.addActionListener(buttonPressed);
        boutonMenu.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW).
                put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,0), "A_pressed");
        boutonMenu.getActionMap().put("A_pressed", buttonPressed);
        boutonMenu.addActionListener(e -> {frame.dispose(); Menu q = new Menu();});
        boutonMenu.setText("MENU");

        rep1.setBounds(WIDTH/10*2, WIDTH/10, HEIGHT,WIDTH/12);
        rep1.setBackground(new Color(255,153,153));
        rep1.setForeground(new Color(0,153,76));
        rep1.setFont(new Font("MV Boli",Font.PLAIN,45));
        

        rep2.setBounds(WIDTH/10*2, WIDTH/10*2+20, HEIGHT,WIDTH/12);
        rep2.setBackground(new Color(255,153,153));
        rep2.setForeground(new Color(0,153,76));
        rep2.setFont(new Font("MV Boli",Font.PLAIN,45));

        rep3.setBounds(WIDTH/10*2, WIDTH/10*3+40, HEIGHT,WIDTH/12);
        rep3.setBackground(new Color(255,153,153));
        rep3.setForeground(new Color(0,153,76));
        rep3.setFont(new Font("MV Boli",Font.PLAIN,45));

        rep4.setBounds(WIDTH/10*2, WIDTH/10*4+60, HEIGHT,WIDTH/12);
        rep4.setBackground(new Color(255,153,153));
        rep4.setForeground(new Color(0,153,76));
        rep4.setFont(new Font("MV Boli",Font.PLAIN,45));

        secondes_restantes.setBounds(WIDTH/4*3,390,300,300);
        secondes_restantes.setBackground(new Color(255,153,204));
        secondes_restantes.setForeground(new Color(255,204,229));
        secondes_restantes.setFont(new Font("Ink Free",Font.BOLD,100));
        secondes_restantes.setBorder(BorderFactory.createBevelBorder(1));
        secondes_restantes.setOpaque(true);
        secondes_restantes.setHorizontalAlignment(JTextField.CENTER);
        secondes_restantes.setText(String.valueOf(secondes)); //convertir entier en string

        temps.setBounds(WIDTH/4*3,290,300,100);
        temps.setBackground(new Color(255,153,204));
        temps.setForeground(new Color(255,0,0));
        temps.setFont(new Font("Ink Free",Font.PLAIN,50));
        temps.setHorizontalAlignment(JTextField.CENTER);
        temps.setText("Timer");

        //après la partie, affichage score+pourcentage
        bonnes_reponses.setBounds(WIDTH/5*2,200,450,300);
        bonnes_reponses.setBackground(new Color(153,191,255));
        bonnes_reponses.setForeground(new Color(153,153,255));
        bonnes_reponses.setFont(new Font("Ink Free",Font.BOLD,100));
        bonnes_reponses.setBorder(BorderFactory.createBevelBorder(1));
        bonnes_reponses.setHorizontalAlignment(JTextField.CENTER);
        bonnes_reponses.setEditable(false);

        pourcentage.setBounds(WIDTH/5*2,500,450,300);
        pourcentage.setBackground(new Color(153,191,255));
        pourcentage.setForeground(new Color(229,204,255));
        pourcentage.setFont(new Font("Ink Free",Font.BOLD,100));
        pourcentage.setBorder(BorderFactory.createBevelBorder(1));
        pourcentage.setHorizontalAlignment(JTextField.CENTER);
        pourcentage.setEditable(false);

        //ajout à l'ecran:
        frame.add(textField); frame.add(textArea);
        frame.add(nck);
        frame.add(bouton1); frame.add(bouton2); frame.add(bouton3); frame.add(bouton4);
        frame.add(rep1); frame.add(rep2); frame.add(rep3); frame.add(rep4);
        frame.add(secondes_restantes); frame.add(temps);

        frame.setVisible(true); //pour que ca s'affiche

        Question_suivante(); //on appelle la 1ere quest qui appelera les autres
    }

    public void Question_suivante(){
        if(position>=nb_quest){
            resultats(); //si on a fait toute les questions, on affiche le résultat
        }
        else{
            nbAleatoire = Quiz.nbAleatoire();

            textField.setText("Question "+(position+1)); //passer a la question suivante
            textArea.setText(recherche_quest(nbAleatoire));

            tabChoix = recherche_choix(nbAleatoire);

            rep1.setText(tabChoix[0]);
            rep2.setText(tabChoix[1]);
            rep3.setText(tabChoix[2]);
            rep4.setText(tabChoix[3]);
            timer.start();

        }
    }
    AbstractAction buttonPressed = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) { //pour les clics de souris, existe deja
            System.out.println(e.getActionCommand());
            //pour ne plus pouvoir cliquer une fois apres
            bouton1.setEnabled(false);
            bouton2.setEnabled(false);
            bouton3.setEnabled(false);
            bouton4.setEnabled(false);
            //quel bouton est cliqué:
            if(e.getSource()==bouton1){reponse=tabChoix[0];} //bouton 1 est cliqué alors on met reponse A
            if(e.getSource()==bouton2){reponse=tabChoix[1];}
            if(e.getSource()==bouton3){reponse=tabChoix[2];}
            if(e.getSource()==bouton4){reponse=tabChoix[3];}
            if(Objects.equals(reponse, recherche_reponse(nbAleatoire))){rep_correctes++;} //si A,B,C ou D etait la réponse


            affichage_rep();
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) { //pour les clics de souris, existe deja
        //pour ne plus pouvoir cliquer une fois apres
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        //quel bouton est cliqué:
        if(e.getSource()==bouton1){reponse=tabChoix[0];} //bouton 1 est cliqué alors on met reponse A
        if(e.getSource()==bouton2){reponse=tabChoix[1];}
        if(e.getSource()==bouton3){reponse=tabChoix[2];}
        if(e.getSource()==bouton4){reponse=tabChoix[3];}
        if(Objects.equals(reponse, recherche_reponse(nbAleatoire))){rep_correctes++;} //si A,B,C ou D etait la réponse

        affichage_rep();
    }

    public void affichage_rep(){ //vert si bon, rouge si faux
        timer.stop();
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        if(!Objects.equals(recherche_reponse(nbAleatoire), tabChoix[0])){
            rep1.setForeground(new Color(255,0,0)); //devient rouge (faux)
        }
        if(!Objects.equals(recherche_reponse(nbAleatoire), tabChoix[1])){
            rep2.setForeground(new Color(255,0,0));
        }
        if(!Objects.equals(recherche_reponse(nbAleatoire), tabChoix[2])){
            rep3.setForeground(new Color(255,0,0));
        }
        if(!Objects.equals(recherche_reponse(nbAleatoire), tabChoix[3])){
            rep4.setForeground(new Color(255,0,0));
        }

        Timer delai= new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rep1.setForeground(new Color(25,255,0));
                rep2.setForeground(new Color(25,255,0));
                rep3.setForeground(new Color(25,255,0));
                rep4.setForeground(new Color(25,255,0));
                reponse="";
                secondes=10;
                secondes_restantes.setText(String.valueOf(secondes));
                bouton1.setEnabled(true);
                bouton2.setEnabled(true);
                bouton3.setEnabled(true);
                bouton4.setEnabled(true);
                position++; //aller nouvelle quest
                Question_suivante();
            }
        });
        delai.setRepeats(false);//pour le temps
        delai.start();

    }

    public void resultats(){
        bouton1.setEnabled(false); //on peut plus cliquer dessus
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        bouton1.setVisible(false);
        bouton2.setVisible(false);
        bouton3.setVisible(false);
        bouton4.setVisible(false);
        secondes_restantes.setVisible(false);
        temps.setVisible(false);
        textArea.setVisible(false);
        boutonMenu.setVisible(true);

        resultat= (int)((rep_correctes/(double)nb_quest)*100);
        textField.setText("RESULTATS !");
        textArea.setText("");
        nck.setText("");
        rep1.setText("");
        rep2.setText("");
        rep3.setText("");
        rep4.setText("");
        bonnes_reponses.setText("("+rep_correctes+"/"+nb_quest+")");
        pourcentage.setText(resultat+"%");
        frame.add(bonnes_reponses); frame.add(pourcentage);frame.add(boutonMenu);
        

    }

    //si reponse pas bonne: perdre vie, si plus en vie duel



    //2e jeu: appeler mini jeu 2,kahoot, dernier eliminé, 3 quest, celui qui a le - eliminé, on peut refaire un duel?,

    //3e partie : 1vs1 : 10 questions, 1 par 1, le premier qui a faux a perdu

}
