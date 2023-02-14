package Entidades;

public class Persona {
/*
  Para que un atributo y/o método puedan ser heredados, es necesario
  que su visibilidad sea "protected".
*/
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;

    public Persona(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
}
