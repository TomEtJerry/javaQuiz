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
                new String []{"un cheval", "un oiseau", "une vache", "un chien"},"Traduisez ce signe : ",img );
        questions[1] = new Question(1, 1, "un chat",
                new String []{"un lion", "un lapin", "un chat", "un coq"},"Quel est l'animal représenté?",img );
        questions[2] = new Question(2, 1, "un cheval",
                new String []{"un éléphant", "un cheval", "un cochon", "une chèvre"},"Quel animal est représenté grâce à ce signe?",img );
        questions[3] = new Question(3, 1, "un lion",
                new String []{"un lion", "un zèbre", "une girafe", "une poule"},"Sauras-tu reconnaître l'animal représenté?",img );
        questions[4] = new Question(4, 1, "une poule",
                new String []{"un coq", "un oiseau", "une poule", "un chien"},"Ce signe traduit quel animal?",img );
        questions[5] = new Question(5, 1, "un cochon",
                new String []{"un zèbre", "un cochon", "un lapin", "une chèvre"},"L'animal représenté est :",img );
        questions[6] = new Question(6, 1, "une girafe",
                new String []{"un lion", "une vache", "une girafe", "un oiseau"},"Quel animal est représenté grâce à ce signe?",img );
        questions[7] = new Question(7, 1, "un zèbre",
                new String []{"un lapin", "un coq", "un chat", "un zèbre"},"Traduisez ce signe :",img );
        questions[8] = new Question(8, 1, "un éléphant",
                new String []{"une poule", "un oiseau", "un éléphant", "une vache"},"L'animal représenté est :",img );
        questions[9] = new Question(9, 1, "un oiseau",
                new String []{"un oiseau", "une chèvre", "un chien", "un éléphant"},"Quel animal est représenté grâce à ce signe?",img );
        questions[10] = new Question(10, 1, "une chèvre",
                new String []{"une chèvre", "une girafe", "un oiseau", "un zèbre"},"Ce signe traduit quel animal?",img );
        questions[11] = new Question(11, 1, "un lapin",
                new String []{"un lion", "un lapin", "un éléphant", "un coq"},"Quel est l'animal représenté?",img );
        questions[12] = new Question(12, 1, "une vache",
                new String []{"une poule", "un cheval", "un chien", "une vache"},"Sauras-tu reconnaître l'animal représenté?",img );

        questions[13] = new Question(13, 2, "X",
                new String []{"X", "E", "T", "O"},"Quelle lettre est représentée ?",img );
        questions[14] = new Question(14, 2, "Fourchette",
                new String []{"Fourchette", "Vélo", "Porte", "Manche"},"Quel mot commence par cette lettre ?",img );

        questions[15] = new Question(15, 3, "Je vais bien",
                new String[]{"Je vais bien", "Je suis étudiant", "Je suis majeure", "Je fais du sport"}, "Comment répondre au signe ?", img);
        questions[16] = new Question(16, 3, "Je m'appelle pseudo",
                new String[]{"Je m'appelle pseudo","Je suis étudiant","Je me sens bien","J'adore ce jeu !"},"Essaye de répondre correctement à la question !", img );
        questions[17] = new Question(17, 3, "Quel âge as-tu ?",
                new String[]{"Quel âge as-tu ?", "Comment t'appelles-tu ?","Quelles sont tes origines ?","x"},"Quelle question est posée ?", img);
        questions[18] = new Question(18, 3, "D'où viens-tu ?",
                new String[]{"D'où viens-tu ?", "Ques fais-tu dans la vie ?", "As-tu des enfants", "Commment vas-tu ?"},"Quelle question est posée ?",img);
        questions[19] = new Question(19, 3, "J'ai faim !",
                new String[]{"J'ai faim !", "J'ai soif !", "Il est tard !", "J'ai chaud !"},"De quoi se plaint le signe ?",img);
        questions[20] = new Question(20, 3, "Il fait beau !",
                new String[]{"Il fait beau !", "Je m'appelle pseudo", "J'ai faim", "Je suis à l'EFREI"},"Essaye de répondre correctement à la question !",img);

        questions[21] = new Question(21, 4, "Danse",
                new String[]{"Danse", "Football", "Karaté", "Natation"},"De quel sport s'agit-il ?",img);
        questions[22] = new Question(22, 4, "Tony Parker",
                new String[]{"Tony Parker", "Lionel Messi", "Teddy Riner", "Roger Federer"},"Qui pratique ce sport ?",img);
        questions[23] = new Question(23, 4, "Handball",
                new String[]{"Handball", "Lutte", "Ping-Pong", "Volley-ball"},"De quel sport s'agit-il ?",img);
        questions[24] = new Question(24, 4, "Musculation",
                new String[]{"Musculation", "Badminton", "Boxe", "Aucun"},"Dans quel sport utilise-t-on cet objet",img);
        questions[25] = new Question(25, 4, "Mohamed Ali",
                new String[]{"Mohamed Ali", "Usain Bolt", "Zinedine Zidane", "Michael Schumacher"},"Qui excellait dans ce sport ?",img);

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
