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
    
    
    public Cellule() { //constructeur de la classe 
        this.vie = true;
        this.activationBombe = false;
        this.bombeCourant = false;
        this.avoirKit = false;
        this.activationKit =false;
    }

    public boolean ExplosionBombe() {
        this.activationBombe = true;
        return this.activationBombe;
    }
    
    public boolean Usagekit(){
        this.activationKit=true;
        return this.activationKit;
    }

    public boolean supprimervie() {
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

    public void placerBombe() {
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
