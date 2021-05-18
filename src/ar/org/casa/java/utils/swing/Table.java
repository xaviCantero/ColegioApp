package ar.org.casa.java.utils.swing;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table <E>{
    
    public void cargar(JTable tbl, List<E>list){
        if(tbl == null) return;
        //creo el modelo de tabla
        DefaultTableModel dtm = new DefaultTableModel();
        //le paso el modelo a tbl
        tbl.setModel(dtm);
        if(list == null || list.isEmpty()) return;
        //<E> generica. le asigo el primer elemento de la lista
        E e = list.get(0);
        //obtengo los campos declarados de la entidad e
        Field[] campos = e.getClass().getDeclaredFields();
        //recorro la lista de campos 
        //y el nombre de cada campo lo agrego a cada columna del dtm
        for(Field f:campos) dtm.addColumn(f.getName());
        
        //regurro la lista
        for(E ee:list){
            //asisgnamos los registros
            Object[] registro = new Object[campos.length];
            //recorremos cada columna 
            for(int a=0; a<campos.length;a++){
                //mediante cada numero de la columna, obtenemos el valor de cada campo declarado
                Field f = campos[a];
                //concatenamos "get" al campo declarado
                String metodo ="get"+f.getName().substring(0,1).toUpperCase()+
                        f.getName().substring(1);
                try {
                    //obtenemos cada registro en tiempo de ejecucion y ejecutando el objeto ee 
                    registro[a] = e.getClass().getMethod(metodo, null).invoke(ee, null);
                } catch (Exception ex) {ex.printStackTrace();}
            }
            // añadimos los registros al modelo de tabla
            dtm.addRow(registro);
        }
        
    }
}
