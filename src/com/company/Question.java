package com.company;

import javax.swing.*;
import java.util.*;

public class Question {
    int indice; // dans le tableau de questions
    int theme; //numero qui permet de faire des groupes par themes
    String reponse; // bonne réponse
    String [] tab; // tableau des options de réponse
    String question; // la question
    ImageIcon img; // image associée à la question

    // Si réponse image => tableau d'image pour les réponses -> faire une classe fille de question en modifiant ce parametre

    public Question(int indice, int theme, String reponse, String [] tab, String question, ImageIcon img){ //constructeur
        this.indice = indice;
        this.theme = theme;
        this.reponse = reponse;
        this.tab = tab;
        this.question = question;
        this.img = img;
    }

    public static String[] melanger_tab_rep(String[] tab){ // melange le tableau de réponse pour pas avoir tout le temps le meme ordre
        List<String> list =Arrays.asList(tab); // mélanger le tableau
        Collections.shuffle(list);

        return list.toArray(tab);
    }

    public static Question getQuestionFull(int nbr_aleatoire){ //obtien une question aleatoire (pas juste la question mais tout ce qu'elle comporte, donc avec reponse img etc...)

        Question [] questions = new Question[50]; //tab de questions

        ImageIcon img = new ImageIcon("D:\\Projet transverse L2\\ProjetTransverseL2\\src\\giphy.gif");

        questions[0] = new Question(0, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[1] = new Question(1, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[2] = new Question(2, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[3] = new Question(3, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[4] = new Question(4, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[5] = new Question(5, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[6] = new Question(6, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[7] = new Question(7, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[8] = new Question(8, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[9] = new Question(9, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[10] = new Question(10, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[11] = new Question(11, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[12] = new Question(12, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[13] = new Question(13, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[14] = new Question(14, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );
        questions[15] = new Question(15, 1, "un chien",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ",img );

        return questions[nbr_aleatoire];

    }

    public String getQuestion(){
        return question;
    }

    public String[] getChoix(){
        return tab;
    }

    public String getReponse(){
        return reponse;
    }
}
