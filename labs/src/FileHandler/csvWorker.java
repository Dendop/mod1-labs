package FileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class csvWorker extends Worker implements csvHandler {
    @Override
    public void processFile(String fileName){
        readCsv(fileName);
        //this will overwrite existing contents
        //just for a practice logic
        writeCsv(fileName);
    }

    @Override
    public void readCsv(String fileName) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            //using line by line in case big file
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void writeCsv(String fileName) {
        String txt = "This text to file";
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(txt);
            bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
