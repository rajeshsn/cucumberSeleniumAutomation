package com.rajesh.automationframework.main;

import com.rajesh.automationframework.core.DatFileUtility;
import com.rajesh.automationframework.core.Replacement;

public class TestMain {

    public static void main(String[] args) throws Exception {
        DatFileUtility datFileUtility = new DatFileUtility();

        datFileUtility.readDatFile();
        datFileUtility.writeDatFile();

       /* Replacement replacement = new Replacement();
        replacement.replace();*/
    }
}
