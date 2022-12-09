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

    int longeur;
    int largeur;

    public Grille(int longeur, int largeur) { //constructeur de la classe
        this.longeur = longeur;
        this.largeur = largeur;
        Cellule grille [][] = new Cellule [longeur][largeur];
    }

}
