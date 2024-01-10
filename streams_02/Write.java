package it.streams_02;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.util.Optional;

public class Write implements IWriterAndReeader{


    @Override
    public void write(String s, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath)
                ){

            fileOutputStream.write(s.getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void read(String filePath) {

    }
}
