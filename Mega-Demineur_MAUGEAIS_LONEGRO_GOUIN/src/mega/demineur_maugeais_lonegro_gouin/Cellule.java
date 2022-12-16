/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.demineur_maugeais_lonegro_gouin;

/**
 *
 * @author gouin
 */
public class Cellule { //on créer la classe Cellule

    boolean activationBombe;
    boolean bombeCourant;
    boolean avoirKit;
    boolean vie;
    boolean activationKit; //ajout d'un nouvel atribue
    boolean B1;// on créer trois boules qui représente le nombre de bombes à proximité de la case
    boolean B2;
    boolean B3;
    boolean B0;
    
    public Cellule() { //constructeur de la classe
        B0= false;
        B3 = false;
        B2 = false;
        B1 =false;
        this.vie = true;
        this.activationBombe = false;
        this.bombeCourant = false;
        this.avoirKit = false;
        this.activationKit =false;
    }
    
    public void Boule0(){// méthode qui sert à passer B0 à true qui va nous permettre à afficher pour la suite la bonne case 
        B0=true;
        
    }
    public void Boule1(){ // méthode qui sert à passer B1 à true qui nous permettra d'afficher la bonne image 
        //si jamais il n'y a qu'une bombe autour de la case on active B1 pour pouvoir afficher la bonne image
        B1=true;
        
    }
    public void Boule2(){//même principe que B1 mais pour deux bombes
        B2=true;
        
    }
    public void Boule3(){//idem pour trois bombes
        B3=true;
    }
    public boolean ExplosionBombe() { // si jamais on est tombé sur une bombe c'est cette méthode que l'on appelera pour activé la bombe et afficher la bone image
        this.activationBombe = true;
        return this.activationBombe;
    }
    
    public boolean Usagekit(){  // même principe que pour explosionBombe mais avec un kit 
        this.activationKit=true;
        return this.activationKit;
    }

    public boolean supprimervie() { // méthode qui sert à supprimer une vie qui sera utilise pour ne pas afficher que des kits sur le panel où il y a tous les boutons du jeu 
        this.vie = false;
        return this.vie;
    }
    
    public boolean Ajoutervie(){ 
        this.vie = true ;
        return this.vie;
    }

    public boolean presenceVie() { //methode qui va voir si il reste des vies aux joueurs 
        if (this.vie == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean presenceBombe() { //methode permettant de savoir si il y a une bombe ou pas
        if (this.bombeCourant == false) {
            return false;
        } else {
            return true;
        }
    }

    public void placerBombe() {  // méthode qui permte de placer une bombe 
        this.bombeCourant = true;
    }
    


    public void placerKit() {           //place un kit de deminage dans la cellule
       this.avoirKit = true; 
    }

    public void supprimerKit() {     //supprime le kite de déminage de la cellule
        avoirKit = false;
    }

    
    public boolean presenceKit() {    // Vérifie la présence d'un kit de déminage dans la cellule
        if (this.avoirKit == false) {
            return false;
        } else {
            return true;
        }
    }

    public void activerKit() {   // Active le kit dans la cellule le faisant disparaître de la cellule
        supprimerKit();
    }

    @Override
    public String toString() {  //on créer l'override de la classe
        return "Cellule{" + "activationBombe=" + activationBombe + ", bombeCourant=" + bombeCourant + ", avoirKit=" + avoirKit + '}';
    }

}
