/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Datos.Lecturatxt;
import Entidad.Matricula;
import java.util.List;
import javax.swing.JOptionPane;

public class MatriculaPjo {
    public boolean buscarMatriculaPorDni(String dniBuscado) {
        Lecturatxt leer=new Lecturatxt();
        
    for (Matricula matricula : leer.leerMatricula()) {
        if (matricula.getDni().equals(dniBuscado)) {
            return true;
        }
    }
    JOptionPane.showMessageDialog(null, "La Matricula con DNI  no existe.", "Alerta", JOptionPane.WARNING_MESSAGE);
    return false;  // Retorna null si no se encuentra 
}
public String buscarNombreMatriculaPorDni(String dniBuscado) {
    Lecturatxt leer =new Lecturatxt();
    for (Matricula matricula : leer.leerMatricula()) {
        if (matricula.getDni().equals(dniBuscado)) {
            return matricula.getNombre();
        }
    }
    
    return null;  // Retorna null si no se encuentra 
}

}
