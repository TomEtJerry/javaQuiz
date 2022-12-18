package com.company;

import javax.swing.*;
import java.util.*;

public class QuestionB {
    int indice; // dans le tableau de questions
    int theme; //numero qui permet de faire des groupes par themes
    String reponse; // bonne réponse
    String [] tab; // tableau des options de réponse
    String question; // la question
    ImageIcon img; // image associée à la question

    // Si réponse image => tableau d'image pour les réponses -> faire une classe fille de question en modifiant ce parametre

    public QuestionB(int indice, int theme, String reponse, String [] tab, String question){ //constructeur
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

    public static QuestionB getQuestionFull(int nbr_aleatoire){ //obtien une question aleatoire (pas juste la question mais tout ce qu'elle comporte, donc avec reponse img etc...)

        QuestionB [] questions = new QuestionB[50]; //tab de questions

        questions[0] = new QuestionB(1, 1, "des nombres entiers", 
                new String []{"des nombres entiers", "des vliyegvemkhkbtants", "des chaînes de caractères", "des booléens"},"Qu'est-ce que le type 'int' en Java ?");

        questions[1] = new QuestionB(2, 1, "déclarer une classe ou une méthode comme abstraite", 
                new String []{"déclalvehibstante", "déclarer une variable", "déclarer une classe ou une méthode comme abstraite", "déclarer une exception"},"Quel est le rôle du mot-clé 'abstract' en Java ?");
        
        questions[2] = new QuestionB(3, 1, "permet de garantir un accès exclusif à une portion de code pour un seul thread", 
                new String []{"déclveliyvgete", "déclarer une variable", "déclarer une méthode comme abstraite", "permet de garantir un accès exclusif à une portion de code pour un seul thread"},"Quel est le rôle du mot-clé 'synchronized' en Java ?");

        questions[3] = new QuestionB(4, 1, "Un modèle, créer des objets et des comportements communs",
                new String []{"Un vpeiyg de données qui permet de stocker des informations", "Un modèle, créer des objets et des comportements communs", "Un fichier qui contient du code Java", "un package"},"Qu'est-ce qu'une classe en Java ? ");

        questions[4] = new QuestionB(5, 1, "une erreur",
                new String []{"3veoiyg", "3.141592653589793", "0.141592653589793", "une erreur"},"Que renvoie (int)math.PI ? ");

        questions[5] = new QuestionB(6, 1, "Valeur stockée dans un espace mémoire dont la taille dépend du type", 
                new String []{"devieygvmts", "des nombres entiers", "des nombres flottants", "Valeur stockée dans un espace mémoire dont la taille dépend du type"},"Qu'est-ce que les variables primitives en Java ?");

        questions[6] =new QuestionB(7, 1, "Déclarer une constante:", 
                new String []{"Déclarer une constante", "dévleougyble", "déclarer une méthode", "déclarer une classe"},"Quel est le rôle du mot-clé 'final' en Java ?");

        questions[7] =new QuestionB(8, 1, "l'héritage", 
                new String []{"l'héritage", "l'livyegce", "l'encapsulation", "l'abstraction"},"Comment se réalise le polymorphisme en Java ?");

        questions[8] =new QuestionB(9, 1, "Comparer deux objets en vérifiant leur adresse mémoire", 
                new String []{"Compveziuveyg", "Comparer deux objets en vérifiant leur adresse mémoire", "convertir un objet en chaîne de caractères", "convertir un objet en type primitif"},"Qu'est-ce que la méthode 'equals()' en Java ?");

        questions[9] =new QuestionB(10, 1, "créer une seule instance d'une classe", 
                new String []{"crvezgzepgib", "créer une seule instance d'une classe", "Créer une instancezikghelzkhbvezvze d'une classe à chaque appel de méthode", "créer une instance d'une classe en fonction d'un paramètre"},"Quel est le but du pattern Singleton en Java ?");

            
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
