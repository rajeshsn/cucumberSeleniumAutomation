package com.rajesh.automationframework.core;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DatFileUtility {
    ArrayList<String> lines = new ArrayList<String>();
    String line = null;
   String  srcFilePath = "C:\\Users\\Rajesh\\Desktop\\Agreement.dat";
    String  destFilePath = "C:\\Users\\Rajesh\\Desktop\\output.dat";

    public void readDatFile() throws Exception {
        try {
            File fileIn = new File(srcFilePath);
            FileInputStream fis = new FileInputStream(fileIn);
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            while ((line = br.readLine()) != null) {
                if (line.contains("12345")) {
                    line = line.replaceAll("12345", "Rajesh");
                    lines.add(line);
                }

            }
              br.close();

        } catch (Exception e1) {

            e1.printStackTrace();
        }
    }

        public void writeDatFile() throws IOException {

        File fileOut = new File(destFilePath);
        fileOut.createNewFile();
        FileOutputStream fos = new FileOutputStream(destFilePath);
        BufferedWriter out = new BufferedWriter(new FileWriter(destFilePath));
            //  out.write(lines.toString());
        for(String s : lines) {
            out.write(s);
        }
            out.flush();
            out.close();




    }


}
