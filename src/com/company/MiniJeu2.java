//package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

//principaux trucs a faire: le classement, demander nom

//public class MiniJeu2 extends Quiz{
   /* Joueur j=new Joueur();
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

    MiniJeu2(){
        //demander nom au joueur
        Touche touche=new Touche();
        rep_correctes=0;
        nb_quest= 5;
        secondes=15;
        position=0;

        choix=new String[10];
        int a=nbAleatoire();
        recherche_quest(a);
        recherche_choix(a);
        creerTabChoix(a);

        //Object [][] classement={{1,"felix",100}, {2,"ilyes",90}, {3,"alixia",30}, {4,"tom",20}, {5,"mordjane",10}};//on affiche que les 5 premiers, avec leur nom et leur score
        //String [] entete={"Position:", "nom :", "score :"};

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cadre
        frame.setSize(650,650); //taille du cadre
        frame.getContentPane().setBackground(new Color(153,255,204)); //couleur de fond
        frame.setLayout(null); //pour pas que ca bouge selon taille de l'ecran
        frame.setResizable(false); //on peut pas modifier taille fenetre

        textField.setBounds(0,0,650,50);
        textField.setBackground(new Color(255,204,153));
        textField.setForeground(new Color(102,0,51)); //couleur texte
        textField.setFont(new Font("Century Schoolbook",Font.BOLD,30)); //reglages police
        textField.setBorder(BorderFactory.createBevelBorder(1));  //mettre des bords
        textField.setHorizontalAlignment(JTextField.CENTER); //centrer
        textField.setEditable(false); //l'utilisateur peut pas changer les tailles

        textArea.setBounds(0,50,650,50);
        textArea.setLineWrap(true); //passe ligne suivante si texte trop grand
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(255,255,102));
        textArea.setForeground(new Color(255,153,153)); //couleur texte
        textArea.setFont(new Font("MV Boli",Font.BOLD,25)); //reglages police
        textArea.setBorder(BorderFactory.createBevelBorder(1));  //mettre des bords
        textArea.setEditable(false); //l'utilisateur peut pas changer les tailles

        bouton1.setBounds(0,100,100,100);
        bouton1.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton1.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton1.addActionListener(this);

        bouton2.setBounds(0,200,100,100);
        bouton2.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton2.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton2.addActionListener(this);

        bouton3.setBounds(0,300,100,100);
        bouton3.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton3.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton3.addActionListener(this);

        bouton4.setBounds(0,400,100,100);
        bouton4.setFont(new Font("MV BOLI",Font.ITALIC,35));
        bouton4.setFocusable(false); //pas faire surbriller le bouton qd on clique
        bouton4.addActionListener(this);

        rep1.setBounds(125,100,500,100);
        rep1.setBackground(new Color(255,153,153));
        rep1.setForeground(new Color(0,153,76));
        rep1.setFont(new Font("MV Boli",Font.PLAIN,35));

        rep2.setBounds(125,200,500,100);
        rep2.setBackground(new Color(255,153,153));
        rep2.setForeground(new Color(0,153,76));
        rep2.setFont(new Font("MV Boli",Font.PLAIN,35));

        rep3.setBounds(125,300,500,100);
        rep3.setBackground(new Color(255,153,153));
        rep3.setForeground(new Color(0,153,76));
        rep3.setFont(new Font("MV Boli",Font.PLAIN,35));

        rep4.setBounds(125,400,500,100);
        rep4.setBackground(new Color(255,153,153));
        rep4.setForeground(new Color(0,153,76));
        rep4.setFont(new Font("MV Boli",Font.PLAIN,35));

        secondes_restantes.setBounds(535,510,100,100);
        secondes_restantes.setBackground(new Color(255,153,204));
        secondes_restantes.setForeground(new Color(255,204,229));
        secondes_restantes.setFont(new Font("Ink Free",Font.BOLD,60));
        secondes_restantes.setBorder(BorderFactory.createBevelBorder(1));
        secondes_restantes.setOpaque(true);
        secondes_restantes.setHorizontalAlignment(JTextField.CENTER);
        secondes_restantes.setText(String.valueOf(secondes)); //convertir entier en string

        temps.setBounds(535,475,100,25);
        temps.setBackground(new Color(255,153,204));
        temps.setForeground(new Color(255,0,0));
        temps.setFont(new Font("Ink Free",Font.PLAIN,20));
        temps.setHorizontalAlignment(JTextField.CENTER);
        temps.setText("Timer");

        //après la partie, affichage score+Scores
        Classement.setBounds(125,225,200,250);
        Classement.setBackground(new Color(153,153,153));
        Classement.setForeground(new Color(153,153,255));
        Classement.setFont(new Font("Ink Free",Font.BOLD,50));
        Classement.setBorder(BorderFactory.createBevelBorder(1));
        Classement.setHorizontalAlignment(JTextField.CENTER);
        Classement.setEditable(false);

        Scores.setBounds(325,225,100,250);
        Scores.setBackground(new Color(80, 22, 61));
        Scores.setForeground(new Color(229,204,255));
        Scores.setFont(new Font("Ink Free",Font.BOLD,50));
        Scores.setBorder(BorderFactory.createBevelBorder(1));
        Scores.setHorizontalAlignment(JTextField.CENTER);
        Scores.setEditable(false);
        //JTable tab =new JTable(classement,entete);

        //ajout à l'ecran:
        frame.add(textField); frame.add(textArea);
        frame.add(bouton1); frame.add(bouton2); frame.add(bouton3); frame.add(bouton4);
        frame.add(rep1); frame.add(rep2); frame.add(rep3); frame.add(rep4);
        frame.add(secondes_restantes); frame.add(temps);
        //frame.getContentPane().add(tab.getTableHeader(),BorderLayout.NORTH);
        //frame.getContentPane().add(tab);

        frame.setVisible(true); //pour que ca s'affiche

        Question_suivante(); //on appelle la 1ere quest qui appelera les autres
    }

    public void Question_suivante(){
        if(position>=nb_quest){ // a enlever apres, en mettant si temps=0 dans l'autre fct
            resultats();
        }
        else{

            int a=super.nbAleatoire();
            super.recherche_quest(a);
            super.recherche_choix(a);
            super.creerTabChoix(a);

            textField.setText("Question "+(position+1)); //passer a la question suivante
            textArea.setText(questions);
            rep1.setText(choix[0]);
            rep2.setText(choix[1]);
            rep3.setText(choix[2]);
            rep4.setText(choix[3]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) { //pour les clics de souris, existe deja
        //pour ne plus pouvoir cliquer une fois apres
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        //quel bouton est cliqué:
        if(e.getSource()==bouton1){reponse='A';} //bouton 1 est cliqué alors on met reponse A
        if(e.getSource()==bouton2){reponse='B';}
        if(e.getSource()==bouton3){reponse='C';}
        if(e.getSource()==bouton4){reponse='B';}
        if(reponse==reponses) {
            if (position % 3 == 0) {
                j.score += ((50 + (secondes * 10))) * 1.5; //question qui fait gagner +
            } else {
                if (position % 5 == 0) {
                    j.score += ((50 + (secondes * 10))) * 2; //question qui fait gagner +
                } else {
                    j.score += (50 + (secondes * 10)); //score normal
                }
            } //si A,B,C ou D etait la réponse
        }
        affichage_rep(); //je pense qu'on a plus besoin de ca, autant passer a quest suivante direct
        // genre: question, quest suivante... s'arrete des que chrono a 0 et aff resultat (mais bug sans aff rep)
    }


    public void affichage_rep(){
        timer.stop();
        bouton1.setEnabled(false);
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);
        Timer delai= new Timer(500, new ActionListener() { //mettre delai apres le clic (0.5s)
            @Override
            public void actionPerformed(ActionEvent e) {
                reponse=' ';
                //secondes=30;
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
        secondes_restantes.setText("");
        bouton1.setEnabled(false); //on peut plus cliquer dessus
        bouton2.setEnabled(false);
        bouton3.setEnabled(false);
        bouton4.setEnabled(false);

        resultat= (int)((rep_correctes/(double)nb_quest)*100);
        textField.setText("CLASSEMENT !");
        textArea.setText("");
        rep1.setText("");
        rep2.setText("");
        rep3.setText("");
        rep4.setText("");

        Classement.setText("("+rep_correctes+"/"+nb_quest+")"); //faire classement, avec non classé
        Scores.setText(""+j.score);
        frame.add(Classement); frame.add(Scores);

    }

    */

//}
