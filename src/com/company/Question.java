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

    public Question(int indice, int theme, String reponse, String [] tab, String question){ //constructeur
        this.indice = indice;
        this.theme = theme;
        this.reponse = reponse;
        this.tab = tab;
        this.question = question;
    }

    public static String[] melanger_tab_rep(String[] tab){ // melange le tableau de réponse pour pas avoir tout le temps le meme ordre
        List<String> list =Arrays.asList(tab); // mélanger le tableau
        Collections.shuffle(list);

        return list.toArray(tab);
    }

    public static Question getQuestionFull(int nbr_aleatoire){ //obtien une question aleatoire (pas juste la question mais tout ce qu'elle comporte, donc avec reponse img etc...)

        Question [] questions = new Question[50]; //tab de questions

        questions[0] = new Question(0, 1, "rep A",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ");
        questions[1] = new Question(1, 1, "rep B",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ");
        questions[2] = new Question(2, 1, "rep C",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ");
        questions[3] = new Question(3, 1, "rep D",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ");
        questions[4] = new Question(4, 1, "rep A",
                new String []{"rep A", "rep B", "rep C", "rep D"},"Question 1 ? ");
        questions[5] = new Question(8, 1, "une erreur",
                new String []{"3", "3.141592653589793", "0.141592653589793", "une erreur"},"Que renvoie (int)math.PI ? ");

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
