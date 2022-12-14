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
    
    public Cellule_Graphique(Cellule Unecellule){
        CelluleAssociee = Unecellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        if(CelluleAssociee.presenceVie()==true){
            setIcon(img_vie);
        }
        else if(CelluleAssociee.activationBombe==true){
           setIcon(img_bombe);
        }else{
            setIcon(img_vide);
        }
    }
    
    
    
}
