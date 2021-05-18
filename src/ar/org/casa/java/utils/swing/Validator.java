package ar.org.casa.java.utils.swing;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validator {
    private JTextField txtF;
    
    public Validator(JTextField txtF){
        this.txtF = txtF;
    }
    
    //mensaje de error si no comple con las normas de el medodo length()
    private boolean error(String msj){
        txtF.requestFocus();
        JOptionPane.showMessageDialog(txtF, msj, " error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    //normas para limites de caracteres 
    public boolean length(int min, int max){
        if(txtF.getText().length()>=min 
                && txtF.getText().length() <= max) 
            return true;
        
        return error("El texto debe tener entre "+min+" y "+max+" caracteres.");
    }
    
    public boolean isInteger(){
        try {
            Integer.parseInt(txtF.getText());
            return true;
        } catch (Exception e) {return error("El valor debe ser un numero entero.");}
    }
    
    public boolean isInteger(int min, int max){
        if(!isInteger()) return false;
        int valor = Integer.parseInt(txtF.getText());
        if(valor >= min && valor <= max) return true;
        return error("El valor debe estar entre "+min+" y "+max);
    }
    
}
