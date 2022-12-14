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

        questions[0] = new Question(1, 1, "des nombres entiers", 
                new String []{"des nombres entiers", "des nombres flottants", "des chaînes de caractères", "des booléens"},"Qu'est-ce que le type 'int' en Java ?");

        questions[1] = new Question(2, 1, "déclarer une classe ou une méthode comme abstraite", 
                new String []{"déclarer une constante", "déclarer une variable", "déclarer une classe ou une méthode comme abstraite", "déclarer une exception"},"Quel est le rôle du mot-clé 'abstract' en Java ?");
        
        questions[2] = new Question(3, 1, "permet de garantir un accès exclusif à une portion de code pour un seul thread", 
                new String []{"déclarer une constante", "déclarer une variable", "déclarer une méthode comme abstraite", "permet de garantir un accès exclusif à une portion de code pour un seul thread"},"Quel est le rôle du mot-clé 'synchronized' en Java ?");

        questions[3] = new Question(4, 1, "Un modèle, créer des objets et des comportements communs",
                new String []{"Un type de données qui permet de stocker des informations", "Un modèle, créer des objets et des comportements communs", "Un fichier qui contient du code Java", "un package"},"Qu'est-ce qu'une classe en Java ? ");

        questions[4] = new Question(5, 1, "une erreur",
                new String []{"3", "3.141592653589793", "0.141592653589793", "une erreur"},"Que renvoie (int)math.PI ? ");

        questions[5] = new Question(6, 1, "Valeur stockée dans un espace mémoire dont la taille dépend du type", 
                new String []{"des objets", "des nombres entiers", "des nombres flottants", "Valeur stockée dans un espace mémoire dont la taille dépend du type"},"Qu'est-ce que les variables primitives en Java ?");

        questions[6] =new Question(7, 1, "déclarer une constante:", 
                new String []{"Déclarer une constante", "déclarer une variable", "déclarer une méthode", "déclarer une classe"},"Quel est le rôle du mot-clé 'final' en Java ?");

        questions[7] =new Question(8, 1, "l'héritage", 
                new String []{"l'héritage", "l'interface", "l'encapsulation", "l'abstraction"},"Comment se réalise le polymorphisme en Java ?");

        questions[8] =new Question(9, 1, "Comparer deux objets en vérifiant leur adresse mémoire", 
                new String []{"Comparer deux objets en vérifiant leur contenu", "Comparer deux objets en vérifiant leur adresse mémoire", "convertir un objet en chaîne de caractères", "convertir un objet en type primitif"},"Qu'est-ce que la méthode 'equals()' en Java ?");

        questions[9] =new Question(10, 1, "créer une seule instance d'une classe", 
                new String []{"créer plusieurs instances d'une classe", "créer une seule instance d'une classe", "Créer une instance d'une classe à chaque appel de méthode", "créer une instance d'une classe en fonction d'un paramètre"},"Quel est le but du pattern Singleton en Java ?");

        questions[10] = new Question(11, 1, "Renvoie une chaîne de caractères représentant l'objet", 
                new String []{"comparer deux objets en vérifiant leur contenu", "comparer deux objets en vérifiant leur adresse mémoire", "Renvoie une chaîne de caractères représentant l'objet", "convertir un objet en type primitif"},"Qu'est-ce que la méthode 'toString()' en Java ?");

        questions[11] = new Question(12, 1, "Mettre en place un mécanisme de notification entre différents objets", 
                new String []{"créer plusieurs instances d'une classe", "créer une seule instance d'une classe", "Mettre en place un mécanisme de notification entre différents objets", "créer une instance d'une classe en fonction d'un paramètre"},"Quel est le but du pattern Observer en Java ?");

        questions[12] = new Question(13, 1, "déclarer une classe comme étant une sous-classe d'une autre classe", 
                new String []{"Déclarer une interface", "déclarer une classe comme étant une sous-classe d'une autre classe", "déclarer une exception", "déclarer une variable d'instance comme 'final'"},"Quel est le rôle du mot-clé 'extends' en Java ?");   

        questions[13] = new Question(14, 1, "Variables locales", 
                new String []{"Variables d'interface", "Variables de classe", "Variables d'instance", "Variables locales"},"Quelles variables ont une portée limitée à une méthode?");

        questions[14] = new Question(15, 1, "java.lang", 
                new String []{"java.util", "java.lang", "system.lang","java.system"},"Quel paquet est importé dans chaque classe Java par défaut?");

        questions[15] = new Question(16, 1, "Break",
                new String []{"Continue", "Break", "Exit", "Stop"},"Quel est le mot-clé utilisé pour arrêter une boucle en Java? ");

        questions[16] = new Question(17, 1, "import Example",
                new String []{"import Example", "include Example", "require Example", "using Example"},"Quelle est la bonne syntaxe pour importer une classe nommée 'Example' dans un fichier Java? ");

        questions[17] = new Question(18, 1, "Class A extends B",
                new String []{"Class A extends B", "Class A : B", "Class A inherits B", "Class A implements B"},"Que faut-il écrire pour que la classe A hérite de la classe B ? ");

        questions[18] = new Question(19, 1, "Constant",
                new String []{"Constant", "Ne peut être hérité", "inutile", "Ne peut être accéder par une autre classe "},"Dans une classe, un attribut 'static' est... ? ");

        questions[19] = new Question(20, 1, "Que des méthodes abstraites",
                new String []{"Que des méthodes abstraites", "Tout ce que l'on veut ", "Méthodes abstraites et concretes", "Méthoddes abstraites et constantes"},"Que contient une interface ? ");

        questions[20] = new Question(21, 1, "objectName = new ClassName()",
                new String []{"objectName = new ClassName()", "class ClassName = new objectName()", "ClassName objectName = new ClassName()", "objectName = new ClassName"},"Quelle est la syntaxe pour créer un objet en Java? ? ");

        questions[21] = new Question(22, 1, "javafx",
                new String []{"Swing", "awt", "directx", "javafx"},"Quel package / structure est la plus récente pour les interfaces graphiques ? ");

        questions[22] = new Question(23, 1, "Protected",
                new String []{"Pubilc","Protected","Private","Nothing"},"Variable visible SEULEMENT par une ou plusieurs classes filles :");
                
        questions[23] = new Question(24, 1, "une classe mère",
                new String []{"une classe main", "une classe mère", "une classe public", "une classe du langage Java"},"Qu'est-ce qu'une 'super classe' ? ");
        questions[24] = new Question(1, 2, "Usagi Tsukino", 
                new String []{"Usagi Tsukinoooooh", "Usagi Tsukin-water", "Usagi Tsukinau", "Usagi Tsukino"},"Quel est le nom de l'héroïne de l'animé 'Sailor Moon'?");
        questions[25] = new Question(2, 2, "Naruto Uzumaki", 
                new String []{"Naruto Uzumaki", "Norauto Uzumaki", "Naruto Uzumakiki", "Minato Namikaze"},"Quel est le nom du héros de l'animé 'Naruto'?");
        questions[26] = new Question(3, 2, "Rurouni Kenshin", 
                new String []{"Rurounii Kenshin impact", "Afro Samurai", "Berserk", "Rurouni Kenshin"},"Quel est le titre de l'animé avec Kenshin Himura ?");
        questions[27] = new Question(4, 2, "One Piece", 
                new String []{"Bleach", "Prout", "Le Zoo", "One Piece"},"Quel est le titre de l'animé avec Monkey D. Luffy ?");
        questions[28] = new Question(5, 2, "Fairy Tail", 
                new String []{"One Piece", "Fé attention", "Chien de Squezzie", "Fairy Tail"},"Quel est le titre de l'animé avec Natsu Dragneel ?"); 
        questions[29] = new Question(6, 2, "Food Wars!", 
                new String []{"French Wars", "Star Wars", "Sexe Wars", "Food Wars!"},"Quel animé avec Soma Yukihira, un jeune chef maitrisant le francais?");
        questions[30] = new Question(7, 2, "Your Lie in April", 
                new String []{"Your truth in April", "Your Lie in April", "Your lie in 23/03/2034", "Your lit in Nombril"},"Quel est le titre de l'animé avec Kousei Arima ?");
        questions[31] = new Question(8, 2, "The Rising of the Shield Hero", 
                new String []{"Sword Art Online", "The Rising of the Shield Hero", "My Hero Academia", "Jojo's Bizarre Adventure"},"Quel est le titre de l'animé avec Kimimaro Yoga ?");
        questions[32] = new Question(9, 2, "Parasyte", 
                new String []{"Paratonerre", "Akame ga Kill", "Pare-balle", "Parasyte"},"Quel est le titre de l'animé avec Shinichi Izumi ?"); 
        questions[33] = new Question(10, 2, "Death Note", 
                new String []{"Mi-death-life Note", "Erased", "Death Note", "Life Note"},"Quel est le titre de l'animé avec Light Yagami?");
        questions[34] =new Question(11, 2, "One Punch Man", 
                new String []{"Death Note", "One Punch Man", "Two Punch Man", "One and a half Punch Man"},"Quel est le titre de l'animé avec Saitama?");

            
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
