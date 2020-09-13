/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Wolverine
 */
public class Notas {
    
    
        private String cedula;
        private String nota1;
        private String nota2;
        private String nota3;
        private String nota4;
    
        
        
        public Notas() {
        
        }



public Notas (String nota1, String nota2, String nota3, String nota4, String lsCedula) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.cedula = lsCedula;
        
        }

 public String getCedula() {
        return cedula;
        }

    public void setCedula(String cedula1) {
        this.cedula = cedula1;
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

    public String getNota4() {
        return nota4;
        }

    public void setNota4(String nota4) {
        this.nota4 = nota4;
        }


}
