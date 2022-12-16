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
    
    public boolean presenceBombe(int x, int y){ // on créer une méthode presenceBombe qui permet de savoir si il y a une bombe dans la case 
        return grille[x][y].presenceBombe();
    }
    public void placerBombe(int x , int y){ // méthode qui sert à placer une bombe dans une case
        grille[x][y].placerBombe();
    }
    public boolean presencevie(int x, int y){ // méthode qui sert à savoir si il y a une vie dans une case 
         return grille[x][y].presenceVie();
    }
    public boolean presenceKit (int x, int y) {  // méthdoe qui permet de savoir si il y a  un kit dans une case 
        return grille[x][y].presenceKit();
    }
    
    public void placagedeKit(int x , int y){  // méthode qui permet de placer un kit dans une case 
        grille[x][y].placerKit();
    }
    
    public int decouverteGrille (int i, int j, int lignemax, int colonnemax) { // méthode qui va permettre de savoir si il y a des bombes dans les cases adjacentes
        //le a sert à savoir si il y a des bombes au dessus de la case et dans les diagonales en haut à droite et en haut à gauche 
        int a = 0;
        if (i+1 < lignemax  && grille[i+1][j].presenceBombe() == true ){ //si il y une bombe dans la case à la ieme +1 ligen et j ieme colonne
            a += 1; // on ajoute 1 à a
        }
        if ( j+1< colonnemax && i+1 < lignemax  &&  grille[i+1][j+1].presenceBombe() == true ){// si il y a une bombe à la  ieme +1 ligne et jème +1 colonne
                a += 1; // on ajoute 1 à a 
            }
        if (j-1 >=0  && i+1 < lignemax  &&grille[i+1][j-1].presenceBombe() == true ){ // si il y a une bombe a la i eme +1 ligne et jeme -1 colonne on ajoute 1 à a 
                a += 1;
            }
           
        
        
        
        // le b sert à savoir si il y a une bombe en bas de la case et dans la diagonale en bas à gauche et en bas à droite 
        int b = 0;
        if (i-1>=0 && grille[i-1][j].presenceBombe() == true ){ //Cas pour la cellule positionée en i-1
            b +=1;
        }
        if(i-1>=0 && j+1 < colonnemax && j-1 >=0 && grille[i-1][j+1].presenceBombe() == true){
            b +=1;
        }
        if (i-1>=0 && j-1 >=0 &&  grille[i-1][j-1].presenceBombe() == true ){ //Si il y a une bombe dans les cellules à côté de celle avec une bombe on renvoie le nombre de bombes (ici 3)
                b += 1;
         }
            
        
        
        
        //le c sert à savoir si il y a une bombe à droite de la case 
        int c = 0;
        if (j+1<colonnemax && grille[i][j+1].presenceBombe() == true ){ //Cas pour la cellule positionée en j+1
            c = 1;
        }
       
        
        //le d sert )à savoir si il y a une bombe à gauche de la case
        int d = 0;
        if (   j-1>=0 && grille[i][j-1].presenceBombe() == true ){ //Cas pour la cellule positionée en j-1
            d = 1;
        }
       
        return a + b + c + d; //on renvoie le nombre total de bombe autour de notre cellule 
        
    }
    
}
