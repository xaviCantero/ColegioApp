package ar.org.casa.java.entities;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int idCurso;
    
    public Alumno(){}
    
    public Alumno(String nombre, String apellido, int edad, int idCurso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idCurso = idCurso;
    }
    
    public Alumno(int id, String nombre, String apellido, int edad, int idCurso){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this. edad = edad;
        this.idCurso = idCurso;
    }
    
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    
    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido = apellido;}
    
    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}
    
    public  int getIdCurso(){return idCurso;}
    public void setIdCurso(int idCurso){this.idCurso = idCurso;}
    
    @Override
    public String toString(){
        return id+". Nombre:"+nombre+", Apellido:"+apellido+", Edad:"+edad+". IdCurso:"+idCurso;
    }
}
