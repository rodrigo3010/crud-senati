/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud.senati;
import java.sql.*;
import javax.swing.JFrame;
//import javax.swing.table.TableModel;
/**
 *
 * @author TOROJ
 */
public class Editar_Juegos extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Juegos
     */
    public Editar_Juegos() {
        initComponents();
    }
    public Editar_Juegos(String id, String name, String plataforma){
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        id_e_2 = new javax.swing.JTextField();
        nombre_e_2 = new javax.swing.JTextField();
        plataforma_e_2 = new javax.swing.JTextField();
        Editar_e_2 = new javax.swing.JButton();
        Cancelar_e_2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Plataforma:");

        id_e_2.setForeground(new java.awt.Color(204, 255, 204));

        Editar_e_2.setForeground(new java.awt.Color(255, 51, 51));
        Editar_e_2.setText("Editar");
        Editar_e_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_e_2ActionPerformed(evt);
            }
        });

        Cancelar_e_2.setForeground(new java.awt.Color(255, 0, 0));
        Cancelar_e_2.setText("Cancelar");
        Cancelar_e_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_e_2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Editar usuario");

        jLabel2.setText("Id :");

        jLabel3.setText("Nombre :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(id_e_2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plataforma_e_2)
                                    .addComponent(nombre_e_2))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Editar_e_2)
                            .addComponent(Cancelar_e_2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_e_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre_e_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(plataforma_e_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(Editar_e_2)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar_e_2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Editar_e_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_e_2ActionPerformed
        // TODO add your handling code here:
        Formulario_Juegos f_j=new Formulario_Juegos();
        Conexion cn=new Conexion();
        String query ="UPDATE Juegos SET Nombre=? , Plataforma=? WHERE id=?";
        int id=Integer.parseInt(id_e_2.getText());
        String nombre=nombre_e_2.getText();
        String plataforma=plataforma_e_2.getText();
        try{
            PreparedStatement ps=cn.conectar().prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, plataforma);
            ps.setInt(3,id);
            int editrow=ps.executeUpdate();
            if(editrow > 0){
                System.out.print("Se editaron los datos");
                for( int i =0;i < f_j.tabla2.getRowCount();i++){
                    if(Integer.parseInt(f_j.tabla2.getValueAt(i, 0).toString())==id){
                        f_j.tabla2.setValueAt(nombre, i, 1);
                        f_j.tabla2.setValueAt(plataforma, i, 2);
                        break;
                    }
                }

            }else{
                System.out.println("No se cargaron los datos");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_Editar_e_2ActionPerformed

    private void Cancelar_e_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_e_2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Cancelar_e_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Juegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Juegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar_e_2;
    private javax.swing.JButton Editar_e_2;
    private javax.swing.JTextField id_e_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre_e_2;
    private javax.swing.JTextField plataforma_e_2;
    // End of variables declaration//GEN-END:variables
}
