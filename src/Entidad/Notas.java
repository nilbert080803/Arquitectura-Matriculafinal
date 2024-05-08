
package Entidad;


public class Notas {
    String  dniMatricula;
    String nota1;
    String nota2;
    String nota3;
    String curso;

    public Notas(String dniMatricula, String nota1, String nota2, String nota3, String curso) {
        this.dniMatricula = dniMatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.curso = curso;
    }

    public String getDniMatricula() {
        return dniMatricula;
    }

    public void setDniMatricula(String dniMatricula) {
        this.dniMatricula = dniMatricula;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    
}
