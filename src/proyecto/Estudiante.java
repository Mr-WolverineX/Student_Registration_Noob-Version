package proyecto;

public class Estudiante {
        private String nombre;
        private String apellido;
        private String cedula;
        private String edad;
        

    public Estudiante() {
        
        }
    
    public Estudiante(String nombre, String apellido, String cedula, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        }
    
    

    public String getNombre() {
        return nombre;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        }

    public String getApellido() {
        return apellido;
        }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        }

    public String getCedula() {
        return cedula;
        }

    public void setCedula(String cedula) {
        this.cedula = cedula;
        }

    public String getEdad() {
        return edad;
        }

    public void setEdad(String edad) {
        this.edad = edad;
        }
    

    
       
}
