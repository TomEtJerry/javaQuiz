package com.company;

import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import com.company.qmemory;

public abstract class Quiz implements ActionListener{ // class Quiz

    protected String question; //question actuelle
    protected String[] choix; //choix des reponses dans l'ordre des questions
    protected String reponse;
    protected int position;
    protected int rep_correctes;
    protected int nb_quest;
    protected int resultat; //score final
    protected int secondes; //mettre temps

    //interface graphique:
    JFrame frame= new JFrame(); //cadre graphique
    JTextField textField= new JTextField(); //question actuelle
    JTextArea textArea= new JTextArea();//cadre pour la question

    JLabel nck= new JLabel();

    JButton bouton1 =new JButton(); //les 4 choix de bouton
    JButton bouton2 =new JButton();
    JButton bouton3 =new JButton();
    JButton bouton4 =new JButton();
    JButton boutonMenu =new JButton();

    JLabel rep1= new JLabel(); //etiquettes pour les reponses
    JLabel rep2= new JLabel();
    JLabel rep3= new JLabel();
    JLabel rep4= new JLabel();

    JLabel temps=new JLabel(); //etiquette pour le temps
    JLabel secondes_restantes=new JLabel();

    JTextField bonnes_reponses=new JTextField(); //etiquettes pour après, score... //number_right
    JTextField pourcentage=new JTextField();

    JTextField Scores=new JTextField();
    JTextField Classement=new JTextField();




    //une dans question et l'autre dans choix, qui est sous la forme: bonneRep rep1 rep2 rep 3 rep4
    public static int nbAleatoire(int theme){
        int ret;

        ThreadLocalRandom tlr = ThreadLocalRandom.current(); //chercher question aleatoire
        if(theme == 1){
            do{
                ret = tlr.nextInt(0, 23 + 1); //donne num aleatoire entre 0 et 23
            }while(qmemory.intMem.contains(ret));
        }
        else if(theme == 2){
            do{
                ret = tlr.nextInt(24, 34 + 1); //donne num aleatoire entre 0 et 34
            }while(qmemory.intMem.contains(ret));
        }
        else{
            return 0;
        }
        qmemory.intMem.add(ret);
        System.out.println(ret);
        System.out.println(qmemory.intMem);
        return ret;
        
    }

    public static String recherche_quest(int nbr){

        return Question.getQuestionFull(nbr).getQuestion();
    }

    public String[] recherche_choix(int nbr){

        return Question.melanger_tab_rep(Question.getQuestionFull(nbr).getChoix());

    }

    public String recherche_reponse(int nbr){

        return Question.getQuestionFull(nbr).getReponse();
    }



}
