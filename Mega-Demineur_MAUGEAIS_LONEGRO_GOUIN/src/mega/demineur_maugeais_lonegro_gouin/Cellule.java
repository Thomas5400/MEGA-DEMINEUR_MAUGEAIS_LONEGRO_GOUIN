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
    
    
    public Cellule(){ //constructeur de la classe 
        this.vie =true;
        this.activationBombe = false;
        this.bombeCourant = false;
        this.avoirKit = false;
    }
    public boolean supprimervie(){
        this.vie = false;
        return this.vie;
    }
    public boolean presenceVie(){
        if (this.vie == false ) {
            return false;            
        }
        else {
            return true;
        }
    }
    
    public boolean presenceBombe () { //methode permettant de savoir si il y a une bombe ou pas
        if (this.bombeCourant == false ) {
            return false;            
        }
        else {
            return true;
        }
    }
    public void placerBombe(){
        this.bombeCourant=true;
    }
    boolean placerKit(){           //place un kit de deminage dans la cellule
        if(avoirKit){
            return false;
        }
    avoirKit =true;
        return true;
    }
    
    public void supprimerKit(){     //supprime le kite de déminage de la cellule
        avoirKit=false;
    }
    
    boolean presenceKit(){    // Vérifie la présence d'un kit de déminage dans la cellule
        return avoirKit;   
    }
    
    public void activerKit(){   // Active le kit dans la cellule le faisant disparaître de la cellule
        supprimerKit();
    }

    @Override
    public String toString() {  //on créer l'override de la classe
        return "Cellule{" + "activationBombe=" + activationBombe + ", bombeCourant=" + bombeCourant + ", avoirKit=" + avoirKit + '}';
    }
    
    
    
    
    
}
