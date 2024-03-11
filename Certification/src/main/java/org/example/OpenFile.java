package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    public String[] openFile(){
        StringBuilder sbFile = new StringBuilder();
        try {
            File file = new File("src/main/input.txt");
            FileReader fis = new FileReader(file);
            int data;
            while ((data = fis.read())!= -1){
                sbFile.append((char) data);
            }
            fis.close();
            String strFile = sbFile.toString();
            String[] dataArray = strFile.split(" ");
            return dataArray;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
