/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion;

import Datos.Escrituratxt;
import Datos.Lecturatxt;
import Entidad.Notas;
import Logica.MatriculaPjo;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class RegistroNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelNotas;
    public RegistroNotas() {
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
        //validacion solo numeros y 8 digitos para dni
   txtDnimatricula.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        // Verifica si el carácter presionado es un dígito y si la longitud del texto no excede el límite
        if (!Character.isDigit(c) || txtDnimatricula.getText().length() >= 8) {
            // Consume el evento solo si se está agregando un nuevo carácter (no es una tecla de borrado)
            if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Por favor, ingresa solo 8 dígitos y solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
});
  // Para txtNota1
txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        String newText = txtNota1.getText() + c;
        // Verifica si se está agregando un nuevo carácter (no es una tecla de borrado)
        if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
            if (!newText.isEmpty()) {
                try {
                    int value = Integer.parseInt(newText);
                    // Verifica si el carácter presionado no es un dígito, si la longitud del texto excede 2 o si el valor excede 20
                    if (!Character.isDigit(c) || newText.length() > 2 || value > 20) {
                        evt.consume(); // Consume el evento si se presiona una tecla que no es un dígito, si la longitud del texto es mayor a 2 o si el valor excede 20
                        JOptionPane.showMessageDialog(null, "Por favor, el máximo de nota es 20.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    evt.consume(); // Consume el evento si no se puede convertir el texto a un número
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
});

// Para txtNota2
txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        String newText = txtNota2.getText() + c;
        // Verifica si se está agregando un nuevo carácter (no es una tecla de borrado)
        if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
            if (!newText.isEmpty()) {
                try {
                    int value = Integer.parseInt(newText);
                    // Verifica si el carácter presionado no es un dígito, si la longitud del texto excede 2 o si el valor excede 20
                    if (!Character.isDigit(c) || newText.length() > 2 || value > 20) {
                        evt.consume(); // Consume el evento si se presiona una tecla que no es un dígito, si la longitud del texto es mayor a 2 o si el valor excede 20
                        JOptionPane.showMessageDialog(null, "Por favor, el máximo de nota es 20.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    evt.consume(); // Consume el evento si no se puede convertir el texto a un número
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
});

// Para txtNota3
txtNota3.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        String newText = txtNota3.getText() + c;
        // Verifica si se está agregando un nuevo carácter (no es una tecla de borrado)
        if (!(Character.isISOControl(c) && (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))) {
            if (!newText.isEmpty()) {
                try {
                    int value = Integer.parseInt(newText);
                    // Verifica si el carácter presionado no es un dígito, si la longitud del texto excede 2 o si el valor excede 20
                    if (!Character.isDigit(c) || newText.length() > 2 || value > 20) {
                        evt.consume(); // Consume el evento si se presiona una tecla que no es un dígito, si la longitud del texto es mayor a 2 o si el valor excede 20
                        JOptionPane.showMessageDialog(null, "Por favor, el máximo de nota es 20.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    evt.consume(); // Consume el evento si no se puede convertir el texto a un número
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
});
    
        tablaDesing();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDnimatricula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNota3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(133, 170, 170));
        jPanel1.setPreferredSize(new java.awt.Dimension(725, 575));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nota 1:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Nota 2:");

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Nota 3:");

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("DNI:");

        tableNotas.setBackground(new java.awt.Color(204, 204, 204));
        tableNotas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableNotas);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("REGISTRO DE NOTAS");

        txtNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Promedio: ");

        txtPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromedioActionPerformed(evt);
            }
        });

        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDnimatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(112, 112, 112))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(108, 108, 108)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addComponent(txtCurso))
                                .addGap(108, 108, 108)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNota2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(txtPromedio)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDnimatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        MatriculaPjo matricula=new MatriculaPjo();
        if(matricula.buscarMatriculaPorDni(txtDnimatricula.getText())&&validarCamposVacios()&&validarNumeros(txtNota2)&&validarNumeros(txtDnimatricula)){
            Notas notas=new Notas(txtDnimatricula.getText(), txtNota1.getText(), txtNota2.getText(), txtNota3.getText(), txtCurso.getText());
        Escrituratxt escribir=new Escrituratxt();
        escribir.registrarNotas(notas);
        tablaDesing();
        limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2MousePressed

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    private void txtNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota3ActionPerformed

    private void txtPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromedioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void tablaDesing(){
        modelNotas = new DefaultTableModel(new Object[]{"Matriculado", "Nota 1", "Nota 2","Nota 3","Curso","Promedio"}, 0);
        tableNotas.setModel(modelNotas);
        cargarDatos();
        
    }
    private void cargarDatos() {
        Lecturatxt leer=new Lecturatxt();
        MatriculaPjo matricula=new MatriculaPjo();
        List<Notas> listaNotas = leer.leerNotas();
       
        for (Notas notas : listaNotas) {
            double promedio = calcularPromedio(notas.getNota1(), notas.getNota2(), notas.getNota3());
            modelNotas.addRow(new Object[]{matricula.buscarNombreMatriculaPorDni(notas.getDniMatricula()), notas.getNota1(), notas.getNota2(), notas.getNota3(),notas.getCurso() ,promedio});
        }
    }
    private double calcularPromedio(String nota1, String nota2, String nota3) {
    double n1 = Double.parseDouble(nota1);
    double n2 = Double.parseDouble(nota2);
    double n3 = Double.parseDouble(nota3);
    return (n1 + n2 + n3) / 3;
}
    private void limpiarCampos(){
        txtNota3.setText("");
        txtDnimatricula.setText("");
        txtNota2.setText("");
        txtNota1.setText("");
        txtPromedio.setText("");
        txtCurso.setText("");
    }
    private boolean validarCamposVacios() {
    boolean camposVacios = false;
    
    // Aquí añade todos tus JTextField que quieres validar
    JTextField[] campos = {txtDnimatricula, txtNota2, txtNota1, txtNota3,txtCurso}; // Asume que tienes estos campos definidos
    
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
    private boolean validarNumeros(JTextField textField) {
    String texto = textField.getText().trim(); // Obtener el texto del JTextField y eliminar espacios en blanco
    
    // Verificar si el texto contiene solo números
    if (texto.matches("\\d+")) { // El patrón "\\d+" verifica que el texto contenga solo dígitos
        return true; // El texto contiene solo números
    } else {
        return false; // El texto contiene caracteres que no son números
    }
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableNotas;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDnimatricula;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
