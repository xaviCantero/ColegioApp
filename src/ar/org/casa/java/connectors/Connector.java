package ar.org.casa.java.connectors;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    //rootxavi 12341234 colegioapp
    private static String driver = "com.mysql.cj.jdbc.Driver"; 
    private static String vendor = "mysql";
    private static String server = "localhost";
    //private static String server = "db4free.net";
    private static String port = "3306";
    private static String db = "colegio";
    //private static String db = "colegioapp";
    private static String params = "";
    private static String user = "root";
    //private static String user = "rootxavi";
    private static String pass = "1234";
    //private static String pass = "12341234";
    
    private static String url = "jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;
    
    private static Connection conn = null;
    
    private Connector(){}
    
    public synchronized static Connection getConnection(){
        try{
            if(conn == null || conn.isClosed()){
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
            }
        }catch(Exception e){e.printStackTrace();}
        return conn;
    }
    
}
