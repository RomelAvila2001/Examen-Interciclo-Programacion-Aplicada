/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDocente;
import ec.edu.ups.controlador.ControladorRector;
import ec.edu.ups.modelo.Docente;
import ec.edu.ups.modelo.Rector;
import javax.swing.JOptionPane;

/**
 *
 * @author NANCY
 */
public class VentanIniciarSesion extends javax.swing.JInternalFrame {

    private ControladorRector controladorRector;
    private ControladorDocente controladorDocente;
    private VentanaPrincipal ventanaPrincipal;
    private VentanaRegistraEstudiante ventanaRegistraEstudiante;
    /**
     * Creates new form VentanIniciarSesion
     * @param controladorRector
     * @param ventanaPrincipal
     * @param controladorDocente
     * @param ventanaRegistraEstudiante
     */
    public VentanIniciarSesion(ControladorRector controladorRector, VentanaPrincipal ventanaPrincipal,
            ControladorDocente controladorDocente, VentanaRegistraEstudiante ventanaRegistraEstudiante) {
        initComponents();
        
        this.controladorRector= controladorRector;
        this.controladorDocente=controladorDocente;
        this.ventanaPrincipal=ventanaPrincipal;
        
    }

    public void limpiar() {
        txtCorreo.setText("");
        txtContra.setText("");
        cbxOpcion.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxOpcion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Iniciar Sesion");

        jLabel2.setText("Rector o Docente");

        cbxOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Rector", "Docente" }));

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxOpcion, 0, 182, Short.MAX_VALUE)
                    .addComponent(txtCorreo)
                    .addComponent(txtContra))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnIniciar)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        String correo = txtCorreo.getText();
        char[] contra = txtContra.getPassword();
        String password = String.valueOf(contra);
        String opcion = cbxOpcion.getSelectedItem().toString();
        
        if(correo.isEmpty()||password.isEmpty()||opcion.equalsIgnoreCase("Seleccione")){
            JOptionPane.showMessageDialog(this, "Llene todos los campos solicitados");
        }else{
            if (opcion.equals("Rector")) {
                Rector rector = controladorRector.iniciarSesion(correo, password);
                if (rector != null) {
                    
                    ventanaPrincipal.getMenuItemAbrirCurso().setVisible(true);
                    ventanaPrincipal.getMenuItemCerrarSesion().setVisible(true);
                    ventanaPrincipal.getMenuItemRegistrarDocente().setVisible(true);
                    
                    JOptionPane.showMessageDialog(this, "¡Sesion iniciada con exito! Bienvenido Rector:"+rector.getNombre());
                    limpiar();
                    ventanaPrincipal.getMenuItemIniciarSesion().setVisible(false);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado. Intentelo otra vez");
                }
            }else{
                Docente docente= controladorDocente.iniciarSesion(correo, password);
                if (docente != null) {
                    System.out.println();
                    //ventanaRegistraEstudiante.getDocente(docente);

                    ventanaPrincipal.getMenuItemCrearActividad().setVisible(true);
                    ventanaPrincipal.getMenuItemCerrarSesion().setVisible(true);
                    ventanaPrincipal.getMenuItemRegistrarAlumno().setVisible(true);

                    JOptionPane.showMessageDialog(this, "¡Sesion iniciada con exito! Bienvenido Docente:"+docente.getApellido());
                    limpiar();
                    ventanaPrincipal.getMenuItemIniciarSesion().setVisible(false);
                    this.setVisible(false);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario no encontrado. Intentelo otra vez");
                }
            }
        }

    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cbxOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
