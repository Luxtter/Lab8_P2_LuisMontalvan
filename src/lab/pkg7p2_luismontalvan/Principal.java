/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab.pkg7p2_luismontalvan;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        usuarios.add(new Admin("enuila","wynaut1325"));
        jpAdmin.setVisible(false);
        jpCrearUsuario.setVisible(false);
        jpOpcAdicioionales.setVisible(false);
        jpArtista.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpInicioSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpfContrasena = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jbtnIniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpAdmin = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlUsuarios = new javax.swing.JList<>();
        jbtnEliminarU = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpCrearUsuario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCrearU = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jpfCrearC = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbtnCrearU = new javax.swing.JButton();
        jpOpcAdicioionales = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlEdad = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jtfGeneroM = new javax.swing.JTextField();
        jlIntegrantes = new javax.swing.JLabel();
        jpArtista = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jpUsuario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setText("Inicio de Sesion");
        jpInicioSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 48, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");
        jpInicioSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 132, -1, -1));

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpInicioSesion.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 129, 137, -1));

        jpfContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfContrasenaActionPerformed(evt);
            }
        });
        jpInicioSesion.add(jpfContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 192, 137, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");
        jpInicioSesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 195, -1, -1));

        jbtnIniciarSesion.setText("Iniciar Sesion");
        jbtnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnIniciarSesionMouseClicked(evt);
            }
        });
        jpInicioSesion.add(jbtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel4.setText("¿No tiene usuario? Cree uno");
        jpInicioSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, -1));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("aqui");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jpInicioSesion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        jpInicioSesion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 210, 500));

        jScrollPane1.setViewportView(jlUsuarios);

        jbtnEliminarU.setText("Eliminar");
        jbtnEliminarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEliminarUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminarU))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnEliminarU)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bitacora", jPanel2);

        javax.swing.GroupLayout jpAdminLayout = new javax.swing.GroupLayout(jpAdmin);
        jpAdmin.setLayout(jpAdminLayout);
        jpAdminLayout.setHorizontalGroup(
            jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jpAdminLayout.setVerticalGroup(
            jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jpCrearUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Crear Usuario");
        jpCrearUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 32, -1, -1));

        jLabel8.setText("Usuario");
        jpCrearUsuario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 95, -1, 23));
        jpCrearUsuario.add(jtfCrearU, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 97, 141, -1));

        jLabel9.setText("Contraseña");
        jpCrearUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 138, -1, -1));
        jpCrearUsuario.add(jpfCrearC, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 136, 141, -1));

        jCheckBox1.setText("Artista");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jpCrearUsuario.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 173, 82, -1));

        jbtnCrearU.setText("Crear Usuario");
        jbtnCrearU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCrearUMouseClicked(evt);
            }
        });
        jpCrearUsuario.add(jbtnCrearU, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 413, -1, -1));

        jpOpcAdicioionales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Genero Musical");
        jpOpcAdicioionales.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, -1, 23));
        jpOpcAdicioionales.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 2, 141, -1));

        jlEdad.setText("Edad");
        jpOpcAdicioionales.add(jlEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 40, 23));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 0, 100, 1));
        jpOpcAdicioionales.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 31, -1, -1));

        jLabel12.setText("Nombre");
        jpOpcAdicioionales.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 23));
        jpOpcAdicioionales.add(jtfGeneroM, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 60, 141, -1));

        jlIntegrantes.setText("Integrantes");
        jpOpcAdicioionales.add(jlIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 60, -1));

        jpCrearUsuario.add(jpOpcAdicioionales, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 248, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Solista");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Banda");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpArtistaLayout = new javax.swing.GroupLayout(jpArtista);
        jpArtista.setLayout(jpArtistaLayout);
        jpArtistaLayout.setHorizontalGroup(
            jpArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArtistaLayout.createSequentialGroup()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jpArtistaLayout.setVerticalGroup(
            jpArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpCrearUsuario.add(jpArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 197, 225, -1));
        jpCrearUsuario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 230, 490));

        javax.swing.GroupLayout jpUsuarioLayout = new javax.swing.GroupLayout(jpUsuario);
        jpUsuario.setLayout(jpUsuarioLayout);
        jpUsuarioLayout.setHorizontalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jpUsuarioLayout.setVerticalGroup(
            jpUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpfContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfContrasenaActionPerformed

    private void jbtnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnIniciarSesionMouseClicked
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) instanceof Admin){
                if (((Admin)usuarios.get(i)).getUsuario().equals(jtfUsuario.getText())) {
                    if (((Admin)usuarios.get(i)).getContrasena().equals(jpfContrasena.getText())) {
                        jpInicioSesion.setVisible(false);
                        uActivo = usuarios.get(i);
                        jpAdmin.setVisible(true);
                        
                    }else{
                        JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                    }
                }else{
                    JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                }
            }else if(usuarios.get(i) instanceof Solista){
                if (((Solista)usuarios.get(i)).getUsuario().equals(jtfUsuario.getText())) {
                    if (((Solista)usuarios.get(i)).getContrasena().equals(jpfContrasena.getText())) {
                        jpInicioSesion.setVisible(false);
                        uActivo = usuarios.get(i);
                    }else{
                        JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                    }
                }else{
                    JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                }
            }else{
                if (((Banda)usuarios.get(i)).getUsuario().equals(jtfUsuario.getText())) {
                    if (((Banda)usuarios.get(i)).getContrasena().equals(jpfContrasena.getText())) {
                        jpInicioSesion.setVisible(false);
                        uActivo = usuarios.get(i);
                    }else{
                        JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                    }
                }else{
                    JOptionPane.showMessageDialog(jpInicioSesion, "Usuario o contraseña incorrecta");
                }
            }
        }
    }//GEN-LAST:event_jbtnIniciarSesionMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jpInicioSesion.setVisible(false);
        jpCrearUsuario.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jbtnEliminarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarUMouseClicked
        DefaultListModel modelo = (DefaultListModel)jlUsuarios.getModel();
        int aelim = jlUsuarios.getSelectedIndex();
        modelo.remove(aelim);
        jlUsuarios.setModel(modelo);
    }//GEN-LAST:event_jbtnEliminarUMouseClicked

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        if (jCheckBox1.isSelected()) {
            jpArtista.setVisible(true);
        }else{
            jpArtista.setVisible(false);
            jpOpcAdicioionales.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jbtnCrearUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCrearUMouseClicked
        DefaultListModel modelo = (DefaultListModel)jlUsuarios.getModel();
        if (jCheckBox1.isSelected()) {
            if (jRadioButton1.isSelected()) {
                usuarios.add(new Solista((Integer)(jSpinner1.getValue()), jtfCrearU.getText(), jpfCrearC.getText(), jtfNombre.getText(), jtfGeneroM.getText()));
                modelo.addElement(usuarios.get(usuarios.size()-1));
                jlUsuarios.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente");
                jpCrearUsuario.setVisible(false);
                jCheckBox1.setSelected(false);
                jpInicioSesion.setVisible(true);
            } else {
                usuarios.add(new Banda((Integer)(jSpinner1.getValue()), jtfCrearU.getText(), jpfCrearC.getText(), jtfNombre.getText(), jtfGeneroM.getText()));
                modelo.addElement(usuarios.get(usuarios.size()-1));
                jlUsuarios.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente");
                jpCrearUsuario.setVisible(false);
                jCheckBox1.setSelected(false);
                jpInicioSesion.setVisible(true);
            }
        }else{
            usuarios.add(new Usuario(jtfCrearU.getText(), jpfCrearC.getText()));
        }
    }//GEN-LAST:event_jbtnCrearUMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        if (jRadioButton1.isSelected()) {
            jlEdad.setVisible(true);
            jlIntegrantes.setVisible(false);
            jpOpcAdicioionales.setVisible(true);
            jSpinner1.setValue(18);
        }

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        if (jRadioButton2.isSelected()) {
            jlEdad.setVisible(false);
            jlIntegrantes.setVisible(true);
            jpOpcAdicioionales.setVisible(true);
            jSpinner1.setValue(5);
        }
    }//GEN-LAST:event_jRadioButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCrearU;
    private javax.swing.JButton jbtnEliminarU;
    private javax.swing.JButton jbtnIniciarSesion;
    private javax.swing.JLabel jlEdad;
    private javax.swing.JLabel jlIntegrantes;
    private javax.swing.JList<String> jlUsuarios;
    private javax.swing.JPanel jpAdmin;
    private javax.swing.JPanel jpArtista;
    private javax.swing.JPanel jpCrearUsuario;
    private javax.swing.JPanel jpInicioSesion;
    private javax.swing.JPanel jpOpcAdicioionales;
    private javax.swing.JPanel jpUsuario;
    private javax.swing.JPasswordField jpfContrasena;
    private javax.swing.JPasswordField jpfCrearC;
    private javax.swing.JTextField jtfCrearU;
    private javax.swing.JTextField jtfGeneroM;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
    ArrayList usuarios = new ArrayList();
    Object uActivo;
}
