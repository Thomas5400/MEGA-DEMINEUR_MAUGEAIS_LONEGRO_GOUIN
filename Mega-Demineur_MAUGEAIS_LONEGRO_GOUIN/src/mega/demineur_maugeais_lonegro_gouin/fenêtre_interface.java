/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mega.demineur_maugeais_lonegro_gouin;


/**
 *
 * @author doria
 */
public class fenêtre_interface extends javax.swing.JFrame {

    /**
     * Creates new form fenêtre_interface
     */
    public fenêtre_interface() {
        initComponents();
        
        
        //PArtie du code qui servira à faire des actions avec les boutons de la grille 
        taille_Grille_Lignes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taille_Grille_LignesActionPerformed(evt);
                
                
            }
        });

       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inter_déminage = new javax.swing.JPanel();
        Infos_joueur = new javax.swing.JPanel();
        txt_Joueur = new javax.swing.JLabel();
        taille_Grille_Colonnes = new javax.swing.JTextField();
        txt_Vies = new javax.swing.JLabel();
        txt_Nbkits = new javax.swing.JLabel();
        nb_Kits = new javax.swing.JLabel();
        btn_Demarrer = new javax.swing.JButton();
        infos_Jeu = new javax.swing.JPanel();
        infosJeu_Title = new javax.swing.JLabel();
        txt_NbMines = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nb_Mines = new javax.swing.JLabel();
        infosJoueur_Title = new javax.swing.JLabel();
        txt_Taille = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        taille_Grille_Lignes = new javax.swing.JTextField();
        txt_X = new javax.swing.JLabel();
        affichage_vie = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inter_déminage.setBackground(new java.awt.Color(102, 102, 0));
        inter_déminage.setLayout(new java.awt.GridLayout(6, 17));
        getContentPane().add(inter_déminage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1088, 384));

        Infos_joueur.setBackground(new java.awt.Color(255, 255, 255));

        txt_Joueur.setText("Joueur :");

        taille_Grille_Colonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taille_Grille_ColonnesActionPerformed(evt);
            }
        });

        txt_Vies.setText("Nombre de vies :");

        txt_Nbkits.setText("Nombre de kits de déminage :");

        nb_Kits.setText("0");

        btn_Demarrer.setBackground(new java.awt.Color(102, 204, 255));
        btn_Demarrer.setText("DEMARRER");
        btn_Demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DemarrerActionPerformed(evt);
            }
        });

        infos_Jeu.setBackground(new java.awt.Color(255, 204, 204));

        infosJeu_Title.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        infosJeu_Title.setText("INFOS JEU");

        txt_NbMines.setText("Nombre de mines présentes : ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        nb_Mines.setText("0");

        javax.swing.GroupLayout infos_JeuLayout = new javax.swing.GroupLayout(infos_Jeu);
        infos_Jeu.setLayout(infos_JeuLayout);
        infos_JeuLayout.setHorizontalGroup(
            infos_JeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infos_JeuLayout.createSequentialGroup()
                .addGroup(infos_JeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infosJeu_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infos_JeuLayout.createSequentialGroup()
                        .addComponent(txt_NbMines)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nb_Mines, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        infos_JeuLayout.setVerticalGroup(
            infos_JeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infos_JeuLayout.createSequentialGroup()
                .addComponent(infosJeu_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(infos_JeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nb_Mines, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NbMines))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infos_JeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        infosJoueur_Title.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        infosJoueur_Title.setText("INFOS JOUEURS");

        txt_Taille.setText("Taille de grille voulue :");

        nom_joueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur1ActionPerformed(evt);
            }
        });

        taille_Grille_Lignes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taille_Grille_LignesActionPerformed(evt);
            }
        });

        txt_X.setText("X");

        affichage_vie.setLayout(new java.awt.GridLayout(1, 3));

        javax.swing.GroupLayout Infos_joueurLayout = new javax.swing.GroupLayout(Infos_joueur);
        Infos_joueur.setLayout(Infos_joueurLayout);
        Infos_joueurLayout.setHorizontalGroup(
            Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Infos_joueurLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Infos_joueurLayout.createSequentialGroup()
                        .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infosJoueur_Title)
                            .addComponent(txt_Joueur, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addComponent(nom_joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txt_Taille))
                    .addGroup(Infos_joueurLayout.createSequentialGroup()
                        .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Infos_joueurLayout.createSequentialGroup()
                                .addComponent(txt_Vies, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(affichage_vie, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Infos_joueurLayout.createSequentialGroup()
                                .addComponent(txt_Nbkits, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nb_Kits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(taille_Grille_Lignes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_X)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taille_Grille_Colonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infos_Jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(Infos_joueurLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btn_Demarrer, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Infos_joueurLayout.setVerticalGroup(
            Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Infos_joueurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Infos_joueurLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Joueur)
                            .addComponent(taille_Grille_Colonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Taille)
                            .addComponent(nom_joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taille_Grille_Lignes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_X))
                        .addGap(18, 18, 18)
                        .addComponent(txt_Vies)
                        .addGap(30, 30, 30)
                        .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nbkits)
                            .addComponent(nb_Kits)))
                    .addGroup(Infos_joueurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Infos_joueurLayout.createSequentialGroup()
                            .addComponent(infosJoueur_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(affichage_vie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42))
                        .addComponent(infos_Jeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_Demarrer, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        getContentPane().add(Infos_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 1350, 220));

        setBounds(0, 0, 1568, 728);
    }// </editor-fold>//GEN-END:initComponents

    private void taille_Grille_ColonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taille_Grille_ColonnesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taille_Grille_ColonnesActionPerformed

    private void nom_joueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur1ActionPerformed

    private void taille_Grille_LignesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taille_Grille_LignesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taille_Grille_LignesActionPerformed

    private void btn_DemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DemarrerActionPerformed
        // TODO add your handling code here:
        
        //l'utilisateur rentre des valeurs l ligne et c colonne 
        int l = Integer.parseInt(taille_Grille_Lignes.getText());//commande qui permet de transformer le String en int 
        int c = Integer.parseInt(taille_Grille_Colonnes.getText());
        
        //code qui ne sert qu'à tester si ca a bien marché 
        System.out.println(c);
        System.out.println(l);
        
        Grille plateau = new Grille(l ,c );   //grille créer pour le plateau du jeu avec les l lignes et c colonne entrée par l'utilisateur
        
        //on place les bombes dans le tableau 
        placerBombes(plateau, l , c);     
        
        
        //partie affiche le nombre de vie
        Grille plateau_vie = new Grille(1,3 );//on creer un plateau_vie qui sert à placer les images de vie comme on a trois vie on creer une grille de 1 ligne et 3 colonne
        for(int i=0; i<3; i++){//boucle pour placer les images dans le bon panel 
           Cellule_Graphique CellVie = new Cellule_Graphique(plateau_vie.grille[0][i]);
           affichage_vie.add(CellVie);
        }
        affichage_vie.repaint();
        
        //Partie qui créer toutes les cases du jeu avec les images 
        for(int i = l-1 ; i >=0 ; i--){//même principe que le plateau de vie mais avec deux boucle car le nombre de vie est variable 
           for(int j = 0 ; j<c ; j++){
               
               
               plateau.grille[i][j].supprimervie();
               Cellule_Graphique CellGraph = new Cellule_Graphique(plateau.grille[i][j]);
               inter_déminage.add(CellGraph);
           }
       }
        
        inter_déminage.repaint();
        btn_Demarrer.setEnabled(false);
    }//GEN-LAST:event_btn_DemarrerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenêtre_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenêtre_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenêtre_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenêtre_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenêtre_interface().setVisible(true);
            }
        });
    }

    
    public void placerBombes(Grille plateau, int l , int c){
        
        for(int i=0; i<6; i++){
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Infos_joueur;
    private javax.swing.JPanel affichage_vie;
    private javax.swing.JButton btn_Demarrer;
    private javax.swing.JLabel infosJeu_Title;
    private javax.swing.JLabel infosJoueur_Title;
    private javax.swing.JPanel infos_Jeu;
    private javax.swing.JPanel inter_déminage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nb_Kits;
    private javax.swing.JLabel nb_Mines;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField taille_Grille_Colonnes;
    private javax.swing.JTextField taille_Grille_Lignes;
    private javax.swing.JLabel txt_Joueur;
    private javax.swing.JLabel txt_NbMines;
    private javax.swing.JLabel txt_Nbkits;
    private javax.swing.JLabel txt_Taille;
    private javax.swing.JLabel txt_Vies;
    private javax.swing.JLabel txt_X;
    // End of variables declaration//GEN-END:variables
 
   
}
