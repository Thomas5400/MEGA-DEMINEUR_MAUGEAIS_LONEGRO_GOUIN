/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.demineur_maugeais_lonegro_gouin;

/**
 *
 * @author gouin
 */
public class Joueur { //création de la classe joueur
    String nom;
    int pointDeVie;
    int nombreKit;
    
    public Joueur(String nom) {    //Constructeur de la classe
        this.nom = nom;
        this.pointDeVie = 3;
        this.nombreKit = 0;
    }
    
    public void obtenirKit() {   //méthode permettant d'ajouter un Kit de déminage
        nombreKit += 1;
    }
    public void utiliserKit(){   //méthode permettant d'enlever un Kit de déminage
        nombreKit -= 1;
    }

    public int getNombreKit() {  //on créer un getter pour le nombre de kit
        return nombreKit;
    }

    public int getPointDeVie() {  //on créer un getter pour le nombre de PV
        return pointDeVie;
    }
    
    

}


