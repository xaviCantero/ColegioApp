package ar.org.casa.java.test;
import ar.org.casa.java.connectors.Connector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestConnector {
    public static void main(String[] args) throws Exception{
        //insertar a data base
        
        Connection conn = Connector.getConnection();
        String query = "insert into cursos(titulo,profesor,dia,turno) values('Java','Gomez','MARTES','TARDE')";
        Statement st = conn.createStatement();
        st.execute(query);
        
        //insertar a data base mas simple.
        Connector.getConnection()
                .createStatement()
                .execute("insert into cursos(titulo,profesor,dia,turno) values('HTML','Sosa','LUNES','NOCHE')");
        
        ResultSet rs = Connector.getConnection().createStatement().executeQuery("select * from cursos");
        while(rs.next()){
            System.out.println(
            rs.getInt("id")+", "+
            rs.getString("profesor")+", "+
            rs.getString("dia")+", "+
            rs.getString("turno")
            );
        }
                
                
    }
}
