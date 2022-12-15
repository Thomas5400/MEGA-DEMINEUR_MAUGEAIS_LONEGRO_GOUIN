package mega.demineur_maugeais_lonegro_gouin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gouin
 */
public class Partie {
    Grille plateau;
    Joueur joueurCourant;

    public Partie(Grille plateau, Joueur joueurCourant) { //on créer le contrsucteur de la classe
        this.plateau = plateau;
        this.joueurCourant = joueurCourant;
    }
    
    public void placerBombes(Grille plateau, int l , int c){// Méthode nous permettant de placer des bombes aléatoirement sur notre plateau
        int nbMax = 0;
        nbMax = (l*c)/(l/2);
        for(int i=0; i<nbMax; i++){
            int j=0;
            while(j==0){       
                int x = (int) (Math.random() * (l+3 - 3));// on choisit une valeur aléatoire
                int y = (int) (Math.random() * (c+3 - 3));//idem
                if(plateau.presenceBombe(x, y)==false){
                    j=1;
                    plateau.placerBombe(x, y);
                }
            }
            
        }
    }
    public void placerKits(Grille plateau, int l , int c){// Méthode nous permettant de placer des Kits de déminages aléatoirement sur notre plateau
        
        for(int i=0; i<4; i++){
            int j=0;
            while(j==0){       
                int x = (int) (Math.random() * (l+3 - 3));// on choisit une valeur aléatoire
                int y = (int) (Math.random() * (c+3 - 3));//idem
                if(plateau.presenceKit(x, y)==false && plateau.presenceBombe(x, y)==false){
                    j=1;
                    plateau.presenceKit(x, y);
                }
            }
            
        }
    }
    
    
    
}
