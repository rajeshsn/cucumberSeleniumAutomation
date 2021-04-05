package com.rajesh.automationframework.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Replacement {

    List<String> lines = new ArrayList<String>();


    public void replace(){
        try {
            FileReader fr = new FileReader("C:\\Users\\Rajesh\\Desktop\\Agreement.dat");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("C:\\Users\\Rajesh\\Desktop\\output.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = null;

            while((line=br.readLine()) != null) {
                line.replaceAll("javascript", "perl script"); //I also tried , line=line.replaceAll("javascript", "perl script");
                bw.write(line);
            }
        }
        catch(Exception ioe){}

    }
}
