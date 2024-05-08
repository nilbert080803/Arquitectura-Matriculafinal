
package Datos;

import Entidad.Matricula;
import Entidad.Notas;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecturatxt {
    public List<Matricula> leerMatricula() {
        List<Matricula> listaMatricula = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("matricula.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Matricula matricula = new Matricula(datos[0], datos[1], datos[2], datos[3], datos[4]);
                listaMatricula.add(matricula);
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo " + "matricula.txt");
        }

        return listaMatricula;
    }

  public List<Notas> leerNotas() {
    List<Notas> listaNotasTemp = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            
            if (datos.length >= 5) {
                Notas notas = new Notas(datos[0], datos[1], datos[2], datos[3], datos[4]);
                listaNotasTemp.add(notas);
            } else {
                System.out.println("La línea: " + linea + " no tiene el formato correcto.");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al intentar leer el archivo " + "notas.txt");
    }

    return listaNotasTemp;
}
}
