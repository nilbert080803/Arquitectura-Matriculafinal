
package Datos;

import Entidad.Matricula;

import Entidad.Notas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrituratxt {
    public void registrarMatricula(Matricula matricula) {
    String rutaArchivo = "matricula.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo separados por comas
        writer.write(matricula.getNombre() + "," + matricula.getCelular() + "," + matricula.getEdad() + "," + matricula.getDireccion() + "," + matricula.getDni() + "\n");

        System.out.println("Registro guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
    public void registrarNotas(Notas notas) {
    // Ruta del archivo donde se guardarán los registros
    String rutaArchivo = "notas.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Calcular el promedio
        double nota1 = Double.parseDouble(notas.getNota1());
        double nota2 = Double.parseDouble(notas.getNota2());
        double nota3 = Double.parseDouble(notas.getNota3());
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Escribir los datos en el archivo separados por comas
        writer.write(notas.getDniMatricula() + "," + notas.getNota1() + "," + notas.getNota2() + "," + notas.getNota3() + "," + notas.getCurso() + "," + promedio + "\n");

        System.out.println("Registro de notas guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
}
