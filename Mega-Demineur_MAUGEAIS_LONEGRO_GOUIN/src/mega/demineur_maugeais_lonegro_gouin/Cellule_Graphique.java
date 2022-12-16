/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mega.demineur_maugeais_lonegro_gouin;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author thoma
 */
public class Cellule_Graphique extends JButton{
    
    Cellule CelluleAssociee ;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/image/celluleVide.png"));
    ImageIcon img_bombe = new javax.swing.ImageIcon(getClass().getResource("/image/B.jpg"));
    ImageIcon img_vie = new javax.swing.ImageIcon(getClass().getResource("/image/VIE.jpg")); 
    ImageIcon img_kit = new javax.swing.ImageIcon(getClass().getResource("/image/dragonradar.jpg"));
    ImageIcon img_B0 = new javax.swing.ImageIcon(getClass().getResource("/image/case.jpg"));
    ImageIcon img_B1 = new javax.swing.ImageIcon(getClass().getResource("/image/Dragon_ball_1.jpg"));
    ImageIcon img_B2 = new javax.swing.ImageIcon(getClass().getResource("/image/Dragon_ball_2.jpg"));
    ImageIcon img_B3 = new javax.swing.ImageIcon(getClass().getResource("/image/Dragon_ball_3.jpg"));
    
    public Cellule_Graphique(Cellule Unecellule){
        CelluleAssociee = Unecellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        
        if(CelluleAssociee.presenceVie()==true){ //si il y a une vie on affiche l'image de la vie
            setIcon(img_vie);
        }
        else if(CelluleAssociee.presenceBombe()==true){ //si il y a une bombe on affcihe l'image d'une bombe 
           setIcon(img_bombe);
        }
        else if(CelluleAssociee.presenceKit()==true){ // si il y a un kit on affiche l'image du kit
            setIcon(img_kit);
        }
        else if(CelluleAssociee.B0==true ){ //si il n'y a pas de bombe on affiche une case d'herbe
            setIcon(img_B0);
            }
        else if(CelluleAssociee.B1==true ){ // si il y a une bombe autour de la case on affiche un indicateur qui dit le qu'il y a une bombe
            setIcon(img_B1);
                
            }
        else if(CelluleAssociee.B2==true ){ // si il y a deux  bombe autour de la case on affiche un indicateur qui dit le qu'il y a deux bombe
            setIcon(img_B2);
            }
        else if(CelluleAssociee.B3==true ){ // si il y a trois bombe autour de la case on affiche un indicateur qui dit le qu'il y a trois bombe
            setIcon(img_B3);
            }
        else{    
            //int T = CelluleAssociee.
            setIcon(img_vide);
        }
    }
    
    
    
}
