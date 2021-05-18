package ar.org.casa.java.test;

import ar.org.casa.java.connectors.Connector;
import ar.org.casa.java.entities.Alumno;
import ar.org.casa.java.entities.Curso;
import ar.org.casa.java.enums.Dia;
import ar.org.casa.java.enums.Turno;
import ar.org.casa.java.repositories.interfaces.I_AlumnoRepository;
import ar.org.casa.java.repositories.interfaces.I_CursoRepository;
import ar.org.casa.java.repositories.jdbc.CursoRepository.AlumnoRepository;
import ar.org.casa.java.repositories.jdbc.CursoRepository.CursoRepository;

public class TestRepositories {
    public static void main(String[] args) {
        I_CursoRepository cr = new CursoRepository(Connector.getConnection());
        I_AlumnoRepository ar = new AlumnoRepository(Connector.getConnection());
        
        
        //Agregamos y guardamos registro
        Curso curso = new Curso("PHP", "Dieguez", Dia.VIERNES, Turno.MAÑANA);
        cr.save(curso);
        
        //System.out.println(curso);
        cr.save(new Curso("Java", "Rodolfo", Dia.LUNES, Turno.TARDE));
        cr.save(new Curso("Java", "Rodolfo", Dia.MIERCOLES, Turno.TARDE));
        cr.save(new Curso("DB", "Rebeca", Dia.VIERNES, Turno.MAÑANA));
        cr.save(new Curso("Java Scrip", "Rebeca", Dia.JUEVES, Turno.MAÑANA));
        cr.save(new Curso("Java Scrip", "Rebeca", Dia.MARTES, Turno.TARDE));
        
       
        //eliminar registro por id
        //cr.remove(cr.getById(6));
        
        //actualizar registro
        Curso curso1 = new Curso();
        curso1 = cr.getById(15);
        if(curso1!=null && curso1.getId()!=0){
        curso1.setProfesor("Pereyra");
        cr.update(curso1);
        }
        
        //buscar registro por id
        System.out.println(cr.getById(12));
        System.out.println("****");
        
        //todos los registros de curso
        cr.getAll().forEach(System.out::println);
        System.out.println("****");
        
        //buscar titulo por letra
        cr.getLikeTitulo("p").forEach(System.out::println);
        System.out.println("****");
        
        //buscar profesor por letra
        cr.getLikeTituloProfesor("", "di").forEach(System.out::println);
        
        //************
        
        //Agregamos y guardamos registro Alumnos
        /*Alumno alumno ;
        ar.save(new Alumno("Carlos", "Verutti", 40, 1));
        ar.save(new Alumno("Patricio", "Bolts", 23, 2));
        ar.save(new Alumno("Luiz", "Traps", 21, 1));
        ar.save(new Alumno("Luiz", "Ferguz", 32, 4));
        ar.save(new Alumno("Luiz", "Velez", 29, 5));
        ar.save(new Alumno("Luiz", "Tato", 19, 1));
        ar.save(new Alumno("Luiz", "Rodriguez", 18, 1));
        */
        //buscar por id
        System.out.println(ar.getById(1));
        
        //eliminamos registro de alumno
        //ar.remove(ar.getById(12));
        
        //actualizar registo alumno
        /*Alumno alumno1 = new Alumno();
        alumno1 = ar.getById(3);
            if(alumno1 !=null && alumno1.getId()!=0){
                alumno1.setApellido("Vergara");
                ar.update(alumno1);
        }*/
        
        //todos los registros de curso Alummnos
        ar.getAll().forEach(System.out::println);
        
        //buscar registro con letras 
        ar.getByLikeApellido("v").forEach(System.out::println);
        
        //buscar el id del curso del alumno
        ar.getByCurso(cr.getById(25)).forEach(System.out::println);
    }
}
