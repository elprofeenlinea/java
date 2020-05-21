package transportesdecolombia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Reportes extends javax.swing.JFrame {

    
    String remitente, destinatario, ciudadorigen, ciudaddestino;
     Calendar fecha = new GregorianCalendar();
    
    public Reportes() {
        initComponents();
        cargarDatos();
        lbl_fecha.setText("Fecha: " +fecha.getTime().toString());
        llenarGrilla();
    }

    
    
     public final void cargarDatos() {
        Conexion con = new Conexion();
        Connection cone = con.conexion();
       
        
        String sql;
    
      
        sql = "SELECT * FROM usuarios "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
        
               String remitente, destinatario, ciudadorigen, ciudaddestino ;
               while (rs.next()) {
           
                    remitente=rs.getString(2);
                    destinatario= rs.getString(2);
                    ciudadorigen= rs.getString(8);
                    ciudaddestino= rs.getString(8);
                  
                   cmb_remitente.addItem(remitente);
                   cmb_destinatario.addItem(destinatario);
                   cmb_ciudadorigen.addItem(ciudadorigen);
                   cmb_ciudaddestino.addItem(ciudaddestino);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaCiudad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmb_remitente = new javax.swing.JComboBox<>();
        cmb_destinatario = new javax.swing.JComboBox<>();
        cmb_ciudadorigen = new javax.swing.JComboBox<>();
        cmb_ciudaddestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_remitente = new javax.swing.JButton();
        lbl_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_destinatario = new javax.swing.JButton();
        btn_ciudadorigen = new javax.swing.JButton();
        btn_ciudaddestino = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REPORTE DE ENVIOS");

        cmb_ciudaddestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ciudaddestinoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Remitente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Destinatario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ciduad Origen");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ciudad Destino");

        btn_remitente.setText("Consultar");
        btn_remitente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_remitenteActionPerformed(evt);
            }
        });

        lbl_fecha.setText("Fecha");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_destinatario.setText("Consultar");
        btn_destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_destinatarioActionPerformed(evt);
            }
        });

        btn_ciudadorigen.setText("Consultar");
        btn_ciudadorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudadorigenActionPerformed(evt);
            }
        });

        btn_ciudaddestino.setText("Consultar");
        btn_ciudaddestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudaddestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(btn_remitente)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmb_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(btn_destinatario)))))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(280, 280, 280)
                                        .addComponent(lbl_fecha))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmb_ciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_ciudadorigen)
                                .addGap(66, 66, 66)
                                .addComponent(cmb_ciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_ciudaddestino)))
                        .addGap(254, 332, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_fecha)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_remitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remitente)
                    .addComponent(cmb_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_destinatario)
                    .addComponent(cmb_ciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ciudadorigen)
                    .addComponent(cmb_ciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ciudaddestino))
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_remitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_remitenteActionPerformed
            
        Conexion con = new Conexion();
        Connection cone = con.conexion();
        String buscado = cmb_remitente.getSelectedItem().toString();
        
        String sql3;
        
      
        sql3 = "SELECT * FROM envios WHERE remitente = '"+buscado+"' "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql3);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
               DefaultTableModel modelo = new DefaultTableModel();
               this.tabla.setModel(modelo);
               
               for (int x=1; x<=numeroColumnas; x++) {
                   modelo.addColumn(rsMD.getColumnLabel(x));
               }
               //reg.executeUpdate(sql);
               
               while (rs.next()) {
                   Object [] fila = new Object[numeroColumnas];
                   
                   for (int y=0; y<numeroColumnas; y++) {
                       fila [y]=rs.getObject(y+1);
                       
                   }
                   modelo.addRow(fila);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_remitenteActionPerformed

    
    
     public void llenarGrilla() {
          Conexion con = new Conexion();
        Connection cone = con.conexion();
        String buscado = cmb_remitente.getSelectedItem().toString();
        
        String sql;
        
      
         sql = "SELECT *  FROM envios  "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
               DefaultTableModel modelo = new DefaultTableModel();
               this.tabla.setModel(modelo);
               
               for (int x=1; x<=numeroColumnas; x++) {
                   modelo.addColumn(rsMD.getColumnLabel(x));
               }
               //reg.executeUpdate(sql);
               
               while (rs.next()) {
                   Object [] fila = new Object[numeroColumnas];
                   
                   for (int y=0; y<numeroColumnas; y++) {
                       fila [y]=rs.getObject(y+1);
                       
                   }
                   modelo.addRow(fila);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarGrilla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb_ciudaddestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ciudaddestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_ciudaddestinoActionPerformed

    private void btn_destinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_destinatarioActionPerformed
        Conexion con = new Conexion();
        Connection cone = con.conexion();
        String buscado = cmb_destinatario.getSelectedItem().toString();
        
        String sql3;
        
      
        sql3 = "SELECT * FROM envios WHERE destinatario = '"+buscado+"' "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql3);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
               DefaultTableModel modelo = new DefaultTableModel();
               this.tabla.setModel(modelo);
               
               for (int x=1; x<=numeroColumnas; x++) {
                   modelo.addColumn(rsMD.getColumnLabel(x));
               }
               //reg.executeUpdate(sql);
               
               while (rs.next()) {
                   Object [] fila = new Object[numeroColumnas];
                   
                   for (int y=0; y<numeroColumnas; y++) {
                       fila [y]=rs.getObject(y+1);
                       
                   }
                   modelo.addRow(fila);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_destinatarioActionPerformed

    private void btn_ciudadorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudadorigenActionPerformed
        Conexion con = new Conexion();
        Connection cone = con.conexion();
        String buscado = cmb_ciudadorigen.getSelectedItem().toString();
        
        String sql3;
        
      
        sql3 = "SELECT * FROM envios WHERE ciudadorigen = '"+buscado+"' "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql3);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
               DefaultTableModel modelo = new DefaultTableModel();
               this.tabla.setModel(modelo);
               
               for (int x=1; x<=numeroColumnas; x++) {
                   modelo.addColumn(rsMD.getColumnLabel(x));
               }
               //reg.executeUpdate(sql);
               
               while (rs.next()) {
                   Object [] fila = new Object[numeroColumnas];
                   
                   for (int y=0; y<numeroColumnas; y++) {
                       fila [y]=rs.getObject(y+1);
                       
                   }
                   modelo.addRow(fila);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ciudadorigenActionPerformed

    private void btn_ciudaddestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudaddestinoActionPerformed
        Conexion con = new Conexion();
        Connection cone = con.conexion();
        String buscado = cmb_ciudaddestino.getSelectedItem().toString();
        
        String sql3;
        
      
        sql3 = "SELECT * FROM envios WHERE ciudaddestino like '"+buscado+"' "; 
     
        
        try {
               Statement reg = cone.createStatement();
               ResultSet rs = reg.executeQuery(sql3);
               ResultSetMetaData rsMD= rs.getMetaData();
               int numeroColumnas = rsMD.getColumnCount();
               
               DefaultTableModel modelo = new DefaultTableModel();
               this.tabla.setModel(modelo);
               
               for (int x=1; x<=numeroColumnas; x++) {
                   modelo.addColumn(rsMD.getColumnLabel(x));
               }
               //reg.executeUpdate(sql);
               
               while (rs.next()) {
                   Object [] fila = new Object[numeroColumnas];
                   
                   for (int y=0; y<numeroColumnas; y++) {
                       fila [y]=rs.getObject(y+1);
                       
                   }
                   modelo.addRow(fila);
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ciudaddestinoActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ciudaddestino;
    private javax.swing.JButton btn_ciudadorigen;
    private javax.swing.JButton btn_destinatario;
    private javax.swing.JButton btn_remitente;
    private javax.swing.JComboBox<String> cmb_ciudaddestino;
    private javax.swing.JComboBox<String> cmb_ciudadorigen;
    private javax.swing.JComboBox<String> cmb_destinatario;
    private javax.swing.JComboBox<String> cmb_remitente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

