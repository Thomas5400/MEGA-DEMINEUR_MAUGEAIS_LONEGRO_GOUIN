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
    Cellule grille [][] = new Cellule [100][100];
    public Grille(int longueur, int largeur) { //constructeur de la classe
        
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
}
