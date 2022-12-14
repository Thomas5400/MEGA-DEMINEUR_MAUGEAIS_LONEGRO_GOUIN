/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.demineur_maugeais_lonegro_gouin;

import java.util.ArrayList;

/**
 *
 * @author gouin
 */
public class Grille {

    int longueur;
    int largeur;
    Cellule grille [][];
    public Grille(int longueur, int largeur) { //constructeur de la classe
        grille = new Cellule[longueur][largeur];
        this.longueur = longueur;
        this.largeur = largeur;
        for (int i=0; i<longueur ; i++){
               for(int j=0 ; j<largeur ; j++){
                   grille [i][j]=  new  Cellule();
               }
           }
        
    }
    
    public boolean presenceBombe(int x, int y){
        return grille[x][y].presenceBombe();
    }
    public void placerBombe(int x , int y){
        grille[x][y].placerBombe();
    }
    public boolean presencevie(int x, int y){
         return grille[x][y].presenceVie();
    }
    public boolean presenceKit (int x, int y) {
        return grille[x][y].presenceKit();
    }
    
    public int decouverteGrille (int i, int j) { // méthode qui va permettre de savoir si il y a des bombes dans les cases adjacentes
        int a = 0;
        if (grille[i+1][j].presenceBombe() == true ){ //Cas pour la cellule positionée en i+1
            if (grille[i+1][j+1].presenceBombe() == true && grille[i+1][j-1].presenceBombe() == true ){ //Si il y a une bombe dans les cellules à côté de celle avec une bombe on renvoie le nombre de bombes (ici 3)
                a = 3;
            }
            if (grille[i+1][j+1].presenceBombe() == true && grille[i+1][j-1].presenceBombe() == true ){ //Si il y a une bombe dans la cellules à côté de celle avec une bombe on renvoie le nombre de bombes (ici 2)
                a = 2;
            }
            else { // si il n'y a pas de bombes dans les cellules où se trouve la première bombe on renvoie son nombre (ici 1)
                a = 1;
            }
        }
        else {
            a = 0; //si il n'y a pas de bombe on renvoie 0
        }
        
        
        int b = 0;
        if (grille[i-1][j].presenceBombe() == true ){ //Cas pour la cellule positionée en i-1
            if (grille[i-1][j+1].presenceBombe() == true && grille[i-1][j-1].presenceBombe() == true ){ //Si il y a une bombe dans les cellules à côté de celle avec une bombe on renvoie le nombre de bombes (ici 3)
                b = 3;
            }
            if (grille[i-1][j+1].presenceBombe() == true && grille[i-1][j-1].presenceBombe() == true ){ //Si il y a une bombe dans la cellules à côté de celle avec une bombe on renvoie le nombre de bombes (ici 2)
                b = 2;
            }
            else { // si il n'y a pas de bombes dans les cellules où se trouve la première bombe on renvoie son nombre (ici 1)
                b = 1;
            }
        }
        else {
            return b; //si il n'y a pas de bombe on renvoie 0
        }
        
        
        int c = 0;
        if (grille[i][j+1].presenceBombe() == true ){ //Cas pour la cellule positionée en j+1
            c = 1;
        }
        else {
            c= 0; //si il n'y a pas de bombe on renvoie 0
        }
        
        
        int d = 0;
        if (grille[i][j-1].presenceBombe() == true ){ //Cas pour la cellule positionée en j-1
            d = 1;
        }
        else {
            d = 0; //si il n'y a pas de bombe on renvoie 0
        }
        return a + b + c + d; //on renvoie le nombre total de bombe autour de notre cellule 
        
    }
    
}
