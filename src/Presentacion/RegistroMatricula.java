/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion;

import Datos.Escrituratxt;
import Datos.Lecturatxt;
import Entidad.Matricula;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class RegistroMatricula extends javax.swing.JInternalFrame {

    /**
     * Creates new form MatriculaFrame
     */
    private DefaultTableModel model;
    public RegistroMatricula() {
        try {
            // Establecer el aspecto visual de JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            //com.jtattoo.plaf.aluminium.AluminiumLookAndFeel
            //com.jtattoo.plaf.noire.NoireLookAndFeel
            //com.jtattoo.plaf.aero.AeroLookAndFeel
            //com.jtattoo.plaf.acryl.AcrylLookAndFeel
            //com.jtattoo.plaf.mcwin.McWinLookAndFeel
            // TextureLookAndFeel
            //com.jtattoo.plaf.bernstein.BernsteinLookAndFeel
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        initComponents();
        tabladessing();
    txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
         if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {

            evt.consume(); // Consume el evento si se presiona una tecla numérica
            JOptionPane.showMessageDialog(null, "Por favor, ingresa solo letras en el campo Nombre.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }}
});
    txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        // Verifica si el carácter presionado es un dígito y si la longitud del texto no excede el límite
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            // Consume el evento solo si se está agregando un nuevo carácter (no es una tecla de borrado)
            if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Por favor, ingresa solo 8 dígitos y solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
});
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtCelular.getText().length() >= 9) {
             // Consume el evento solo si se está agregando un nuevo carácter (no es una tecla de borrado)
            if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
             
            evt.consume(); // Consume el evento si se presiona una tecla que no es un dígito o si la longitud del texto es mayor o igual a 9
            JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números en el campo Celular y asegúrate de que tenga 9 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
        }}
    }
});
    txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtEdad.getText().length() >= 3) {
              // Consume el evento solo si se está agregando un nuevo carácter (no es una tecla de borrado)
            if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
            evt.consume(); // Consume el evento si se presiona una tecla que no es un dígito o si la longitud del texto es mayor o igual a 3
            JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números en el campo Edad y asegúrate de que tenga como máximo 3 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }}
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatricula = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(133, 170, 170));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Edad:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Dirección:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        tableMatricula.setBackground(new java.awt.Color(204, 204, 204));
        tableMatricula.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tableMatricula.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMatricula);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("REGISTRO DE MATRÍCULA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(268, 268, 268)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDireccion))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(291, 291, 291))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(92, 92, 92))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
    if(validarCamposVacios() && validarLetras(txtNombre) && validarNumeros(txtEdad) && validarNumeros(txtCelular) && validarNumeros(txtDni) && validarDni(txtDni) && validarCelular(txtCelular)) {
        Escrituratxt escribir=new Escrituratxt();
        Matricula matricula=new Matricula(txtNombre.getText(), txtCelular.getText(), txtEdad.getText(), txtDireccion.getText(), txtDni.getText());
        escribir.registrarMatricula(matricula);
        tabladessing();
        limpiarCampos();
    }      
}                                    
 private boolean validarLetras(JTextField textField) {
    String texto = textField.getText().trim(); // Obtener el texto del JTextField y eliminar espacios en blanco
    
    // Verificar si el texto contiene solo letras
    return texto.matches("[a-zA-Z\\s]+"); // El patrón "[a-zA-Z\\s]+" verifica que el texto contenga solo letras y espacios
}
    private boolean validarNumeros(JTextField textField) {
    String texto = textField.getText().trim(); // Obtener el texto del JTextField y eliminar espacios en blanco
   
    // Verificar si el texto contiene solo números
    if (texto.matches("\\d+")) { // El patrón "\\d+" verifica que el texto contenga solo dígitos
        System.out.println("Error: Por favor, ingresa solo números.");
        return true; // El texto contiene solo números
    } else {
        return false; // El texto contiene caracteres que no son números
    }
    }//GEN-LAST:event_jButton1MousePressed

  private boolean validarDni(JTextField txtDni) {
    String texto = txtDni.getText().trim(); // Obtener el texto del JTextField y eliminar espacios en blanco
    
    // Verificar si el texto tiene exactamente 8 caracteres
    if (texto.length() == 8) {
        return true; // El texto tiene exactamente 8 caracteres
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un DNI válido de 8 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false; // El texto no tiene 8 caracteres
    }
}
    private boolean validarCelular(JTextField textField) {
    String texto = textField.getText().trim(); // Obtener el texto del JTextField y eliminar espacios en blanco
    
    // Verificar si el texto tiene exactamente 9 caracteres
    if (texto.length() == 9) {
        return true; // El texto tiene exactamente 9 caracteres
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un número de celular válido de 9 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false; // El texto no tiene 9 caracteres
    }
}
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
                // TODO add your handling code here:
                
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tabladessing(){
        // Crear el modelo de la tabla
        model = new DefaultTableModel(new Object[]{"DNI", "Nombre", "Celular", "Edad", "Dirección"}, 0);
        tableMatricula.setModel(model);
        cargarDatos();

    }
    private void cargarDatos() {
        Lecturatxt leer  =new Lecturatxt();
        List<Matricula> listaMatricula = leer.leerMatricula();

        for (Matricula matricula : listaMatricula) {
            model.addRow(new Object[]{matricula.getDni(), matricula.getNombre(), matricula.getCelular(), matricula.getEdad(), matricula.getDireccion()});
        }
    }
    
    private void limpiarCampos(){
        txtCelular.setText("");
        txtDireccion.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtNombre.setText("");
    }
    private boolean validarCamposVacios() {
    boolean camposVacios = false;
    
    // Aquí añade todos tus JTextField que quieres validar
    JTextField[] campos = {txtCelular, txtDireccion, txtDni,txtEdad,txtNombre}; // Asume que tienes estos campos definidos
    
    for (JTextField campo : campos) {
        if (campo.getText().trim().isEmpty()) { // Comprueba si el texto está vacío o solo contiene espacios
            camposVacios = true;
            break; // Si encuentras un campo vacío, sales del bucle
        }
    }
    
    if (camposVacios) {
        JOptionPane.showMessageDialog(this, "Por favor, rellena todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
    }
    
    return !camposVacios; // Retorna true si todos los campos están llenos, false si hay algún campo vacío
}
     

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMatricula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
