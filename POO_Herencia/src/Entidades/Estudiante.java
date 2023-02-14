package Entidades;
/*
Al crear la nueva clase, en este caso Estudiante
podemos incluir la sentencia extends para que la clase herede de otra clase
sus atributos y métodos...
*/
public class Estudiante extends Persona{
    
    private int codigo;
    private String facultad;
        
    /* puede observarse que el constructor de la clase Estudiante, hace un
    llamado al constructor de la clase Persona, asignando los valores mediante
    la sentencia "super", de los atributos allí definidos (fila 18).
    */
    
    public Estudiante(int codigo, String facultad, int id, String nombre, String apellido, String correo) {
        super(id, nombre, apellido, correo);
        this.codigo = codigo;
        this.facultad = facultad;
    }    
}
