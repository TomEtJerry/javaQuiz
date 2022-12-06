package com.company;

public class Joueur extends MiniJeu1 {
    protected String nom;
    protected int id=0;
    protected int nb_vie;
    protected boolean en_vie;
    protected int classement;
    protected int choix;
    protected int score;


    Joueur(){
        id++;
        nb_vie=2;
        en_vie=true;
        score=0;
    }

    Joueur(String pseudo){
        id++;
        nb_vie=2;
        en_vie=true;
        score=0;
        nom=pseudo;
    }

    public void perdre_vie(){
        nb_vie--;
        if(nb_vie<=0){
            en_vie=false;
        }
    }

    public void supp_joueur(int i){
        Joueur [] tab=new Joueur[3];
        int j=0;
        while(j<4){
            if(j!=i){
                tab[j]=super.joueurs[i];
                j++;
            }
            else{
                i--; //pour plus le croiser et finir la boucle
            }
        }
        super.joueurs=tab;
    }

    //supprimer joueur
}
