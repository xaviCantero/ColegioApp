package ar.org.casa.java.utils.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Stream;

public class FileText implements I_File{
    private File file;
    
    public FileText(File file){
        this.file = file;
    }
    public FileText(String file){
        this.file = new File(file);
    }
    
    @Override
    public String getText() {
        int car;
        StringBuilder sb = new StringBuilder();
        try(FileReader in = new FileReader(file);){
            while((car=in.read())!=-1){
                sb.append((char)car);
            }
        }catch(Exception e){ e.printStackTrace();}
        return sb.toString();
    }

    @Override
    public void setText(String text) {
        try(FileWriter in = new FileWriter(file);){
            in.write(text);
        }catch(Exception e){e.printStackTrace();}
    }

    @Override
    public void addpend(String text) {
        try(FileWriter in = new FileWriter(file, true)){
            in.write(text);
        }catch(Exception e){e.printStackTrace();}
    }

    @Override
    public Stream<String> getStream() {
        try{
            return new BufferedReader(new FileReader(file)).lines();
        }catch(Exception e){return null;}
    }
    
}
